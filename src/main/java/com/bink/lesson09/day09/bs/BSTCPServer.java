package com.bink.lesson09.day09.bs;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yangbingkun
 * 2020/9/10 --2:12 下午
 */
public class BSTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8080);
        while (true) {
            Socket socket = sever.accept();
            new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String request = reader.readLine();
                    String[] strArr = request.split(" ");
                    String path = strArr[1].substring(1);
                    FileInputStream fis = new FileInputStream(path);
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    OutputStream os = socket.getOutputStream();
                    os.write("HTTP/1.1 200 OK \r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write("\r\n".getBytes());
                    while ((len = fis.read(bytes)) != -1) {
                        os.write(bytes, 0, len);
                    }
                    fis.close();
                    os.close();
                    reader.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
