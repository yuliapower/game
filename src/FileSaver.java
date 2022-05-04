import java.io.*;


public class FileSaver {

//    private FileOutputStream fileWriter;
    //private ObjectOutputStream objectOutputStream;


    public static void saveNode(Node node) {
        try {
            FileOutputStream fileWriter = new FileOutputStream("nodes.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter);
            objectOutputStream.writeObject(node);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
