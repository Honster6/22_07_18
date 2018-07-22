package creational.singleton;

 class NoNameSingleton {
    private final String value;

    private NoNameSingleton() {
        this.value = "jakas wartosc";
    }

    private static class Singleton {
        private static final NoNameSingleton INSTANCE = new NoNameSingleton();
    }
    NoNameSingleton getInstance() {
        return Singleton.INSTANCE;
    }

}
