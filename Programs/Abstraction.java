interface Shape{
	int area();
	int volume();
}

class Cube implements Shape{
	int length, width, height;
	Cube(int length, int width, int height){
		System.out.println("\nCube Created.");
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public int area(){
		return 2*(length*width + width*height + height*length);
	}
	public int volume(){
		return length*width*height;
	}
}

class Abstraction{
	public static void main(String args[]){
		Cube cube = new Cube(3, 6, 2);
		
		System.out.print("\nDetails about Cube:");
		System.out.print("\nLength: " + cube.length + 
						"\tWidth: " + cube.width + 
						"\tHeight: " + cube.height);
		System.out.print("\nArea of Cube: " + cube.area());
		System.out.print("\nVolume of Cube: " + cube.volume());
	}
}