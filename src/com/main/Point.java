package com.main;

public class Point {
	double x;
	double y;	
	double height;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	Point(double x, double y,double height){
		this.x = x;
		this.y = y;
		this.height = height;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
