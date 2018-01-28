public class FireCar extends Car
{
    FireCar(Siren move)
    {
        super(move);
    }
    public void back()
    {
        System.out.print("ピーッピーッ");
        super.back();
    }
}