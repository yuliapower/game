import java.io.Serializable;

public class MenuReturnCommand implements Command, Serializable {
    private Menu menu;
private Node node;

    public MenuReturnCommand(Menu menu, Node node) {
        this.menu = menu;
        this.node=node;
    }

    @Override
    public void execute() {
        menu.menuReturn(node);
    }
}
