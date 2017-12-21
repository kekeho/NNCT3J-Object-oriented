public class Main{
    public static void main(String args[]){
        System.out.println("===トラック===");
        Truck hino2ton = new Truck();
        hino2ton.setGas(200);
        hino2ton.setDoor(2);
        hino2ton.setTire(6);
        hino2ton.setNenpi(4);
        hino2ton.setSpeed(100);
        hino2ton.setNimotsu(50);
        hino2ton.drive();
        hino2ton.drive();
        hino2ton.drive();
        hino2ton.drive();
        System.out.println("===救急車===");
        Ambulance kyukyu = new Ambulance();
        kyukyu.setDoor(3);
        kyukyu.setSpeed(500);
        kyukyu.setTire(4);
        kyukyu.setGas(100);
        kyukyu.setNenpi(5);
        kyukyu.callSiren();
        System.out.println("===パトカー===");
        PatrolCar patrol = new PatrolCar();
        patrol.setDoor(4);
        patrol.setTire(4);
        patrol.setSpeed(200);
        patrol.setGas(40);
        patrol.setNenpi(20);
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
    }
}