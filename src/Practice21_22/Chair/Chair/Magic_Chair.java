package Chair;

public class Magic_Chair implements Chair{
    public Magic_Chair() {
        System.out.println("У вас уже есть магический стул");
    }

    @Override
    public void sit() {
        System.out.println("Вы сели на магический стул");
    }
}
