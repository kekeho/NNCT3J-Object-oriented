import template.Cooker;
import worker.SushiSyokunin;
import worker.Patissier;

public class Main{
  public static void main(String[] args) {
    Cooker SushiSyokunin = new SushiSyokunin();
    SushiSyokunin.working("トロ");
    SushiSyokunin.working("マグロ");
    
    Cooker Patissier = new Patissier();
    Patissier.working("モンブラン");
  }
}