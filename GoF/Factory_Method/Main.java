import template.Cooker;
import worker.SushiSyokunin;

public class Main{
  public static void main(String[] args) {
    Cooker SushiSyokunin = new SushiSyokunin();
    SushiSyokunin.working("トロ");
    SushiSyokunin.working("マグロ");
  }
}