package Factory;

// also calls Client class
public class Context {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Common c1 = factory.createMethod("M1");
        c1.method();

        Common c2 = factory.createMethod("M2");
        c2.method();

        Common c3 = factory.createMethod("M1");
        c3.method();

    }
}
