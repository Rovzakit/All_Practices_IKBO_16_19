package Practice8;

public class Lamp extends Furniture {
    public String color = "yellow";

    public void isTurnedOn(boolean a){
        if(a){
            System.out.println("The lamp is tuned on");
        }
        else{
            System.out.println("The lamp is tuned off");
        }
    }
}
