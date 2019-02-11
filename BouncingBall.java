import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner; 

public class BouncingBall {

		private static Point2D.Double min,max;
		private static Ball ball;


		public static void main(String[] args) {
			setup();

			while(true) {
				loop();
			}
		}

		public static void setup(){
			min = new Point2D.Double(0 , 0);
			max = new Point2D.Double(10000, 10000);

			StdDraw.setXscale(min.x, max.x);
			StdDraw.setYscale(min.y,max.y);
			StdDraw.enableDoubleBuffering();

			System.out.println("Number of Balls:");
 
			Scanner scanner = new Scanner(System.in);
			public static int ballNumber =  scanner.nextInt();
			
			ArrayList<Ball> balls = new ArrayList<Ball>();
			for(int x = 0; x < ballNumber; x++)
			{
				list.add(new Ball(50, 50, 40, StdDraw.WHITE));
			}

		}



		public static void loop() {
				StdDraw.clear(StdDraw.GRAY);

			for(int x = 0; x < ballNumber; x++){
				balls.get(x).draw();

				StdDraw.show();

				ball.update(min, max);
			}
		}
}