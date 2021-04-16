package intert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class KehuFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("F:\\照片\\微信图片_2020062514101911.png"); //文件输入流读取文件
        Socket sock =new Socket("127.0.0.1",8899);  //建立客户端对象
        OutputStream os = sock.getOutputStream();  //字节输出流
        int len = 0;
        byte[] bys = new byte[1024];
        System.out.println("开始上传");
        System.out.println("----->");
        while((len = fis.read(bys)) != -1){  //输出文件到服务器
            os.write(bys,0,len);
        }
        sock.shutdownOutput();
        InputStream is = sock.getInputStream();  //输入流
        int le = 0;
        byte[] by = new byte[1024];
        le = is.read(by);  //获取服务器网络输入流
        System.out.println(new String(by,0,le));
        System.out.println("----->");
        System.out.println("结束！");
        fis.close();
        sock.close();
    }
}
