

class newthread implements Runnable
{
	Thread t;
	String tname;
	
	public newthread(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(this+" : "+i);
				Thread.sleep(500);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("child thread exiting");
	}
		
	}
	
public class TreadDemo {
	
	public static void main(String[] args) {
		new newthread("one");
		new newthread("two");
		new newthread("three");
		
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("main tread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main thread exiting");
	}

}

