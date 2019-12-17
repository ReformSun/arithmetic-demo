package com.test.picture;

import edu.princeton.cs.algs4.BinaryStdIn;
import edu.princeton.cs.algs4.Picture;

import java.awt.*;

public class TestMain1 {
    public static void main(String[] args) {
        testMethod1();
    }

    public static void testMethod1() {
        int width = 50;
        int height = 50;
        Picture picture = new Picture(width, height);
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (!BinaryStdIn.isEmpty()) {
                    boolean bit = BinaryStdIn.readBoolean();
                    if (bit) picture.set(col, row, Color.BLACK);
                    else     picture.set(col, row, Color.WHITE);
                }
                else {
                    picture.set(col, row, Color.RED);
                }
            }
        }
        picture.show();
    }
}
