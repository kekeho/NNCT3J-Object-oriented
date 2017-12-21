public class Main
{
    public static void main(String[] args)
    {
        System.out.println("===普通のチャーシューメン===");
        ChashuMen chashuMenNormal = new ChashuMen(2,5,Taste);
        chashuMenNormal.setChashu(5);
        chashuMenNormal.checkRamen();
    }
}