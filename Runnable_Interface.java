import java.lang.String;
class T1 implements Runnable{
	public void run(){
		for(int i = 1;i<=3;i++){
			System.out.println("Thread1");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class T2 implements Runnable{
	public void run(){
		for(int i = 1;i<=3;i++){
			System.out.println("Thread2");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class Runnable_Interface{
	public static void main(String[] args) {
		T1 obj1 = new T1();
		T2 obj2 = new T2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
	}
}