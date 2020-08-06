package inclass;

import java.io.IOException;
import java.util.InputMismatchException;

//Compile Time/Checked Exception always extends Eception which is Child of Throwable
public class ExceptionDemo1 extends Exception{

	public static void main(String[] args) {
		
		//nested try catch
		
		try {
			try {
				
			}
			//multi level exception
//			
			
			catch(ArithmeticException ae){
				System.out.println(ae);
			}
//			catch(IOException io) {
//				System.out.println(io);
//			}
			//this is parent exception which always has to be at the last after all its other child exceptions
			catch (Exception e)	{
				System.out.println(e);
			}
		}
		//MULTIPLE EXCEPTION can't have parent in same line
		 catch(ArithmeticException | InputMismatchException im){
		
			System.out.println(im);
		 }
		catch (Exception e)	{
			System.out.println(e);
		 }
		
	}

}
