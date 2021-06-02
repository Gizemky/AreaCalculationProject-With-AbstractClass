
public abstract class Figure {
	
	private String figure_name;

	public Figure(String figure_name) {
		
		this.figure_name = figure_name;
	}

	public String getFigure_name() {
		return figure_name;
	}

	
	public void setFigure_name(String figure_name) {
		this.figure_name = figure_name;
	}
	
	abstract void area_calculation ();
	
	

}
