class Shape{
	int length, width, height;
	
	Shape(){
		System.out.println("\nShape Created.");
	}
	int area(){
		return 2*(length*width + width*height + height*length);
	}
	int volume(){
		return length*width*height;
	}
}

class Cube extends Shape{
	Cube(){
		System.out.println("Cube Created.");
	}
}

class Inheritance{
	public static void main(String args[]){
		Cube cube = new Cube();
		cube.length = 2;
		cube.width = 3;
		cube.height = 5;
		
		System.out.print("\nDetails about Cube:");
		System.out.print("\nLength: " + cube.length + 
						"\tWidth: " + cube.width + 
						"\tHeight: " + cube.height);
		System.out.print("\nArea of Cube: " + cube.area());
		System.out.print("\nVolume of Cube: " + cube.volume());
	}
}