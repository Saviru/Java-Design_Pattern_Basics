package Decorator;

public class ConDec2 extends Decorator {
    public ConDec2(Component comp) {
        super(comp);
    }

    @Override
    public String getName() {
        return decoratedComponent.getName()+", D2";
    }

    @Override
    public int getSize() {
        return decoratedComponent.getSize()+1;
    }
}
