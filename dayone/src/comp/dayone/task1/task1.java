package comp.dayone.task1;

public class task1 {

	public static void main(String[] args) {
		//Area of parallelogram
		int base = 23;
		int height = 54;
		
		int area = base * height;
		System.out.println("area of parallelogram:" +area);
		
		//Area of circle
		float radius = 45.456f;
		
		double areac = Math.PI * radius * radius;
		System.out.println("Area of circle:"+ areac);
    
		//Area of triangle
		float b = 23.566f;
		double h = 567.9889768;
		
		double areat = 0.5 * b * h;
		System.out.println("Area of Triangle:"+areat);
		
		//Area of square
		float side = 34.56f;
		
		double areas = side * side;
		System.out.println("Area of Square:"+areas);
		
		//Area of sphere
		
		float radi = 34.567f;
		
		double areasphere = 4 * Math.PI * radi * radi;
		float areaspheref = 4 * 3.14f * radi * radi;

		System.out.println("Area of Sphere:"+areasphere);
		System.out.println("Area of Sphere:"+areaspheref);
		
		//Faranhite to celcius
		
		float faranhite = 34.679f;
		float celcius = (faranhite - 32) * 5/9;
		double celcius1 = (faranhite - 32) * 5/9;
		
		System.out.println("Faranhite to celcius conversion:"+celcius);
		System.out.println("Faranhite to celcius conversion:"+celcius1);
		
		
	}

}
