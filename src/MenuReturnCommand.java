import java.io.Serializable;
import java.util.LinkedList;

public class MenuReturnCommand implements Command, Serializable {
    private Menu menu;
    private Node node;
    private LinkedList<Node> linkedList;
    private static final long serialVersionUID = 1L;

    public MenuReturnCommand(Menu menu, Node node) {
        this.menu = menu;
        this.node = node;
    }

    @Override
    public void execute() {
        menu.menuReturn(node);
    }
}
