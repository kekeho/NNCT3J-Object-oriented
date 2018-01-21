package worker;
import template.Electronics;

public class TV extends Electronics{
  public TV(String tv_name){
    setName(tv_name);
  }
  
  @Override
  public String introduction(){
    return getName();
  }
}