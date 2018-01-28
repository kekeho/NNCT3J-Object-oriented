public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-----消防車を作ります-----");
        Car fire = new FireCar(new FireSiren());
        fire.back();
        fire.forward();
        fire.turn(false);
        System.out.println("-----救急車を作ります-----");
        Car amb = new AmbulanceCar(new AmbulanceSiren());
        amb.forward();
        amb.turn(true);
        amb.back();
    }
}