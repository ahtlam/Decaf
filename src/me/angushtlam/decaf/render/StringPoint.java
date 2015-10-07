package me.angushtlam.decaf.render;

import java.awt.Point;

public class StringPoint {
	private Point point;
	private String str;
	
	public StringPoint(String str, Point point) {
		this.point = point;
		this.str = str;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getString() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
