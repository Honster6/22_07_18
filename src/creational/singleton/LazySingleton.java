package creational.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;
    private final String value;

    private LazySingleton() {
        this.value = "jakaś wartość";
    }
    public LazySingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
