public class WaterFilter extends NormalWater implements CleanWater {
  @Override
  public int cleanWaterOut(){
    int output;
    output = normalWaterOut() / 50;
    return output;
  }
}