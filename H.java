import java.awt.geom.Point2D;
import java.awt.Color;


public class H{
	private Point2D.Double center;
	private double radius;
	private Point2D.Double velocity;
	private Color fill;
	private double x_scale;
	private double y_scale;

	public H(double center_x, double center_y, Color fill, double x_scale, double y_scale){
		center = new Point2D.Double(center_x, center_y);
		this.radius = radius;
		this.fill = fill;
		x_scale = x_scale;
		y_scale = y_scale;
	}

	public void draw() {
		StdDraw.setPenColor(fill);
		StdDraw.line(center.x +x_scale, center.y+y_scale, center.x-x_scale, center.y-y_scale); //horizontal
		//StdDraw.line(center.x+x_scale, center.y+ (y_scale * 2.0), center.x+x_scale, center.y-(y_scale * 2.0)); //verticle left
		//StdDraw.line(center.x -x_scale, center.y+ (y_scale * 2.0), center.x-x_scale, center.y-(y_scale * 2.0)); //verticle right
	}
}
