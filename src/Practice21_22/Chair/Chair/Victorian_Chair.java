package Chair;

public class Victorian_Chair implements Chair {
    public Victorian_Chair() {
        System.out.println("У вас уже есть викторианский стул");
    }

    @Override
    public void sit() {
        System.out.println("Вы сели на викторианский стул");
    }
}
