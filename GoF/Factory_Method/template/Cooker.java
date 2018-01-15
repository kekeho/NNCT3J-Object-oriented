package template;

public abstract class Cooker{
  protected abstract Dish cooking(String order);
  protected abstract void providing(Dish dish);
  
  public void working(String order){
    Dish dish = cooking(order);
    providing(dish);
  }
}