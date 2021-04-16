package intert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Kehu {
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("",8888);
        OutputStream os = soc.getOutputStream();
        os.write("hellow!!".getBytes());
        InputStream is = soc.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        System.out.println(new String(by,0,len));
        soc.close();
    }
}
