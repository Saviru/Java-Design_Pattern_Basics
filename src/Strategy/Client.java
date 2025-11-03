package Strategy;

public class Client {
    public static void main(String[] args) {
        Context con = new Context();

        con.setStrategy(new Concrete1());
        con.doAction("action1");

        con.setStrategy(new Concrete2());
        con.doAction("action2");

        con.setStrategy(new Concrete1());
        con.doAction("test");
    }
}
