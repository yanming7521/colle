package intert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.ServerSocket;
public class Fuwu {
    public static void main(String[] args) throws IOException{
        ServerSocket ser = new ServerSocket(8889);
        Socket sc = ser.accept();
        InputStream is = sc.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        System.out.println(new String(by,0,len));
        OutputStream os = sc.getOutputStream();
        os.write("yes!!".getBytes());
        sc.close();
        ser.close();
    }
}
