public class Main {
  public static void main(String[] args) {
    CleanWater filter = new WaterFilter();
    System.out.println("含まれている不純物: " + filter.cleanWaterOut() + "[%]");
    System.out.println("きれいになりました。");
  }
}