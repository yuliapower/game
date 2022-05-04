import java.io.Serializable;

public class DownloadGameCommand implements Command, Serializable {
private Menu menu;

    public DownloadGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.download();
    }
}
