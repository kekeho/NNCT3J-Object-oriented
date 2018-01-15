public class Seika extends MarketJob{
  Seika(){
    System.out.println("===青果担当になった===");
  }
  @Override
  public void cut(){
    System.out.println("野菜を切るよ");
  }
  @Override
  public void put(){
    
  }
  @Override
  public void pack(){
    System.out.println("野菜をラップでパックするよ");
  }
}