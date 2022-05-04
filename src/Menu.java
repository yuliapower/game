import java.util.Scanner;

public class Menu {
    //Receiver
    private FileSaver fileSaver;
    private Node node;

    public Menu() {
        //  this.node=node;
    }

    public Menu(FileSaver fileSaver, Node node) {
        this.fileSaver = fileSaver;
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void getString(Node node) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command) {
            case "1":
                start();
                node.game(node);
//                nodeSave2 = node.getNodeSave();
                return;
            case "2":
                download();
                return;
            case "3":
                System.out.println("Выход из игры");
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }

    void start() {
        System.out.println("Игра началась");
        System.out.println("Лисенок\n" +
                "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. " +
                "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, " +
                "но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга." +
                " \" Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - " +
                "подумал Лисёнок. Как поступить Лисенку?");

    }

    void download() {
        System.out.println("Загрузка игры");
    }

    void exit(FileSaver saver) {
        // System.out.println("Выход из игры");
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Сохранить игру");
        System.out.println("4. Выйти");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("3")) {
//            save(fileSaver);
        }
        // getString(node);
    }

    void save(FileSaver saver) {
        //FileSaver fileSaver=new FileSaver();
//        saver.saveNode(getNode());
        System.out.println("Выход из игры");
    }

    void menuReturn(Node node) {
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        getString(node);
    }
}
