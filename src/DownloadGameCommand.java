public class DownloadGameCommand implements Command {
private Menu menu;

    public DownloadGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.download();
    }
}
