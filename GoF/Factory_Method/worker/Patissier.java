package worker;
import template.Cooker;
import template.Dish;
import worker.Cake;

public class Patissier extends Cooker{
  public Dish cooking(String order){
    return new Cake(order);
  }
  
  @Override
  protected void providing(Dish dish){
    System.out.println(dish.introduction() + "召し上がれ♡");
  }
}