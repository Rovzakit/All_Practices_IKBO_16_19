package Practice8;

public abstract class Furniture {
    public String mainMaterial = "wood";

    public void isInBox(boolean a){
        if(a){
            System.out.println("The furniture is in a box");
        }
        else{
            System.out.println("The furniture is not in a box");
        }
    }
}
