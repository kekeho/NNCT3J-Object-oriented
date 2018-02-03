public class Main{
    public static void main(String[] args){
        NormalWater normal_water = new NormalWater();
        CleanWater filter = new WaterFilter(normal_water); //パチもん浄水器(ただのアダプタ)によりCleanWaterブランドが付く。
        System.out.println("含まれている不純物: " + filter.clean() + "[%]");
        System.out.println("あれっ。キレイになってないぞ。ブランドだけの使えない浄水器じゃないか。");
        System.out.println("まあ、Adapterだから水の質が変わるわけないよな。\n検査しなきゃ水の質なんてわかんないし、ブランドが付くから心理浄水器だねhahaha");
    }
}