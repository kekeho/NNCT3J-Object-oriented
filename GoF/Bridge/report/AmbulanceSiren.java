public class AmbulanceSiren extends Siren{
    @Override
    public void forward(){
        System.out.println("ピーポー「前進します。どいてください。ご協力ありがとうございます」");
    }
    @Override
    public void back(){
        System.out.println("ピーポー「バックします。どいてください。ご協力ありがとうございます」");
    }
    @Override
    public void turn(Boolean side){
        if(side){
            System.out.println("ピーポー「右に曲がります。どいてください。ご協力ありがとうございます。」");
        }
        else{
            System.out.println("ピーポー「左に曲がります。どいてください。ご協力ありがとうございます。」");
        }
    }
}