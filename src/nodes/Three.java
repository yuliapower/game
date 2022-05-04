package nodes;

public class Three {
    private String title;
    private String description;
    private Three left;
    private Three right;

    public Three(String title, String description, Three left, Three right) {
        this.title = title;
        this.description = description;
        this.left = left;
        this.right = right;
    }

    public Three(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
