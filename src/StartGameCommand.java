import java.io.Serializable;

public class StartGameCommand implements Command, Serializable {
   private Menu menu;
  // protected Node node;

    public StartGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.start();
    }
}
