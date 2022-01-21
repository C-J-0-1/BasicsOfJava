class Subject implements Cloneable{
	int subjectCode;
	String subjectName;
	
	Subject(int subjectCode, String subjectName){
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}
	
	void getSubjectDetails(){
		System.out.println("Subject Details => \tSubject Code: " + subjectCode + "\n\t\t\tSubject Name: " + subjectName);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class ClonePractical{
	public static void main(String args[]) throws CloneNotSupportedException{
		Subject s1 = new Subject(1, "English");
		Subject s2 = (Subject)s1.clone();
		
		s1.getSubjectDetails();
		s2.getSubjectDetails();
	}
}