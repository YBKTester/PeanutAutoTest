package com.bink.lesson09.day09.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yangbingkun
 * 2020/9/9 --5:14 下午
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hi,Client!!!".getBytes());

        socket.close();
        serverSocket.close();
    }
}
