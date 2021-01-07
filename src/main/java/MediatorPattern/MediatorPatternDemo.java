package MediatorPattern;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User rober = new User("Rober");
        User even = new User("Even");

        rober.sendMessage("HI, John");
        even.sendMessage("Hi, Edna");
    }
}
