class PatrolCar extends Car implements Siren {
  PatrolCar(){
    System.out.println("パトロールカーを製造");
  }
  
  public void callSiren(){
    System.out.println("ファンファンファン");
  }
  
  @Override
  public void setSpeed(int speed){
    //最新の覆面パトカーは260km出るそうな
    if(speed > 260 || speed < 40){
      System.out.println("異常な速度が指定されました。速度を80キロに設定します。");
      speed = 80;
    }
    this.speed = speed;
    System.out.println("時速:" + this.speed);
  }
  
  public void setGas(int gas){
    if (gas > 100) {
      System.out.println("異常な積載燃料が指定されました。積載燃料を50Lに設定します。");
      gas = 50;
    }
    this.gas = gas;
    System.out.println("現在の燃料:" + this.gas);
  }
  
  public void setNenpi(int nenpi){
    if (nenpi > 30 || nenpi < 10) {
      System.out.println("異常な燃費が指定されました。燃費を15km/Lに設定します。");
      nenpi = 15;
    }
    this.nenpi = nenpi;
    System.out.println("燃費:" + this.nenpi);
  }
}