package creational.singleton;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton INSTANCE;
    private final String value;

    private LazyDoubleCheckSingleton() {
        this.value = "jakaś wartość";
    }

    public LazyDoubleCheckSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
