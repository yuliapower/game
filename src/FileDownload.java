import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDownload {

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

