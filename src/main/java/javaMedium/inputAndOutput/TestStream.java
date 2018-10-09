package javaMedium.inputAndOutput;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Arrays;

/**
 * @author JonnyNan
 * @date 2018/10/7 - 17:06
 */
public class TestStream {

    @Test
    public void m1() {
        try {
            File f = new File("d:/lol.txt");
            //创建基于文件的输入流

            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void m2() {
        try {
            File f = new File("d:/lol.txt");
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 通过这个输出流，就可以把数据从内存，输出到硬盘的文件上
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void m3() {
        try {
            File f = new File("d:/lol.txt");
            //创建基于文件的输入流

            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中

            //创建字节数组，长度就是文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all
            ) {
                //打印出来是65 66
                System.out.println(b);
            }

            //每次使用完流 都应该关闭
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void m5() {
        // 准备文件lol2.txt其中的内容是空的
        File f = new File("d:/xyz/abc/def/lol2.txt");
        // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
        byte[] data = {88, 89};

        File dir = f.getParentFile();
        if (!dir.exists()) {
            dir.mkdirs();
        }

        //创建基于文件的输出流
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void chaifen() {
        int eachSize = 500 * 1024;
        File srcFile = new File("d:/Everything.exe");
        byte[] fileContent = new byte[(int) srcFile.length()];
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(fileContent);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //计算分成多少块
        int fileNumber;

        if (0 == fileContent.length % eachSize) {
            fileNumber = (int) (fileContent.length / eachSize);
        } else {
            fileNumber = (int) (fileContent.length / eachSize) + 1;
        }

        for (int i = 0; i < fileNumber; i++) {
            String eachFileName = srcFile.getName() + "_" + i;
            File eachFile = new File(srcFile.getParent(), eachFileName);
            byte[] eachContent;

            // 不是最后一个
            if (i != fileNumber - 1) {
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
            } else { // 最后一个
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
            }
            try {
                // 写出去
                FileOutputStream fos = new FileOutputStream(eachFile);
                fos.write(eachContent);
                // 记得关闭
                fos.close();
                System.out.printf("输出子文件%s，其大小是 %d字节%n", eachFile.getAbsoluteFile(), eachFile.length());
            } catch (
                    IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testhebing(){
        hebing("d:/","Everything.exe");
    }

    public void hebing(String folder,String fileName){
        File destFile = new File(folder,fileName);
        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            int index =0;
            while (true){
                File eachFile = new File(folder,fileName+"_"+index++);
                if(!eachFile.exists()){
                    break;
                }

                FileInputStream fis =  new FileInputStream(eachFile);
                byte [] eachContent = new byte[(int)(eachFile.length())];
                fis.read(eachContent);
                fis.close();

                fos.write(eachContent);
                fos.flush();
            }

            fos.close();
            System.out.println(destFile.length());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //字符流
    @Test
    public void m6(){
        File f = new File("d:/lol.txt");

        try {
            //创建基于文件的Reader
            FileReader fr = new FileReader(f);

//        创建字符数组 长度就是文件的长度
            char [] all = new char[(int)(f.length())];

            //以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all
                 ) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void m7(){
        File f = new File("d:/lol2.txt");

        try {
            FileWriter fw = new FileWriter(f);

            char [] all = {'a','b','1','2'};

            fw.write(all);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void m8(){
        File f = new File("d:/lol3.txt");

        try(  FileInputStream fis = new FileInputStream(f);
              DataInputStream dis = new DataInputStream(fis);
        ){
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();

            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void m9(){
        File f = new File("d:/lol3.txt");

        try(  FileOutputStream fos = new FileOutputStream(f);
              DataOutputStream dos = new DataOutputStream(fos);
        ){
           dos.writeBoolean(true);
           dos.writeInt(30);
           dos.writeUTF("hehe");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
