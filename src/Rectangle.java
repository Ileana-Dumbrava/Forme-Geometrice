
public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String text, String material, int width, int height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}
	
	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " + this.height);
	}
	
	@Override
	public double getSize() {
		double sizeRectangle = this.width * this.height;
		return sizeRectangle;
	}
	
	@Override
	public String toString() {
		String result = "Rectangle: height is " + this.height + ", width is: " + this.width + ", " + super.toString();
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
		
		Rectangle rectangle = (Rectangle) obj;
		if (super.equals(rectangle) && this.width == rectangle.width && this.height == rectangle.height) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}
	
	
}
