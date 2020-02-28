package cn.sxt.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * @author NiuQun
 * @2019/10/12
 */

public class GameUtil {
    /**
     * 工具类最好将构造器私有
     * 这样别人就不能访问该类的构造器，也就不能实例化该类
     */
    private GameUtil() {

    }

    /**
     * @param path
     * @return 返回指定路径文件的图片对象
     */
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return bi;

    }
}


