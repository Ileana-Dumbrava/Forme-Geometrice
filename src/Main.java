import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

	/*
		Shape shape1 = new Shape("Math is easy", "plastic");
		Shape shape2 = new Shape();	
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println();
	*/	
		Triangle triangle1 = new Triangle("Chemestry is easy", "steel", 2, 7);
		Triangle triangle2 = new Triangle(4,8);
		Triangle triangle3 = new Triangle("Chemestry is easy", "steel", 2, 7);
		Triangle triangle4 = triangle3;
		System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println(triangle3);
		System.out.println(triangle1.equals(triangle3));
		System.out.println(triangle1.hashCode());
		System.out.println(triangle3.hashCode());
		System.out.println((triangle3.hashCode() == triangle4.hashCode()) ? true : false);
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle("Drawing is easy", "aluminium", 3, 6);
		Rectangle rectangle2 = new Rectangle(4, 3);		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		rectangle1.displayRectangleHeight();
		System.out.println();
		
		ArrayList<Shape> allShapes = new ArrayList<Shape>();
	//	allShapes.add(shape1);
	//	allShapes.add(shape2);
		allShapes.add(triangle1);
		allShapes.add(triangle3);
		allShapes.add(rectangle1);
		allShapes.add(rectangle2);
		
		System.out.println(allShapes); //va apela metoda Override din fiecare clasa, mai putin in cazul celor generice
		
		for (Shape item : allShapes) { //va apela metoda Override din fiecare clasa, mai putin in cazul celor generice
			System.out.println(item.getSize());
		}	
	
		for (Shape item : allShapes) {
			if (item instanceof Triangle) {
				Triangle triangleRef = (Triangle)item;
				triangleRef.displayTraingleHeight();
			} else if (item instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle)item;
				rectangleRef.displayRectangleHeight();
			}
		}
	}
}
