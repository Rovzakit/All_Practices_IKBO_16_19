package Chair;

public class Magic_Chairs_Factory implements Factory{
    @Override
    public Chair createChair(){
        return new Magic_Chair();
    }
}
