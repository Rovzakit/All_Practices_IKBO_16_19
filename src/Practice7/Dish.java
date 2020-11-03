package Practice7;

public abstract class Dish {
    public String material = "ceramic";
    private boolean clean = false;

    public boolean getClear(){ return clean; }

    public void setClear(boolean clear){ clean = clear; }
}
