
public final class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
    
    public void doSomething() {
        System.out.println("Instance");
    }
}
