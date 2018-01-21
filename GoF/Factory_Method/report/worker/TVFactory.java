package worker;
import template.ElectronicsFactory;
import template.Electronics;
import worker.TV;

public class TVFactory extends ElectronicsFactory{
  public Electronics making(String order){
    return new TV(order);
  }
  
  @Override
  protected void providing(Electronics electronics){
    System.out.println(electronics.introduction() + "で美しい映像体験を");
  }
}