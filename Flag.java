package day4;

import apcs.Window;

public class Flag implements Thing {

	int x, y, flag, r, g, b, size;
	
	public Flag(int flag) {
		this.flag = flag;
		if (flag == 1) {
			x = 100;
			y = Window.height() / 2;
			r = 15;
			g = 211;
			b = 255;
			size = 25;
		}
		else {
			x = Window.width() - 100;
			y = Window.height() / 2;
			r = 181;
			g = 25;
			b = 25;
			size = 25;
		}
		
		
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Window.out.color(r, g, b);
		Window.out.square(x, y, size);
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int checkCollision(Thing o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFlag() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void follow(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return flag;
	}

}
