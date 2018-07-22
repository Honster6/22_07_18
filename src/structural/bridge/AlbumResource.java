package structural.bridge;

public class AlbumResource implements Resource{
    private String title;
    private String albumCover;
    private String listOfSong;

    public AlbumResource(String title, String albumCover, String listOfSong, String publisher) {
        this.title = title;
        this.albumCover = albumCover;
        this.listOfSong = listOfSong;
        this.publisher = publisher;
    }

    private String publisher;

    @Override
    public String getHeader() {
        return this.title;
    }

    @Override
    public String getImage() {
        return this.albumCover;
    }

    @Override
    public String getContent() {
        return this.listOfSong;
    }

    @Override
    public String getFooter() {
        return this.publisher;
    }
}
