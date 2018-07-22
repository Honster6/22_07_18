package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DocumentFlyWeightFactory {
    private final DocumentParser parser;
    private final Map<String, Document> library = new HashMap<>();

    public DocumentFlyWeightFactory(DocumentParser parser) {
        this.parser = parser;
    }
    Document getDocument(String fileName, String content) {
        Document document = library.get(fileName);
        if(document == null) {
            parser.parseDocument(fileName, content);
            library.put(fileName, document);
        }
        return document;
    }
}
