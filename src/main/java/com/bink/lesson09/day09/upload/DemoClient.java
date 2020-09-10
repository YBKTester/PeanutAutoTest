package com.bink.lesson09.day09.upload;

import java.io.*;
import java.net.Socket;

/**
 * @author yangbingkun
 * 2020/9/9 --5:26 下午
 */
public class DemoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Out/test.txt");
        Socket socket = new Socket("127.0.0.1", 9999);
//      准备输出流  发送数据给服务器
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
//        循环读取本地文件
        while ((len = fis.read(bytes)) != -1) {
//            循环输出、发送数据
            os.write(bytes, 0, len);
        }
//        停止输出流
        socket.shutdownOutput();
//        准本输入流  接收服务器发回的数据
        InputStream is = socket.getInputStream();
//        循环读取服务器发回的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
//      释放资源
        fis.close();
        socket.close();
    }
}
