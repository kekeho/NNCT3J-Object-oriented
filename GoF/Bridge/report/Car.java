public class Car{
    private Siren move;
    Car(Siren move){
        this.move = move;
    }
    public void forward(){
        move.forward();
    }
    public void back(){
        move.back();
    }
    public void turn(Boolean side){
        move.turn(side);
    }
}