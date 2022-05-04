import java.io.Serializable;
import java.util.LinkedList;

public class ExitCommand implements Command, Serializable {
    private Menu menu;
    private static final long serialVersionUID = 1L;
    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exit();
    }
}
