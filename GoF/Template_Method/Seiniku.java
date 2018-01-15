public class Seiniku extends MarketJob{
  Seiniku(){
    System.out.println("==精肉担当になった==");
  }
  
  @Override
  public void cut(){
    System.out.println("肉を切るよ");
  }
  public void put(){
    System.out.println("トレイに置くよ");
  }
  public void pack(){
    System.out.println("ラップでパックするよ");
  }
  
}