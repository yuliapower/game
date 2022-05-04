import java.io.Serializable;

public class SaveGameCommand implements Command, Serializable {
    private Menu menu;


    public SaveGameCommand(Menu menu) {
        this.menu = menu;

    }

    @Override
    public void execute() {
        menu.save();
    }
}
