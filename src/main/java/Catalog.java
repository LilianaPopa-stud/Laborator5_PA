import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Item> items = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public Catalog(String name) {
        this.name = name;
    }

    public void add(Item item) {
        items.add(item);
    }
    public Item findById(String id) {

        return items.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
