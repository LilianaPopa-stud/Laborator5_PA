import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException {
        Main app = new Main();
        app.testCreateSave();
    }
    private void testCreateSave() throws IOException {
        Catalog catalog =
                new Catalog("MyRefs");
        var book = new Book("book1","nume","location","person",1920);
        catalog.add(book);
        CatalogUtil.save(catalog, "/Users/lilschnapsidee/Downloads/catalog.json"); }

}