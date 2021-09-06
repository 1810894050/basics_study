package com.file;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileReadWrite {

    @Test
    public void testFileRead(){
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
    }

    /*
    * 读取文件中的数据
    * */
    @Test
    public void testReadFile(){
        FileReader fr = null;
        try {
            //1、实例化File类对象，指明要操作的文件
            File file=new File("hello.txt");
            
            //2、提供具体的流
            fr = new FileReader(file);

            //3、数据读入
            int data;
            while ((data=fr.read()) !=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流
                if (fr!=null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //文件写入操作
    @Test
    public void testFileWrite() {
        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");
            fw = new FileWriter(file);
            fw.write("你好，中国");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw!=null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
