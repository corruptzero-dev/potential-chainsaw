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
        rbgMaster.changeImage(impl::inversion);
        rbgMaster.save("out_img.png");
    }
}
