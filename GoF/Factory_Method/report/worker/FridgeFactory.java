package worker;
import template.ElectronicsFactory;
import template.Electronics;
import worker.Fridge;

public class FridgeFactory extends ElectronicsFactory{
  public Electronics making(String order){
    return new Fridge(order);
  }
  
  @Override
  protected void providing(Electronics electronics){
    System.out.println(electronics.introduction() + "で快適な生活を。");
  }
}