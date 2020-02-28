package cn.sxt.io1;

import sun.text.normalizer.UTF16;

import java.io.UnsupportedEncodingException;

/**
 * @author NiuQun
 * @2019/10/27
 */

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "这是一个字符串a";
        // 编码：字符串--》字节数组
        // 默认使用的是工程的字符集(右下角UTF-8)
        byte[] datas = msg.getBytes();
        // 输出结果是22, 因为UTF-8字符集中一个英文字母是1个字节,一个汉字是3个字节
        System.out.println(datas.length);
        System.out.println("**********");

        String str1 = new String(datas);

        System.out.println(str1);
        System.out.println("***********");
        // 编码：其它字符集
        datas = msg.getBytes("UTF-16LE");
        // 输出结果是16, 因为UTF-16中 UTF-16LE（小端）无论一个字母还是一个汉字都是2个字节
        // UTF-16BE（大端）无论一个字母还是一个汉字也都是2个字节
        System.out.println(datas.length);





        datas = msg.getBytes("GBK");
        // 输出结果是15
        System.out.println(datas.length);


        // 解码：字节数组--》字符串
        String msg1 = new String(datas);
        // 这里出现乱码是因为上边我把编码后的字符集改成了GBK形式,故如果需要改回来,则应该传入对应的字符集,如果不传入字符集,则是系统默认的字符集
        System.out.println(msg1);

        String msg2 = new String(datas, "GBK");
        System.out.println(msg2);

        String msg3 = new String(datas, 0, datas.length-1, "gbk");


    }
}
