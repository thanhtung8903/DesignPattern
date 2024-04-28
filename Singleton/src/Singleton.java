
public class Singleton {

    private static Singleton instance;

    private Singleton() {
//        private Constructor, only call in Singleton class
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void doSomething() {
        System.out.println("Instance");
    }
}
