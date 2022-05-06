import java.io.Serializable;
import java.util.Scanner;

public class Menu implements Serializable {
    //Receiver
    private static final long serialVersionUID = 1L;

    public Menu() {
    }

    void start(Node node) {
        System.out.println(node.getTitle());
        System.out.println(node.getDescription());
        System.out.println("Игра началась");
    }

    void download() {
        Node node = FileHandler.downloadNode();
        start(node);
        node.game(node);
    }

    void play(Node node) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command) {
            case "1" -> {
                start(node);
                node.game(node);
            }
            case "2" -> {
                download();
            }
            case "3" -> System.out.println("Выход из игры");
            default -> System.out.println("Неизвестная команда");
        }
    }

    void exit(Node node) {
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        System.out.println("4. Сохранить игру");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command) {
            case "1" -> {
                start(node);
                node.game(node);
            }
            case "2" -> {
                download();
            }
            case "3" -> System.out.println("Выход из игры");
            case "4" -> {
                save();
            }
            default -> System.out.println("Неизвестная команда");
        }
    }

    void save() {
        FileHandler.saveNode(Node.nodeSave);
        System.out.println("Выход из игры");
    }

    void menuReturn(Node node) {
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        play(node);
    }
}
