public class ExitCommand implements Command{
    private Menu menu;
    private FileSaver fileSaver;


    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exit(fileSaver);
    }
}
