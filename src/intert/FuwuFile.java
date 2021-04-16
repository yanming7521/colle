package intert;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FuwuFile {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8899);  //建立服务器对象
        Socket sock = sever.accept(); //accept获取客户端对象
        InputStream is = sock.getInputStream(); //获取网络字节输入流
        File file = new File("C:\\Users\\严明\\Desktop\\fuwuqi"); //创建文件对象
        if(!file.exists()){ //文件是否存在
            file.mkdirs();  //创建文件
        }

        File file1 = new File("C:\\Users\\严明\\Desktop\\fuwuqi\\微信图片_2020062514101911.png");
        if(file1.exists()){
            System.out.println("文件已存在！");
            FileOutputStream fos = new FileOutputStream(file+"\\微信图片_2020062514101911.png"); //文件输出流
            int len = 0;
            byte[] bys = new byte[1024];
            while ((len = is.read(bys)) != -1) {  //read方法读取字节输入流
                fos.write(bys, 0, len);
            }
            sock.shutdownInput();  //关闭输入流
            OutputStream os = sock.getOutputStream(); //网络字节输出流
            os.write("文件已存在，上传失败！".getBytes());  //write回写输出流到客户端
            System.out.println("结束！");
            fos.close();
            sock.close();
            sever.close();
        }
        if(!file1.exists()) {
            FileOutputStream fos = new FileOutputStream(file+"\\微信图片_2020062514101911.png"); //文件输出流
            int len = 0;
            byte[] bys = new byte[1024];
            System.out.println("开始接收");
            System.out.println("<------");
            while ((len = is.read(bys)) != -1) {  //read方法读取字节输入流
                fos.write(bys, 0, len);
            }
            sock.shutdownInput();  //关闭输入流
            OutputStream os = sock.getOutputStream();
            os.write("上传成功！！".getBytes());
            // sock.getOutputStream().write("上传成功！".getBytes());
            System.out.println("成功！！");
            System.out.println("<------");
            System.out.println("结束！");
            fos.close();
            sock.close();
            sever.close();
        }
    }
}
