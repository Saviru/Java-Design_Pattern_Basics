package Singleton;

public class Singleton {
    private static Singleton instance;
    private String val;

    private Singleton() {}

    private Singleton(String val) {
        this.val = val;
    }

    public static synchronized Singleton getInstance(String val) {
        if(instance == null) {
            instance = new Singleton(val);
        }
        return instance;
    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getVal() {
        return val;
    }
}
