package Observer;

public class Main {
    public static void main(String[] args) {
        //Subject
        ConcreteSubject subject = new ConcreteSubject();

        //Observers
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        // Register observers with the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        System.out.println("message1 : ");
        subject.setMessage("hello 1");

        System.out.println("message2  : ");
        subject.setMessage("hello 2");

        System.out.println("\nRemoving Observer1: ");
        subject.removeObserver(observer1);
        subject.setMessage("hello 3");
    }
}
