import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.ArrayList;

public class h_recursion {

		private static Point2D.Double min,max;
		private static H h;


		public static void main(String[] args) {
			setup();

			draw();
		}

		public static void setup(){
			min = new Point2D.Double(0 ,0);
			max = new Point2D.Double(200, 200);

			StdDraw.setXscale(min.x, max.x);
			StdDraw.setYscale(min.y,max.y);
			StdDraw.enableDoubleBuffering();
			h = new H(100, 100, StdDraw.WHITE, 10, 10);
			h.draw();
		}



		public static void draw() {
			StdDraw.clear(StdDraw.GRAY);
			h.draw();
			StdDraw.show();
		}
		
}