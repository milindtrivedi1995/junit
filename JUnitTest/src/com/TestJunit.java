package com;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
      
   }
   @Test
   public void testMessage() {	  
      assertEquals("Hello"+" World",messageUtil.printMessage());
   }
   
   @Test
   public void testMilinddMessage() {	  
      assertEquals("Milind",messageUtil.printMessage());
   }
}