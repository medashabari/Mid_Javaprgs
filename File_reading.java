import java.io.*;
import java.lang.String;
class File_reading{
	public static void main(String[] args) throws IOException {
		try{
			File f = new File("F:\\java 567\\Files_java\\Reading.txt");
			f.createNewFile();

			String s = "OCD";
			byte sc[] = s.getBytes(); 
			FileOutputStream fos = new FileOutputStream("F:\\java 567\\Files_java\\Reading.txt");
			for(int b=0;b<sc.length;b++){
			fos.write(sc[b]);
			 }
			 fos.close();
		}

		catch(Exception e){ System.out.println(e);}
		try{
			FileInputStream fis = new FileInputStream("F:\\java 567\\Files_java\\Reading.txt");
			int a=0;
			while((a=fis.read())!= -1){
				System.out.println(a);
			}
			fis.close();
		}

		catch(Exception e){ System.out.println(e);}

		
	}

}