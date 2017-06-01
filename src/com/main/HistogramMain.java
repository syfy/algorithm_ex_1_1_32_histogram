package com.main;

import java.util.ArrayList;
import java.util.Random;

import com.lib.StdDraw;

public class HistogramMain {
	static ArrayList<Point> points = new ArrayList<Point>();
	public static double GRAPH_WIDTH = 0.01225;
	public static double GRAPH_SPACE = 0.0125;
	public static double X_AXIS_HORIZ_OFFSET = 0;
	public static void drawHistogram(ArrayList<Point> points){
	    StdDraw.setPenRadius(0.025);
	    
        StdDraw.setPenColor(StdDraw.MAGENTA);
        double graph_space =0;
        for(Point point : points){
        	
            StdDraw.filledRectangle(point.getX(), point.getY(), GRAPH_WIDTH, point.getHeight());
           graph_space =+ 0.10;
        }
	}
	
	 public static void main(String[] args) {
	
        StdDraw.setPenRadius(0.025);
  
        StdDraw.setPenColor(StdDraw.MAGENTA);
        double height1  = 0.14;
        double height2  = 0.24;
        double height3  = 0.34;
        double height4  = 0.88;

        points.add(new Point(0.1,X_AXIS_HORIZ_OFFSET,height1));
        points.add(new Point(0.2,X_AXIS_HORIZ_OFFSET,height2));
        points.add(new Point(0.3,X_AXIS_HORIZ_OFFSET,height3));
        points.add(new Point(0.4,X_AXIS_HORIZ_OFFSET,height4));

        drawHistogram(points);
    }
}
