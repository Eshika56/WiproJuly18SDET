package labsession.lab18072025

public class Greeter {
    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void greet(String[] args) {
        greet("John");
    }
}

