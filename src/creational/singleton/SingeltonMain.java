package creational.singleton;

public class SingeltonMain {

    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);
    }
}
