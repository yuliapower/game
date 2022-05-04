import java.io.*;


public class FileSaver {

    public static void saveNode(Node node) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("nodes.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter);
            objectOutputStream.writeObject(node);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



