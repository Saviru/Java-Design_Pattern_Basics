package Observer;

public class ConcreteObserver2 implements Observer{
    private String msg;

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }

    private void display() {
        System.out.println("Message Updated2 - "+ msg);
    }
}
