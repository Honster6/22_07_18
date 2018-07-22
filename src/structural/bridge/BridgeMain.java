package structural.bridge;

public class BridgeMain  {
    public static void main(String[] args) {
        Resource resource = new AlbumResource("Lasy Pożogi", "album_cover.jpg", "Strach\nBól" +
                "\nSzaleństwo" ,"Ragnarock");
        System.out.println("Short View:");
        View view = new ShortView(resource);
        view.show();
        System.out.println();
        System.out.println();
        System.out.println("Long View: ");
        View viewLong = new LongView(resource);
        viewLong.show();
    }
}
