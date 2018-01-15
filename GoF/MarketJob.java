abstract public class MarketJob{
  abstract public void cut();
  abstract public void put();
  abstract public void pack();
  //これがテンプレートメソッド
  public void working(){
    cut();
    put();
    pack();
  }
}