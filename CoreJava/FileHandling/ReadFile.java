import java.io.FileInputStream;  
public class ReadFile {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1) { // While loop to read file
               System.out.print((char)i);    
            }    
            fin.close();    
          }
          catch(Exception e) {
               System.out.println(e);
          }    
     }    
}