package com.bink.lesson09.day09.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author yangbingkun
 * 2020/9/9 --5:11 下午
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello,Server!!!".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();
    }
}
