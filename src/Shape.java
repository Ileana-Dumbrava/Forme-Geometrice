
public abstract class Shape {
	private String text;
	private String material;
	
	public Shape() {
		this.text = null;
		this.material = null;
	}
	
	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}
	
	abstract double getSize();
	
	@Override
	public String toString() {
		String result = "Made of " + this.material + ", contains the text: " + this.text;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Shape shape = (Shape) obj;
		if (this.text.equals(shape.text) && this.material.equals(shape.material)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}
}
