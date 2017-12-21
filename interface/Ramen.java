
enum Taste
{
    しょうゆ,みそ
}
public abstract class Ramen
{
    protected int katasa;//1：固い，2:普通，3:柔い
    protected int men;//1-10
    protected Taste soup;
    protected String topping;
    Ramen()
    {
        System.out.println("ラーメンつくるよ");
    }
    public void setMen(int men)
    {
        this.men = men;
        System.out.println("量：" + men);
    }
    public void setKatasa(int katasa)
    {
        this.katasa = katasa;
        System.out.println("固さ：" + katasa);
    }
    public void setSoup(Taste taste)
    {
        this.soup = taste;
        System.out.println("スープ：" + this.soup);
    }
    public void checkRamen()
    {
        System.out.print("量：" + men);
        System.out.print("固さ：" + katasa);
        System.out.print("スープ：" + soup);
        System.out.println("トッピング：" + topping);
    }
    abstract public void setTopping();
}