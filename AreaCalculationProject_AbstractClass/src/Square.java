
public class Square extends Figure {

	private int d;
	
	
	public Square(String figure_name,int d) {
		super(figure_name);
		this.d = d;
		
	}

	@Override
	public void area_calculation() {
		
	
	
	System.out.println ("Area of the " + getFigure_name() + " : " + (d*d) );
		
		
	}

}
