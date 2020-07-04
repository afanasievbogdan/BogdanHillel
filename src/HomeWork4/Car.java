package HomeWork4;

public class Car {
    private final int TANK_VOLUME = 40;
    private final double FUEL_LOST_PER_HUNDRED_KM = 9;
    private final int FUEL_COST = 25;

    private double tankBalance;

    public void setTankBalance(double tankBalance) {
        this.tankBalance = tankBalance;
    }

    public double getTankBalance() {
        return tankBalance;
    }

    public double calculateFillQuantity(){
        return TANK_VOLUME - tankBalance;
    }

    public void fillTank(){
        tankBalance = TANK_VOLUME;
    }

    public double fuelLost(int km){
        return FUEL_LOST_PER_HUNDRED_KM / 100 * km;
    }

    public void setRemainingFuel(int km){
        tankBalance -= fuelLost(km);
    }

    public double fuelCost(){
        return calculateFillQuantity() * FUEL_COST;
    }

}

class Main{

    public static void main(String[] args) {

        Car Nissan = new Car();
        double totalCost = 0;
        double totalFillQuantity = 0;
        Nissan.setTankBalance(20);
        System.out.println("\nНачальное количество топлива в баке было " + Nissan.getTankBalance() + " литров");

        Nissan.setRemainingFuel(180);
        System.out.println("Затем машина проехала 180 км по трассе Одесса - Кривое Озеро");

        System.out.printf("В баке осталось %.1f литров топлива\n", Nissan.getTankBalance());

        System.out.printf("Было принято решение запрвить полный бак. Заправили %.1f литров, стоимостью %.1f\n", Nissan.calculateFillQuantity(), Nissan.fuelCost());
        totalFillQuantity += Nissan.calculateFillQuantity();
        totalCost += Nissan.fuelCost();
        Nissan.fillTank();
        System.out.println("Теперь в баке " + Nissan.getTankBalance());

        System.out.println("\n===========================================\n");

        Nissan.setRemainingFuel(150);
        System.out.println("Затем машина проехала 150 км по трассе Кривое Озеро - Жашков");

        System.out.printf("В баке осталось %.1f литров топлива\n", Nissan.getTankBalance());

        System.out.printf("Было принято решение запрвить полный бак. Заправили %.1f литров, стоимостью %.1f\n", Nissan.calculateFillQuantity(), Nissan.fuelCost());
        totalFillQuantity += Nissan.calculateFillQuantity();
        totalCost += Nissan.fuelCost();
        Nissan.fillTank();
        System.out.println("Теперь в баке " + Nissan.getTankBalance());

        System.out.println("\n===========================================\n");

        Nissan.setRemainingFuel(145);
        System.out.println("Затем машина проехала 145 км по трассе Жашков - Киев");
        System.out.printf("\nВ конце поездки в баке осталось %.1f литров топлива\n", Nissan.getTankBalance());
        System.out.println("\nОбщее количество заправленого топлива составило " + totalFillQuantity);
        System.out.println("Общая стоимость поездки составила " + totalCost);

    }

}

//    Создать класс машина с полями
//
//        объем бака
//        остаток в баке
//        расход топлива на 100 км
//        создать методы:
//
//        залить полный бак с учетом объема остатка
//        определить остаток топлива по преодолении N км
//        определить сколько надо дозаправить топлива при преодолении N км
//
//
//        в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
//
//        + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков

        // Одесса - Кривое Озеро 180 км
        // Кривое Озеро - Жашков 150 км
        // Жашков - Киев 145 км

//
//        + сколько будет стоить полная поездка
//
//        + остаток топлива в пункте назначения