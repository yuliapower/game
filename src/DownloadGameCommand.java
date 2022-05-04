import java.io.Serializable;
import java.util.LinkedList;

public class DownloadGameCommand implements Command, Serializable {
    private Menu menu;
    private static final long serialVersionUID = 1L;

    public DownloadGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.download();
    }
}
