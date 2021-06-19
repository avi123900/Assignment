package com.avinash.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
	@Value("#{2+3}")
	private int x;
	private int y;
	@Value("{T(java.lang.Math).sqrt(25)}")
	private int z;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
		
		
	

}
