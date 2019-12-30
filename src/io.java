import java.io.*;

public class io {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("writer.txt",true);
        String str = "hello";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
