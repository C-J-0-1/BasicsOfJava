import java.util.Collections;
import java.util.ArrayList;

class Subject implements Comparable<Subject>{
	int subjectCode;
	String subjectName;
	
	Subject(int subjectCode, String subjectName){
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}
	
	// Sort by Subject Code
	public int compareTo(Subject s){
		return this.subjectCode - s.subjectCode; // Accending order
		// For Descending order:
		// return s.subjectCode - this.subjectCode
	}
	
	// Sort by Subject Name
	/*public int compareTo(Subject s){
		return this.subjectName.compareTo(s.subjectName); // Accending order
		// For Descending order:
		// return s.subjectName.compareTo(this.subjectName)
	}*/
}

class ComparablePractical{
	public static void main(String args[]){
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		subjectList.add(new Subject(2, "Mathematics"));
		subjectList.add(new Subject(4, "English"));
		subjectList.add(new Subject(3, "Science"));
		subjectList.add(new Subject(1, "Social Science"));
		
		System.out.println("\nBefore Sorting: ");
		for(Subject s: subjectList){
			System.out.println(s.subjectCode + "-> " + s.subjectName);
		}
		
		Collections.sort(subjectList);
		System.out.println("\nAfter Sorting: ");
		for(Subject s: subjectList){
			System.out.println(s.subjectCode + "-> " + s.subjectName);
		}
	}
}