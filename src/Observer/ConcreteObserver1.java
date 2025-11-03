package Observer;

public class ConcreteObserver1 implements Observer{
    private String msg;

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }

    private void display() {
        System.out.println("Message Updated1 - "+ msg);
    }
}
