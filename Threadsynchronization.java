import corejava.thiskeyword;

class callback{


	public void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	
	}
}
class caller implements Runnable
{
	Thread t;
	String msg;
	callback c;
	public caller (String msg,callback c) {
		
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
	}


	public void run() {
		synchronized (c) {
		c.call(msg);
		}
	}	
}
public class Threadsynchronization {
	public static void main(String[] args) {
		callback c=new callback();
		caller c1=new caller("hello", c) ;
		caller c2=new caller("world", c) ;
		caller c3=new caller("synchronization", c) ;
		
		
		
		
		
	}
}




	
	

	



