class RunnablePractical implements Runnable{
	public void run(){
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i+1 + ".) " + Thread.currentThread().getName() + " is running.");
		}
	}
	
	public static void main(String args[]){
		RunnablePractical r1 = new RunnablePractical();
		RunnablePractical r2 = new RunnablePractical();
		
		Thread t1 = new Thread(r1, "First Thread");
		Thread t2 = new Thread(r2, "Second Thread");
		
		t1.start();
		t2.start();
	}
}