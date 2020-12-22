package Chair;

public class Multiple_Function_Chair implements Chair {
    public Multiple_Function_Chair() {
        System.out.println("У вас уже есть магический стул");
    }

    @Override
    public void sit() {

        System.out.println("Вы сели на мультифункцианальный стул");
    }
}
