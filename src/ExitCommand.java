import java.io.Serializable;
import java.util.LinkedList;

public class ExitCommand implements Command, Serializable {
    private Menu menu;
    private static final long serialVersionUID = 1L;
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
