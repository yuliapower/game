import java.io.Serializable;

public class MenuReturnCommand implements Command, Serializable {
    private static final long serialVersionUID = 1L;
    private Menu menu;
    private Node node;

    public MenuReturnCommand(Menu menu, Node node) {
        this.menu = menu;
        this.node = node;
    }

    @Override
    public void execute() {
        menu.menuReturn(node);
    }
}
