import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Command saveGame = new SaveGameCommand(menu);
        Command startGame = new StartGameCommand(menu, Three.threeApp() );
        Command downloadGame = new DownloadGameCommand(menu);
        Command exit = new ExitCommand(menu, Three.threeApp());
        Command menuReturn = new MenuReturnCommand(menu, Three.threeApp());


        User user = new User(startGame, downloadGame, saveGame, exit, menuReturn);
        User.menuReturn(); //вызов меню

    }
}
