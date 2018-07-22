package creational.singleton;

enum EnumSingleton {
    INSTANCE("jakaś wartość");
    private final String value;

    EnumSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
