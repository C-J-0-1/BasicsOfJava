class ThreadPractical extends Thread{
	public void run(){
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i+1 + ".) " + Thread.currentThread().getName() + " is running.");
		}
	}
	
	public static void main(String args[]){
		ThreadPractical t1 = new ThreadPractical();
		ThreadPractical t2 = new ThreadPractical();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();
	}
}