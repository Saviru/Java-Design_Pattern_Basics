package Decorator;

public abstract class Decorator implements Component {
    protected Component decoratedComponent;

    public Decorator(Component comp) {
        this.decoratedComponent = comp;
    }

    @Override
    public String getName() {
        return decoratedComponent.getName();
    }

    @Override
    public int getSize() {
        return decoratedComponent.getSize();
    }

}
