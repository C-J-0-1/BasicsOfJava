import java.io.*;

class JavaIO{
	public static void main(String args[]) throws Exception{
		FileOutputStream fout = new FileOutputStream("Numbers.txt");
		
		for(int i = 49 ; i < 54 ; i++){
			fout.write(i);
		}
		fout.close();
		
		FileInputStream fin = new FileInputStream("Numbers.txt");
		
		System.out.print("\nContents of Number.txt: ");
		int content;
		while((content = fin.read()) != -1){
			System.out.print((char)content + ", ");
		}
		fin.close();
	}
}