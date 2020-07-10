package top.jiaway.headfirst.Proxy.CDVMdemo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else{
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else{
            return 600;
        }
    }

    public void paintIcon(final Component c,Graphics g,int x,int y){
        if(imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        }else{
            g.drawString("Loading CD cover,please wait ..." , x+300,y+190);
            if(!retrieving){
                retrieving = true;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageUrl,"CD Cover");
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                }).start();

            }
        }
    }
}
