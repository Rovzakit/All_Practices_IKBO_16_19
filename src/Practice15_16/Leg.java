package Practice15_16;

public class Leg extends Thread {

    public Leg(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while (true){
            step();
        }
    }

    synchronized void step(){
        System.out.println(this.getName());
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
