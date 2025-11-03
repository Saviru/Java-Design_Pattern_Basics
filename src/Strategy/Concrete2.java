package Strategy;

public class Concrete2 implements Strategy {
    @Override
    public void action(String act) {
        System.out.println("Concrete Strategy 2: "+act);
    }
}
