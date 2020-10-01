package ru.x5.work4.homework2;

public class Main {
    public static void main(String[] args) {
        Engine engineKamaz = new Engine(401.0,"Daimler");
        Lorry kamaz = new Lorry("KAMAZ-5490", "Грузовой", "7900", engineKamaz, 18600);
        kamaz.printInfo();
        kamaz.start();
        kamaz.stop();
        kamaz.turnLeft();
        kamaz.turnRight();
        Engine engineBmw = new Engine(184.0, "BMW");
        SportCar bmw = new SportCar("520i","Легковой","1500",engineBmw,"300");
        bmw.printInfo();
        bmw.start();
        bmw.stop();
        bmw.turnLeft();
        bmw.turnRight();
    }
}
