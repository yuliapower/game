
import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

public class Node implements Serializable {
     private static final long serialVersionUID = 1L;
    private String title;
    private String description;
    private Node nodeFirst;
    private Node nodeSecond;
    static Node nodeSave;


    public Node(String title, String description, Node nodeFirst, Node nodeSecond) {
        this.title = title;
        this.description = description;
        this.nodeFirst = nodeFirst;
        this.nodeSecond = nodeSecond;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Node getNodeFirst() {
        return nodeFirst;
    }

    public Node getNodeSecond() {
        return nodeSecond;
    }


    public void game(Node node) {
        Node nextNode = null;
        System.out.println("Выберите 1 или 2 для ответа, или 3 для выхода в главное меню");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equalsIgnoreCase("1")) {
            nextNode = node.getNodeFirst();
            System.out.println(nextNode.getTitle());
            System.out.println(nextNode.getDescription());
            if (nextNode.getNodeFirst() == null) {
                System.out.println("Игра закончена");
                //node.getUser().menuReturn();
                User.menuReturn();
            }
            nodeSave = nextNode;
        }
        if (string.equalsIgnoreCase("2")) {
            nextNode = node.getNodeSecond();
            System.out.println(nextNode.getTitle());
            System.out.println(nextNode.getDescription());
            if (nextNode.getNodeSecond() == null) {
                System.out.println("Игра закончена");
               // node.getUser().menuReturn();
                User.menuReturn();
            }
            nodeSave = nextNode;
        }
        if (string.equalsIgnoreCase("3")) {
            System.out.println(nodeSave);
           // FileSaver.saveNode(nodeSave);
            User.exit();
            //node.getUser().exit();
        }
        if (nextNode != null) {
            game(nextNode);
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", nodeFirst=" + nodeFirst +
                ", nodeSecond=" + nodeSecond +
                '}';
    }
}

