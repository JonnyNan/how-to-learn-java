package javaMedium.inputAndOutput;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author JonnyNan
 * @date 2018/9/30 - 13:17
 */
public class TestFile {

    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        //绝对路径
        File f1 = new File("d:/LOLFolder");
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
    }

    @Test
    public void m2() {
        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" + f);

        System.out.println("文件是否存在：" + f.exists());

        System.out.println("判断是否是文件：" + f.isFile());

        System.out.println("获取文件长度" + f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间：" + d);

        //设置文件的修改时间为 1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f2 = new File("d/LoLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");

    }

    @Test
    public void m3() {
        File f = new File("d:/LOLFolder/skin/garen.ski");

        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[] fs = f.listFiles();

        // 以字符串形式返回获取所在文件夹
        f.getParent();

        // 以文件形式返回获取所在文件夹
        f.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 所以创建一个空文件之前，通常都会创建父目录
        f.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
        File.listRoots();

        // 刪除文件
        f.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f.deleteOnExit();

    }

    @Test
    public void xunhuanbianli(){
        bianliFolder("c:\\windows");
    }

    public void bianliFolder(String filename) {

        File windowsFolder = new File(filename);
        File[] wf = windowsFolder.listFiles();
        if(wf==null){
            return;
        }

        for (File file : wf) {
            if (file.isFile()) {
                System.out.println(file);
            }
            if (file.isDirectory()) {
                String filePath = file.getAbsolutePath();
                bianliFolder(filePath);
            }
        }
        System.out.println("==================");
        System.out.println(TestFile.max(wf).toString());
        System.out.println(TestFile.min(wf).toString());
    }

    public static File max(File[] f) {
        long max;
        max = f[0].length();
        File file = null;
        for (File file1 : f) {
            if (file1.isFile()) {
                if (file1.length() > max) {
                    max = file1.length();
                }
            }

        }
        for (File file1 : f) {
            if (file1.length() == max && file1.isFile()) {
                file = file1;
            }
        }
        return file;
    }

    public static File min(File[] f) {
        long min = 100;
        for (File file1 : f) {
            if (file1.isFile()) {
                min = file1.length();
            }
        }
        File file = null;
        for (File file1 : f) {
            if (file1.isFile()) {
                if (file1.length() < min) {
                    if (file1.length() != 0) {
                        min = file1.length();
                    }

                }
            }
        }
        for (File file1 : f) {
            if (file1.length() == min && file1.isFile()) {
                file = file1;
            }

        }
        return file;
    }

    @Test
    public void m4(){
        int no = Integer.parseInt("1000101010",2);
        System.out.println(no);
        String s = Integer.toBinaryString(no);
        System.out.println(s);
    }


}
