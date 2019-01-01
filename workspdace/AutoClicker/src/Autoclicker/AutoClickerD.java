package Autoclicker;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoClickerD {
	
	public static void main(String[] args) 
	{
		
	while(true) {
		try 
		{
		
			
			{
				Robot r = new Robot();
				
				
				r.mousePress(KeyEvent.BUTTON1_MASK);
				r.mouseRelease(KeyEvent.BUTTON1_MASK);
				
				try {
			         Thread.sleep(45000);
			     } catch (InterruptedException ie)
			     {
			      
			     }
			}
		}
		
		
		
		
		
		
	
				
		catch (Exception e)
		
		{
			System.out.println(e);
		}
	}
}
	
}
		