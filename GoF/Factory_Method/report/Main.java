import template.ElectronicsFactory;
import worker.FridgeFactory;
import worker.TVFactory;

public class Main{
  public static void main(String[] args) {    
    ElectronicsFactory tv_factory = new TVFactory();
    tv_factory.working("REGZA");
    
    ElectronicsFactory fridge_factory = new FridgeFactory();
    fridge_factory.working("Vegeta");
  }
}