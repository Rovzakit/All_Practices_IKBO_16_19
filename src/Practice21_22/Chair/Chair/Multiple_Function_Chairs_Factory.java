package Chair;

public class Multiple_Function_Chairs_Factory implements Factory {
    @Override
    public Chair createChair() {
        return new Multiple_Function_Chair();
    }
}
