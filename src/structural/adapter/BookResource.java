package structural.adapter;

public class BookResource implements Book{
    private final Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String bio() {
        return "jakas biografia";
    }

    @Override
    public String frontPicture() {
        return "jakis obrazek";
    }
}
