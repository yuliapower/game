import java.io.Serializable;

public class ExitCommand implements Command, Serializable {
    private Menu menu;

    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exit();
    }
}
