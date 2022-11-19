import java.io.FileOutputStream;
public class FileOutputStreamExample {
  public static void main(String args[]) {
    try {
      // Creating FileOutputStream object
      FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
      fout.write("Arnab"); // Writting value
      fout.close();
      System.out.println("success...");
    } catch (Exception e) { // Handeling Exception
      System.out.println(e);
    }
  }
}