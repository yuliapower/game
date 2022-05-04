
import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

public class Node implements Serializable {
    // private static final long serialVersionUID = 1L;
    private String title;
    private String description;
    private Node nodeFirst;
    private Node nodeSecond;
    private User user;
    protected Node nodeSave;
//    protected FileSaver fileSaver;


    public Node(String title, String description, Node nodeFirst, Node nodeSecond) {
        this.title = title;
        this.description = description;
        this.nodeFirst = nodeFirst;
        this.nodeSecond = nodeSecond;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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



    public Node getNodeSave() {
        return nodeSave;
    }

    public void setNodeSave(Node nodeSave) {
        this.nodeSave = nodeSave;
    }

    public void game(Node node) {
        // Node nextNode = nodeSave;
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
                node.getUser().menuReturn();
            }
            nodeSave = nextNode;
        }
        if (string.equalsIgnoreCase("2")) {
            nextNode = node.getNodeSecond();
            System.out.println(nextNode.getTitle());
            System.out.println(nextNode.getDescription());
            if (nextNode.getNodeSecond() == null) {
                System.out.println("Игра закончена");
                node.getUser().menuReturn();
            }
            nodeSave = nextNode;
        }
        if (string.equalsIgnoreCase("3")) {
            System.out.println(nodeSave);
            // fileSaver=new FileSaver();
            //   nodeSave.setFileSaver(fileSaver);
            FileSaver.saveNode(nodeSave);
            node.getUser().exit();
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
                ", user=" + user +
                ", nodeSave=" + nodeSave +
                '}';
    }
}

