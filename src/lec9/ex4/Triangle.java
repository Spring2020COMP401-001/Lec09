package lec9.ex4;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle(Point[] points) {
		this(points[0], points[1], points[2]);
	}
	
	public Triangle(double x1, double y1,
			 double x2, double y2,
			 double x3, double y3) {
		this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
	}
		
	public void move(double dx, double dy) {
		a = new Point(a.getX() + dx, a.getY() + dy);
		b = new Point(b.getX() + dx, b.getY() + dy);
		c = new Point(c.getX() + dx, c.getY() + dy);
	}
	
	public void move(Point bc) {
		Point cur_bc = getBarycenter();
		
		double dx = bc.getX() - cur_bc.getX();
		double dy = bc.getY() - cur_bc.getY();
		
		move(dx, dy);
	}
	
	public Point getBarycenter() {
		double bc_x = (a.getX() + b.getX() + c.getX()) / 3.0;
		double bc_y = (a.getY() + b.getY() + c.getY()) / 3.0;
		
		return new Point(bc_x, bc_y);
	}

}
