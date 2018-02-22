package com.lanhuigu.io.fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * write(int b): 将字节写入到输出流
 */
public class TestFileOutputStream1 {

    public static void main(String[] args) {
        // 指定构建源文件
        File file = new File("C:\\mycode\\hello.txt");
        // 根据文件创建待写入的文件输入流
        try (OutputStream os = new FileOutputStream(file)) {
            // 要写入的数据，转化为字节数组
            String str= "abcdefg";
            byte[] bytes = str.getBytes();
            // 每次往输入流写入一个字节
            for (int b : bytes) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}