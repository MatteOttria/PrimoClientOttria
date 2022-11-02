package provaclientottria;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class ServerReader extends Thread{
    Socket socket;
    static String str;
    public ServerReader(Socket socket){
        this.socket = socket;
    }
    
    @Override
    public void run(){
        try {
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            while (true) {
                str = bufferedReader.readLine();
                getStr();
                System.out.println(str);
                if(str.equals("Client disconnected")){
                    socket.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String getStr(){
        return str;
    }
}