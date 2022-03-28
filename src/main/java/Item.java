import java.util.HashMap;
import java.util.Map;

abstract class Item {
    private String id;
    private String title;
    private String location;
    private String author;
    private int year;

    private Map<String, Object> tags = new HashMap<>();
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
    public Item(String id, String title, String location, String author, int year) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
