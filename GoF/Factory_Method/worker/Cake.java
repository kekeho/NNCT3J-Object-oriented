package worker;
import template.Dish;

public class Cake extends Dish{
  public Cake(String cakeType){
    setDishName(cakeType);
  }
  
  @Override
  public String introduction(){
    return getDishName() + "出来上がり!";
  }
}