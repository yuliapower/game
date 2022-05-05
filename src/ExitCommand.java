import java.io.Serializable;

public class ExitCommand implements Command, Serializable {
    private static final long serialVersionUID = 1L;
    private Menu menu;
    private Node node;

    public ExitCommand(Menu menu, Node node) {
        this.menu = menu;
        this.node=node;
    }

    @Override
    public void execute() {
        menu.exit(node);
    }
}
