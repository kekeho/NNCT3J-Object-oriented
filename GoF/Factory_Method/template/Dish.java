package template;
public abstract class Dish{
  private String dishName;
  
  public String getDishName(){
    return dishName;
  }
  
  public void setDishName(String order){
    dishName = order;
  }
  
  public abstract String introduction();
}