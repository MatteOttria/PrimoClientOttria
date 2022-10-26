package provaclientottria;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class ServerReader extends Thread{
    Socket socket;

    public ServerReader(Socket socket){
        this.socket = socket;
    }
    
    @Override
    public void run(){
        try {
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            while (true) {
                String str = bufferedReader.readLine();
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}