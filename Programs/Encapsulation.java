class Students{
	private int rollNo, age, standard;
	private String name;
	
	void setName(String name){
		this.name = name;
	}
	
	void setStandard(int standard){
		this.standard = standard;
	}
	
	void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	
	void setAge(int age){
		this.age = age;
	}
	
	String getName(){
		return name;
	}
	
	int getStandard(){
		return standard;
	}
	
	int getRollNo(){
		return rollNo;
	}
	
	int getAge(){
		return age;
	}
}

class Encapsulation{
	public static void main(String args[]){
		
		Students student1 = new Students();
		student1.setName("Ram");
		student1.setStandard(12);
		student1.setRollNo(2);
		student1.setAge(17);
		System.out.print("\nName : " + student1.getName() + 
						"\nStandard: " + student1.getStandard() + 
						"\nRoll No.: " + student1.getRollNo() + 
						"\nAge: " + student1.getAge());
						
		Students student2 = new Students();
		student2.setName("Rahul");
		student2.setStandard(10);
		student2.setRollNo(1);
		student2.setAge(15);
		System.out.print("\n\nName : " + student2.getName() + 
						"\nStandard: " + student2.getStandard() + 
						"\nRoll No.: " + student2.getRollNo() + 
						"\nAge: " + student2.getAge());
	}
}