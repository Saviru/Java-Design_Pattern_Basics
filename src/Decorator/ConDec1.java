package Decorator;

public class ConDec1 extends Decorator{
    public ConDec1(Component comp) {
        super(comp);
    }

    @Override
    public String getName() {
        return decoratedComponent.getName()+", D1";
    }

    @Override
    public int getSize() {
        return decoratedComponent.getSize()+1;
    }
}
