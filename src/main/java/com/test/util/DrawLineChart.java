package com.test.util;

import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DrawLineChart implements Drawing {
    private final List<Point> points = new ArrayList<>();

    public DrawLineChart() {
        StdDraw.setCanvasSize(800,800);
        StdDraw.setXscale(-20,100);
        StdDraw.setYscale(-20,100);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(.005);
//        StdDraw.setCanvasSize(150,150);
//        StdDraw.setCanvasSize();
    }

    public boolean addPoint(Point point){
       return points.add(point);
    }

    public boolean addPoint(double xpoint,double ypoint){
        return points.add(new Point(xpoint,ypoint));
    }

    @Override
    public void drawing() {
        StdDraw.line(0,0,0,100);
        StdDraw.line(0,0,100,0);
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = iterator.next();
            StdDraw.point(point.getxPoint(),point.getyPoint());
        }
    }
}
