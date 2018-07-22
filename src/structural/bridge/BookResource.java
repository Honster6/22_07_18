package structural.bridge;

public class BookResource implements Resource{

    private String image;
    private String shortDescription;
    private String publisher;

    public BookResource(String image, String shortDescription, String publisher, String header) {
        this.image = image;
        this.shortDescription = shortDescription;
        this.publisher = publisher;
        this.header = header;
    }

    private String header;

    @Override
    public String getHeader() {
        return this.header;
    }

    @Override
    public String getImage() {
        return this.image;
    }

    @Override
    public String getContent() {
        return this.shortDescription;
    }

    @Override
    public String getFooter() {
        return this.publisher;
    }
}
