public class WaterFilter extends CleanWater{
    private NormalWater n_water;
    WaterFilter(NormalWater n_water){
        this.n_water = n_water;
    }
    @Override
    public double clean(){
        return n_water.waterOutput();
    }
}