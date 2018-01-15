package worker;
import template.Dish;

public class Sushi extends Dish{
  public Sushi(String sushiType){
    setDishName(sushiType);
  }
  
  @Override
  public String introduction(){
    return getDishName() + "一丁!";
  }
}