package day4;

public interface Thing {
	public void draw();
	public void move();
	public int checkCollision(Thing o);
	public boolean isFlag();
	public void follow(int x, int y);
	public int getX();
	public int getY();
	public int getRadius();
	public int getSize();
	public int getNumber();

}
