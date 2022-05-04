import java.io.Serializable;

public class SaveGameCommand implements Command, Serializable {
    private Menu menu;
    private static final long serialVersionUID = 1L;

    public SaveGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.save();
    }
}
