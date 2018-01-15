public class Sengyo extends MarketJob{
  Sengyo(){
    System.out.println("===鮮魚担当になった===");
  }
  @Override
  public void cut(){
    System.out.println("刺身を切るよ");
  }
  @Override
  public void put(){
    System.out.println("トレイに置くよ");
    System.out.println("タンポポを置くよ");
  }
  @Override
  public void pack(){
    System.out.println("ラップでパックするよ");
  }
}