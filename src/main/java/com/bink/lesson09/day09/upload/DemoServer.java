package com.bink.lesson09.day09.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author yangbingkun
 * 2020/9/9 --5:37 下午
 */
public class DemoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(() -> {
                try {

                    InputStream is = socket.getInputStream();
                    File file = new File("IN/upload");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    String fileName = "bink" + System.currentTimeMillis() + new Random().nextInt(999999) + ".txt";
                    FileOutputStream fos = new FileOutputStream(file + "/" + fileName);
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = is.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    socket.getOutputStream().write("上传成功！".getBytes());
                    fos.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
