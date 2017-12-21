public class Main
{
    public static void main(String[] args)
    {
        //担々麺
        System.out.println("===担々麺===");
        TantanMen tantan = new TantanMen();
        tantan.setKatasa(5);
        tantan.setMen(2);
        tantan.setSoup(Taste.みそ);
        tantan.setTopping();
        tantan.setSpice();
        tantan.setLiquid();
        tantan.checkRamen();
    }
}