public class Ambulance extends Car implements Siren {
  Ambulance(){
    System.out.println("救急車を製造");
  }
  
  public void callSiren(){
    System.out.println("ピーポーピーポー");
  }
  
  public void setGas(int gas){
    if (gas > 120) {
      System.out.println("異常な積載燃料が指定されました。積載燃料を80Lに設定します。");
      gas = 80;
    }
    this.gas = gas;
    System.out.println("現在の燃料:" + this.gas);
  }
  
  public void setNenpi(int nenpi){
    if (nenpi > 10 || nenpi < 2) {
      System.out.println("異常な燃費が指定されました。燃費を5km/Lに設定します。");
      nenpi = 5;
    }
    this.nenpi = nenpi;
    System.out.println("燃費:" + this.nenpi);
  }
}

