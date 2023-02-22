package fr.fms.thread;

public class TestThread extends Thread {
	
	public TestThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 20; i++)
			System.out.println(this.getName());
	}
	
	public static void main(String[] args) {
		TestThread t = new TestThread("-- A --");
		TestThread t1 = new TestThread("---- B ----");
		t.start();
		t1.start();
		
	}

}
