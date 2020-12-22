package Chair;

public class Victorian_Chairs_Factory implements Factory {
    @Override
    public Chair createChair() {
        return new Victorian_Chair();
    }
}
