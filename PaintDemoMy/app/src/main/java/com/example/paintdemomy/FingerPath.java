package com.example.paintdemomy;


import android.graphics.Path;

public class FingerPath {

    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;
    public boolean erase;

    public FingerPath(int color, boolean emboss, boolean blur,boolean eraser ,int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
        this.erase = eraser;
    }
}
