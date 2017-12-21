public class ChashuMen extends Ramen
{
    private int chashu;
    ChashuMen()
    {
        System.out.println("チャーシューメン作るよ");
    }
    ChashuMen(int men, int katasa, Taste taste)
    {
        super(men,katasa,taste);
        System.out.println("指定済みのチャーシューメン作るよ");
    }
    public void setChashu(int chashu)
    {
        this.chashu = chashu;
        System.out.println("チャーシュー：" + chashu);
    }
    public void checkChashuMen()
    {
        System.out.print("チャーシュー：" + chashu);
        if(soup != Taste.しょうゆ)
        {
            System.out.println("\nしょうゆ味でないチャーシューメンはチャーシューメンではない！");
            System.out.println("しょうゆ味に変えます！");
            soup = Taste.しょうゆ;
        }
    }
}