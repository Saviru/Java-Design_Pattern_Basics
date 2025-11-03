package Singleton;

public class Main {
    public static void main(String[] args) {
        // Creating different instances
        Singleton o1 = Singleton.getInstance("Hello");
        Singleton o2 = Singleton.getInstance("World");

        System.out.println(o1.getVal());
        System.out.println(o2.getVal());
        System.out.print(o1 == o2);

    }
}