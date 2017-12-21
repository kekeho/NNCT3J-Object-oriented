public class MisoRamen extends Ramen implements Spice
{
    MisoRamen()
    {
        System.out.println("みそラーメンを作るよ");
    }
    public void setTopping()
    {
        topping = "ニンニク";
        System.out.println("トッピング：" + topping);
    }
    public void setSpice()
    {
        System.out.println("香辛料：七味唐辛子");
    }
}