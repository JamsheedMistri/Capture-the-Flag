package day4;

import java.util.ArrayList;

import apcs.Window;

public class CaptureTheFlag {
	static ArrayList<Thing> things = new ArrayList<Thing>();
	static boolean loading = true;
	static int loadingbar = 0;
	static int time = 0; 
	public static int bluekills = 0;
	public static int redkills = 0;
	static boolean bluewins = false;
	static boolean redwins = false;
	
	public static void main(String[] args) {
		setup();

		while(true) {
			if (bluewins) {
				Window.out.background("black");
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 10 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 9 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 8 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 7 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 6 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 5 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 4 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 3 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 2 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.color(15, 211, 255);
				Window.out.font("monospaced", 41);
				Window.out.print("BLUE WINS! EXITING GAME IN 1 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				System.exit(0);
			}
			if (redwins) {
				Window.out.background("black");
				Window.out.color(181, 25, 25);
				Window.out.font("monospaced", 41);
				Window.out.print("RED WINS! EXITING GAME IN 10 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 9 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 8 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 7 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 6 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 5 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 4 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 3 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 2 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				Window.out.print("RED WINS! EXITING GAME IN 1 SECONDS...", Window.width() / 2 - 500, Window.height() / 2);
				Window.frame(1000);
				System.exit(0);
			}
			if (loading) {
				Window.out.background("black");
				Window.out.color(181, 25, 25);
				Window.out.font("monospaced", 50);
				Window.out.print("WELCOME TO CAPUTRE THE FLAG!", Window.width() / 2 - 400, Window.height() / 2 - 150);
				Window.out.color(15, 211, 255);
				Window.out.print("Loading...", Window.width() / 2 - 150, Window.height() / 2 - 50);
				Window.out.color("white");
				Window.out.rectangle(Window.width() / 2, Window.height() / 2 + 50, 210, 35);
				Window.out.color(15, 211, 255);
				Window.out.rectangle(Window.width() / 2, Window.height() / 2 + 50, loadingbar, 25);
				if (loadingbar >= 25) {
					loadingbar += 3;
					if (loadingbar >= 75) {
						loadingbar -= 2;
						if (loadingbar >= 150) {
							loadingbar += 3;
							if (loadingbar >= 200) {
								loading = false;
							}
						}
					}
				}

				loadingbar ++;
			}
			else {
				drawBackground();
				for (Thing t : things) {

					t.draw();
					t.move();

					for (Thing o : things) {
						if (t != o && t.checkCollision(o) == 1) {
							o.follow(t.getX(), t.getY());
							for (Thing j : things) {
								if (o != j && t.checkCollision(j) == 3) {
									if (t.getNumber() == 1) {
										bluewins = true;
									}
									else if (t.getNumber() == 2) {
										redwins = true;
									}
								}
							}
						}
						if (t != o && t.checkCollision(o) == 2) {
							t.follow(100, Window.height() / 2);
							if (t.getNumber() == 1) {
								redkills++;
							}
							else if (t.getNumber() == 2) {
								bluekills++;
							}
						}
					}

				}
			}
			time ++;
			Window.frame();
		}


	}
	public static void setup() {
		Window.size(1200, 800);
		things = new ArrayList<Thing>();
		Thing p1 = new Player(1);
		Thing p2 = new Player(2);
		things.add(p1);
		things.add(p2);

		Flag f1 = new Flag(1);
		Flag f2 = new Flag(2);

		things.add(f1);
		things.add(f2);

	}

	public static void drawBackground() {
		Window.out.background("dark green");
		for (int i = 0; i < Window.width() + 1; i += 50) {
			for (int j = 0; j < Window.height() + 1; j +=50) {
				Window.out.color("green");
				Window.out.square(i, j, 45);
			}
		}
		Window.out.color("white");
		Window.out.circle(Window.width() / 2, Window.height() / 2, 75);
		Window.out.color("green");
		Window.out.circle(Window.width() / 2, Window.height() / 2, 65);
		Window.out.color("white");
		Window.out.rectangle(Window.width() / 2, 0, 10, Window.height() * 2);

		Window.out.rectangle(0, Window.height() / 2, 400, 400);
		Window.out.rectangle(Window.width(), Window.height() / 2, 400, 400);

		Window.out.color("green");
		Window.out.rectangle(0, Window.height() / 2, 380, 380);
		Window.out.rectangle(Window.width(), Window.height() / 2, 380, 380);
		
		Window.out.color("white");
		Window.out.font("serif", 30);
		Window.out.print("Time (frames): " + time, 25, 50);
		
		Window.out.print("Blue Kills: " + bluekills, 25, Window.height() - 50);
		Window.out.print("Red Kills: " + redkills, Window.width() - 200, Window.height() - 50);
	}


}
