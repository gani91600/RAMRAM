
package com.example.MYPROJECT.controllers3e;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "home";  // loads home.html
    }

    @GetMapping(value = "/hello.png", produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] helloPng() throws IOException {
        int width = 300, height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.setPaint(Color.BLUE);
        g2d.setFont(new Font("Arial", Font.BOLD, 28));
        g2d.drawString("Hello World", 60, 60);
        g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }
}




