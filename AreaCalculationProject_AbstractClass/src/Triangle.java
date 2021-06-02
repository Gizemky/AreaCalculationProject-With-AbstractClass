

public class  Triangle extends Figure {

	private int a;
	private int b;
	private int c;
	
	public Triangle(String figure_name, int a, int b,int c) {
		super(figure_name);
		this.a = a;
		this.b = b;
		this.c = c;
		
		
		
	}


	@Override
	public void area_calculation() {
		double u = (a+b+c) / 2 * 2.0;
		double area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		
		System.out.println ("Area of the " + getFigure_name() + " : " + area );
		
	}

}
