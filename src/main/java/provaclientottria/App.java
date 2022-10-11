package provaclientottria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class App {
    public static void main( String[] args ) throws Exception
    {   
        try(Socket socket = new Socket("localhost", 1723);){
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReaderUsr = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter =  new PrintWriter(socket.getOutputStream(),true);
            while (true) {
                String str = bufferedReader.readLine();
                System.out.println(str);
                printWriter.println(bufferedReaderUsr.readLine());
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
