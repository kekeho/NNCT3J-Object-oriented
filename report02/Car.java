public abstract class Car {
  protected int speed;
  protected int tire;
  protected int door;
  protected int gas;
  protected int nenpi;
  
  Car(){
    this(100, 5, 4);
  }
  Car(int speed, int door, int tire){
    this.speed = speed;
    this.door = door;
    this.tire = tire;
    System.out.println("車を製造");
  }
  
  
  public void setSpeed(int speed){
    if(speed > 180 || speed < 40){
      System.out.println("異常な速度が指定されました。速度を50キロに設定します。");
      speed = 50;
    }
    this.speed = speed;
    System.out.println("時速:" + this.speed);
  }
  
  public void setTire(int tire){
    if(tire > 5 || tire < 3){
      System.out.println("異常なタイヤの数が指定されました。タイヤを4つに設定します。");
      tire = 4;
    }
    this.tire = tire;
    System.out.println("タイヤ:" + this.tire);
  }
  
  public void setDoor(int door){
    if (door > 5 || door < 1) {
      System.out.println("異常なドアの数が指定されました。タイヤを4つに設定します。");
    }
    this.door = door;
    System.out.println("ドア" + this.door);
  }
  public abstract void setGas(int gas);
  public abstract void setNenpi(int nenpi);
  
  public void drive(){
    if(0 >= getGas()){
      System.out.println("ガス欠です");
    } else {
      //これからのスタンダードはハイブリッドや電気自動車であると考えられ、本プログラムは将来を見据えた設計とした
      System.out.print("ｷｨｰﾝ☆ c");
      setGas(getGas() - getNempi());
    }
  }
  
  public int getSpeed(){
    return speed;
  }
  
  public int getDoor(){
    return door;
  }
  
  public int getGas(){
    return gas;
  }
  
  public int getNempi(){
    return nenpi;
  }
  
  public int getTire(){
    return tire;
  }
}

