package template;
public abstract class Electronics{
  private String name;
  
  public String getName(){
    return name;
  }
  
  public void setName(String order){
    name = order;
  }
  
  public abstract String introduction();
}