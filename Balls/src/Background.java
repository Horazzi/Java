package ru.gb.jtwo.lone.online.circles;

import java.awt.*;

public class Background extends Sprite {
    int red = 0;
    int grn = 0;
    int blu = 0;

    @Override
    void render(GameCanvas canvas, Graphics g) {
        int rcolor;
        int gcolor;
        int bcolor;
        if (red == 255) {
            if (grn == 255){
                if (blu == 255){
                    red = -red;
                    grn = -grn;
                    blu = -blu;
                }
                else blu++;
            }
            else grn++;
        }
        else red++;
        rcolor = Math.abs(red);
        gcolor = Math.abs(grn);
        bcolor = Math.abs(blu);
        Color bgColor = new Color(rcolor, gcolor, bcolor);
        canvas.setBackground(bgColor);
    }
}