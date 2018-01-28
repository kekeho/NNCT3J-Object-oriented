public class FireSiren extends Siren{
    @Override
    public void forward(){
        System.out.println("ウーカンカン");
    }
    @Override
    public void back(){
        System.out.println("ウーカンカン「バックします」");
    }
    @Override
    public void turn(Boolean side){
        if(side){
            System.out.println("ウーカンカン 「右に曲がります」");
        }
        else{
            System.out.println("ウーカンカン「左に曲がります」");
        }
    }
}