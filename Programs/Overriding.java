class Rectangle{
	int length, width;
	Rectangle(){}
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	int area(){
		return length*width;
	}
}

class Square extends Rectangle{
	Square(int length){
		this.length = length;
	}
	int area(){
		return length*length;
	}
}

class Overriding{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(5, 7);
		System.out.println("Area of Rectangle: " + rect.area());
		
		Square square = new Square(4);
		System.out.println("Area of Square: " + square.area());
	}
}