import java.io.Serializable;

public class StartGameCommand implements Command, Serializable {
   private Menu menu;
    private static final long serialVersionUID = 1L;
    private Node node;

    public StartGameCommand(Menu menu, Node node) {
        this.menu = menu;
        this.node = node;
    }

    @Override
    public void execute() {
        menu.start(node);
    }
}
