public class StartGameCommand implements Command {
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
