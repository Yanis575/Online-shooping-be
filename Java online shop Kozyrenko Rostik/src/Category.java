import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    protected int id;
    protected String title;
    protected String description;

    private static int NextId = 1;
    private static List<Category> categories = new ArrayList<>();

    public Category() {};

    public Category(int id, String title, String description) {
        this.id = NextId ++;
        this.title = title;
        this.description = description;
    }

    public abstract void ShowInfo();
    public abstract String getType();

    public int getId() {
        return id;
    }

    public String  getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String setDescription() {
        return this.description = description;
    }

    public static void AddCategory(Category category) {
        categories.add(category);
        System.out.println(category.getTitle());
    }
    public static void ShowCategory() {
        if (categories.isEmpty());
        System.out.println("В списке ничего нет");
        return;
    }
}

