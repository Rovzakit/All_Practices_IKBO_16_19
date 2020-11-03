package Practice7;

public class Main7 {
    public static void main(String[] args) {
        Fork frk = new Fork();
        frk.setClear(true);
        frk.material = "metal";
        System.out.println(frk.material);
        frk.stingSomething("steak");

        Plate plt = new Plate();
        plt.isPainted = false;
        plt.laySomething("potato");

        German_Shepherd dgOne = new German_Shepherd();
        dgOne.furColor = "black brown";
        dgOne.bark();

        Siberian_Husky dgTwo = new Siberian_Husky();
        dgOne.furColor = "black white";
        dgTwo.lie();
    }
}