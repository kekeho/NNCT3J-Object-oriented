public class Truck extends Car{
  private int nimotsu;
  Truck(){
    System.out.println("トラックを製造");
  }
  
  public void setNimotsu(int nimotsu){
    if (nimotsu > 300) {
      System.out.println("異常な荷物の数が指定されました。50個に設定します。");
      nimotsu = 50;
    }
    this.nimotsu = nimotsu;
    System.out.println("荷物の数:" + this.nimotsu);
  }
  
  @Override
  public void setSpeed(int speed){
    if(speed > 120 || speed < 40){
      System.out.println("異常な速度が指定されました。速度を80キロに設定します。");
      speed = 80;
    }
    this.speed = speed;
    System.out.println("時速:" + this.speed);
  }
  
  public void setGas(int gas){
    if (gas > 600) {
      System.out.println("異常な積載燃料が指定されました。積載燃料を30Lに設定します。");
      gas = 30;
    }
    this.gas = gas;
    System.out.println("現在の燃料:" + this.gas);
  }
  
  public void setNenpi(int nenpi){
    if (nenpi > 10 || nenpi < 2) {
      System.out.println("異常な燃費が指定されました。燃費を4km/Lに設定します。");
      nenpi = 4;
    }
    this.nenpi = nenpi;
    System.out.println("燃費:" + this.nenpi);
  }
  
  public int getNimotsu(){
    return nimotsu;
  }
}