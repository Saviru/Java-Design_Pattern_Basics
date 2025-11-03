package Decorator;

public class ConcreteComponent implements Component {
    @Override
    public String getName() {
        return "Component1";
    }

    @Override
    public int getSize() {
        return 1;
    }
}
