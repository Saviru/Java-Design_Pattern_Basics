package Decorator;

public class Main {
    public static void main(String[] args) {
        Component com1 = new ConcreteComponent();
        System.out.println(com1.getName()+" | "+com1.getSize());

        com1 = new ConDec1(com1);
        System.out.println(com1.getName()+" | "+com1.getSize());

        com1 = new ConDec2(com1);
        System.out.println(com1.getName()+" | "+com1.getSize());

    }
}
