package worker;
import template.Cooker;
import template.Dish;

public class SushiSyokunin extends Cooker{
  public Dish cooking(String order){
    return new Sushi(order);
  }
  
  @Override
  protected void providing(Dish dish){
    System.out.println(dish.introduction() + "食ってくんな!");
  }
}