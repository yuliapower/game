import java.io.Serializable;

public class StartGameCommand implements Command, Serializable {
   private Menu menu;
    private static final long serialVersionUID = 1L;

    public StartGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.start();
    }
}
