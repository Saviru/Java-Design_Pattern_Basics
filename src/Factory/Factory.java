package Factory;

public class Factory {
    public Common createMethod(String type) {
        if(type.equalsIgnoreCase("M1")) {
            return new Concrete1();
        } else if (type.equalsIgnoreCase("M2")) {
            return new Concrete2();
        } else {
            return null;
        }
    }
}
