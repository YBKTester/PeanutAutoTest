package com.bink.lesson09.day08;

import java.io.*;

/**
 * @author yangbingkun
 * 2020/9/8 --3:17 下午
 */
public class BufferDemo {
    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        String filePathIn = "IN/身份证复印.pdf";
        String filePathOut = "Out/身份证复印.pdf";
//        FileInputStream fis = new FileInputStream(filePathIn);
//        bufferInputStream(fis);
//        FileOutputStream fos = new FileOutputStream(filePathOut);
//        bufferOutputStream(fos);
//
//

//        FileWriter fw = new FileWriter("Out/test.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        for (int i = 0; i < 10; i++) {
//            bw.write("Hello World");
//            bw.newLine();
//        }
//        bw.close();
//        long t2 = System.currentTimeMillis();
//        System.out.println("耗时： " + (t2 - t1) + "ms");
        BufferedReader br = new BufferedReader(new FileReader("Out/test.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }


    /**
     * 字节流写入文件
     *
     * @param fos 字节输出流
     * @throws IOException
     */
    private static void bufferOutputStream(FileOutputStream fos) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入内部缓冲区".getBytes());
        bos.close();

    }

    /**
     * 字节流读取文件
     *
     * @param fis 文件
     * @throws IOException
     */
    private static void bufferInputStream(FileInputStream fis) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(len);
        }
        bis.close();
    }

    private static void bufferReader(FileReader reader) {
        BufferedReader br = new BufferedReader(reader);


    }

    private static void bufferWriter(FileWriter writer) {
        BufferedWriter bw = new BufferedWriter(writer, 1024);
    }
}
