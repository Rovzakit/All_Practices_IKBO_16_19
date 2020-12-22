package Numbers;

public class Creating implements Complex_Numbers_Factory {
    @Override
    public Complex_Number create() {
        double re = 3;
        double im = 2;
        return new Complex_Number(re,im);
    }
}
