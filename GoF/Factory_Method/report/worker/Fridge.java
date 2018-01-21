package worker;
import template.Electronics;

public class Fridge extends Electronics{
  public Fridge(String fridge_name){
    setName(fridge_name);
  }
  
  @Override
  public String introduction(){
    return getName();
  }
}