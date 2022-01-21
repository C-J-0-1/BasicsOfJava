class Rectangle{
	int length, width, height;
	Rectangle(){
		length = width = height = 1;
	}
	Rectangle(int l){
		length = width = height = l;
	}
	Rectangle(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	int area(){
		return 2*(length*width + width*height + height*length);
	}
	int volume(){
		return length*width*height;
	}
}

class Overloading{
	public static void main(String args[]){
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5);
		Rectangle rect3 = new Rectangle(3, 5, 6);
		
		System.out.println("\nFirst Rectangle:\n" + "Area: " + rect1.area() + "\t\tVolume: " + rect1.volume());
		System.out.println("Second Rectangle:\n" + "Area: " + rect2.area() + "\tVolume: " + rect2.volume());
		System.out.println("Third Rectangle:\n" + "Area: " + rect3.area() + "\tVolume: " + rect3.volume());
	}
}