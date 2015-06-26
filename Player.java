package day4;

import apcs.Window;

public class Player implements Thing {
	int x, y, radius, player, speed;
	int r, g, b;

	public Player(int player) {
		this.player = player;
		if (player == 1) {
			x = 100;
			r = 15;
			g = 211;
			b = 255;
		}
		else {
			x = Window.width() - 100;
			r = 181;
			g = 25;
			b = 25;
		}
		y = Window.height() / 2;
		radius = 20;
		speed = 15;

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Window.out.color(r, g, b);
		Window.out.circle(x, y, radius);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if (player == 1) {
			if (Window.key.pressed("w") && y > radius) {
				y -= speed;

			}
			if (Window.key.pressed("s") && y < Window.height() - radius) {
				y += speed;

			}
			if (Window.key.pressed("a") && x > radius) {
				x -= speed;

			}
			if (Window.key.pressed("d") && x < Window.width() - radius) {
				x += speed;

			}

		}

		else if (player == 2) {
			if (Window.key.pressed("up") && y > radius) {
				y -= speed;

			}
			if (Window.key.pressed("down") && y < Window.height() - radius) {
				y += speed;

			}
			if (Window.key.pressed("left") && x > radius) {
				x -= speed;

			}
			if (Window.key.pressed("right") && x < Window.width() - radius) {
				x += speed;

			}

		}
	}

	@Override
	public int checkCollision(Thing o) {
		// TODO Auto-generated method stub
		if (o.isFlag() && o.getNumber() != player) {
			if (Math.abs(x - o.getX()) <= radius + o.getSize() / 2 && Math.abs(y - o.getY()) <= radius + o.getSize() / 2) {
				return 1;
			}

		}
		else if (o.isFlag() && o.getNumber() == player) {
			if (Math.abs(x - o.getX()) <= radius + o.getSize() / 2 && Math.abs(y - o.getY()) <= radius + o.getSize() / 2) {
				return 3;
			}
		}
		else {
			if (player == 1 && x > Window.width () / 2) {
				if (Math.abs(x - o.getX()) <= radius + o.getRadius() / 2 && Math.abs(y - o.getY()) <= radius + o.getRadius() / 2) {
					return 2;
					//redkills += 1;
				}
			}
			else if (player == 2 && x < Window.width() / 2) {
				if (Math.abs(x - o.getX()) <= radius + o.getRadius() / 2 && Math.abs(y - o.getY()) <= radius + o.getRadius() / 2) {
					return 2;
				}
			}
		}
		return 0;
	}

	@Override
	public boolean isFlag() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		if (player == 1) {
			this.x = x;
			this.y = y;
		}
		else {
			this.x = Window.width() - 200;
			this.y = Window.height() / 2;
		}

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
		return radius;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return player;
	}

}
