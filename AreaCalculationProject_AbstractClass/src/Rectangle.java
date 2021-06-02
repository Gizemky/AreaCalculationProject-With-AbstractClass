
public class Rectangle extends Figure {

	private int long_edge;
	private int short_edge;
	
	public Rectangle(String figure_name,int long_edge,int short_edge) {
		super(figure_name);
		
		this.long_edge = long_edge;
		this.short_edge = short_edge;
		
	}

	@Override
	public void area_calculation() {
	
		System.out.println ("Area of the " + getFigure_name() + " : " + (long_edge * short_edge) );
		
	}
	
	

}
