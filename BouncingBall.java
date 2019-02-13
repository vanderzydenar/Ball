import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner; 

public class BouncingBall {

		private static Point2D.Double min,max;
		private static Ball ball;
		public static ArrayList<Ball> balls = new ArrayList<>();
		public static int ballNumber = 65;



		public static void main(String[] args) {
			setup();

			while(true) {
				loop();
			}
		}

		public static void setup(){
			min = new Point2D.Double(0 ,0);
			max = new Point2D.Double(1000, 1000);

			StdDraw.setXscale(min.x, max.x);
			StdDraw.setYscale(min.y,max.y);
			StdDraw.enableDoubleBuffering();

			for(int x = 0; x < ballNumber; x++)
			{
				balls.add(new Ball(500, 500, 40, StdDraw.WHITE));
			}

		}



		public static void loop() {
			StdDraw.clear(StdDraw.GRAY);

			for(int x = 0; x < ballNumber; x++){
				balls.get(x).draw();

				StdDraw.show();

				balls.get(x).update(min, max);
			}
		}
}