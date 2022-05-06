import java.io.*;

public class FileHandler {

    public static void saveNode(Node node) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("nodes.txt",false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter);
            objectOutputStream.writeObject(node);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Node downloadNode() {
        try (FileInputStream inputStream = new FileInputStream("nodes.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            Node nodeLoad = (Node) objectInputStream.readObject();
            return nodeLoad;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

