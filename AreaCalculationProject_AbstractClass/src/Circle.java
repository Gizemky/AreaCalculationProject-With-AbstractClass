
public class Circle  extends Figure {
	
	private int radius;

	public Circle(String figure_name, int radius) {
		super(figure_name);
		this.radius = radius;
		
	}

	@Override
	public void area_calculation() {
		
		System.out.println("Area of the " + getFigure_name() + " : "  + (Math.PI * radius * radius));
		
	}

}
