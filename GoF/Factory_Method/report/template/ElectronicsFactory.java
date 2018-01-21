package template;

public abstract class ElectronicsFactory{
  protected abstract Electronics making(String order);
  protected abstract void providing(Electronics electronics);
  
  public void working(String order){
    Electronics electronics = making(order);
    providing(electronics);
  }
}