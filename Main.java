package task;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* one eternity later*/
public class Main {
    public static void main(String[] args) throws Exception {
        RgbMaster rbgMaster = new RgbMaster("src/img.png");
        ImageFunctionsImpl impl = new ImageFunctionsImpl();
        rbgMaster.iterateInImage((x) -> {
            try {
                rbgMaster.changeImage(impl::inversion);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        rbgMaster.save("out_img.png");
    }
}