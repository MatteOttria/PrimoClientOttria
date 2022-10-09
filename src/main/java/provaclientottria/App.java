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
        try(Socket socket = new Socket("localhost", 5001);){
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String str = bufferedReader.readLine();
                System.out.println("Server: " + str);   
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
