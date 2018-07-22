package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Book book = new FantasyBook();
        Album album = new MetalAlbum();
        ResourceProduct resource = new AlbumResource((album));
        ViewProduct viewProduct = new ViewProduct (resource);

        viewProduct.show();;
    }
}
