package Strategy;

public class Concrete1 implements Strategy{
    @Override
    public void action(String act) {
        System.out.println("Concrete Strategy 1: "+act);
    }
}
