package structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        DocumentParser parser = new DocumentParser();
        DocumentFlyWeightFactory factory = new DocumentFlyWeightFactory(parser);
        Document document1 = factory.getDocument("pliki1", "Instrukcja obslugi");
        Document document2 = factory.getDocument("file2", "tytuł -- wiadomosc");
        Document document3 = factory.getDocument("pliki1", "Instrukcja obslugi");
        System.out.println("Doc 1 = 3" + (document1 == document3));
        System.out.println("Doc 1 = 2" + (document2 == document3));
    }
}
