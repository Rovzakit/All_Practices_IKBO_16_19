package Numbers;

public class Complex_Number implements cmplx_Number {
    private double re;
    private double im;

    public Complex_Number(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public double getModule() {
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }

    public static Complex_Number sum(Complex_Number cn1, Complex_Number cn2) {
        return new Complex_Number(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm());
    }

    public static Complex_Number multiply(Complex_Number cn1, Complex_Number cn2) {
        return new Complex_Number(cn1.getRe() * cn2.getRe() - cn1.getIm() * cn2.getIm(), cn1.getRe() * cn2.getIm() + cn1.getIm() * cn2.getRe());
    }

    public static Complex_Number subtract(Complex_Number cn1, Complex_Number cn2) {
        return new Complex_Number(cn1.getRe() - cn2.getRe(), cn1.getIm() - cn2.getIm());
    }

    public static Complex_Number divide(Complex_Number cn1, Complex_Number cn2) {
        Complex_Number temp = new Complex_Number(cn2.getRe(), (-1) * cn2.getIm());
        temp = Complex_Number.multiply(cn1, temp);
        double denominator = cn2.getRe() * cn2.getRe() + cn2.getIm() * cn2.getIm();
        return new Complex_Number(temp.getRe() / denominator, temp.getIm() / denominator);
    }


    public String sign() {
        if (im > 0) return " + ";
        else return " - ";
    }

    @Override
    public String toString() {
        String string;
        if (im == 1 || im == -1) {
            if (re == 0) {
                string = sign() + "i";
            } else {
                string = Double.toString(re) + sign() + "i";
            }
        } else {
            string = Double.toString(re) + sign() + Double.toString(Math.abs(im)) + "i";
        }
        return string;
    }
}
