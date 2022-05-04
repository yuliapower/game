public class SaveGameCommand implements Command {
    private Menu menu;
    private FileSaver fileSaver;

    public SaveGameCommand(Menu menu) {
        this.menu = menu;

    }

    @Override
    public void execute() {
        menu.save(fileSaver);
    }
}
