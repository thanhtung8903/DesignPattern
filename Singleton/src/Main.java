public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.doSomething();
    }
}