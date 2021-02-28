import java.lang.String;
class Count{
	int count=0;
	public void increment(){
     synchronized(this){
	 count++;
	  }
    }
}
class Thread1 extends Thread{
			Count c = new Count();
			Thread1(Count c){
				this.c=c;
			}
			public void run(){
				for(int i = 1;i<=1000;i++){
					 c.increment();
		            }
	            }
         }
 class Thread2 extends Thread{
			Count c = new Count();
			Thread2(Count c){
				this.c=c;
			}
			public void run(){
				for(int i = 1;i<=1000;i++){
					 c.increment();
		            }
	            }
         }                
public class Synchronized_Method{
	public static void main(String[] args)  {
	Count c = new Count();
		
          Thread1 t = new Thread1(c);
           Thread2 t1 = new Thread2(c);
          try{
          t.start();
          t1.start();
          t.join();
          t1.join();
      }catch(Exception e){}
		System.out.print(c.count);
	}
}