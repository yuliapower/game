import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu implements Serializable {
    //Receiver

   // private Node node;
   private static final long serialVersionUID = 1L;

    public Menu() {

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
getString(FileDownload.downloadNode());
        //System.out.println("Загрузка игры");
     //  Node node1=FileDownload.downloadNode();
     //   for (Node node : linkedList) {
       //     if (node == node1){
      //          getString(node,linkedList);
            }

        //пройтись циклом в линклисте и если нода равна ноде из файл доунлауд - то вставим ее в метод гетстриг
        // FileDownload.downloadNode().getTitle();
//linkedList.stream().filter(node -> node.getTitle().equalsIgnoreCase( FileDownload.downloadNode().getTitle());

        //linkedList.forEach(node->node.getTitle().equalsIgnoreCase( FileDownload.downloadNode().getTitle()));


    void exit() {
        // System.out.println("Выход из игры");
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Сохранить игру");
        System.out.println("4. Выйти");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("3")) {
            save();
        }
        if (command.equalsIgnoreCase("2")) {
            download();
        }
    }

    void save() {
        FileSaver.saveNode(Node.nodeSave);
        System.out.println("Выход из игры");
    }

    void menuReturn(Node node ) {
        System.out.println("Меню: ");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        getString(node);
    }
}
