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
/*
        node1.setUser(user);
        node2.setUser(user);
        node3.setUser(user);
        node4.setUser(user);
        node5.setUser(user);
        node6.setUser(user);
        node7.setUser(user);
        node8.setUser(user);
        node9.setUser(user);
        node10.setUser(user);
        node11.setUser(user);
        node12.setUser(user);
        node13.setUser(user);
        */

        //  user.menuReturn();


    }
}
