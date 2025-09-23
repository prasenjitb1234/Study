package com.ExceptionHandling;

public class Test {
	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println(100 / 0); // exception
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		
		
		/*
		 ****************************
		 
		 Object => 
		     Throwable => 
		         Exception => (Recoverable)
		         Error => (Not recoverable by programmer)

		 Exceptions are recoverable, while Errors are not recoverable by programmers.

		 Exception Types:
		 -----------------
		 1. **Checked Exceptions (Compile-Time Exceptions):**
		    These exceptions are checked by the compiler at compile-time. 
		    Examples:
		    - ClassNotFoundException
		    - NoSuchMethodException
		    - IOException
		        - EOFException
		        - FileNotFoundException
		        - InterruptedIOException
		    - SQLException

		 2. **Unchecked Exceptions (Runtime Exceptions):**
		    These exceptions occur during the program's execution and are not checked at compile-time.
		    Examples:
		    - RuntimeException
		    	-ArithmeticException
		        - IndexOutOfBoundsException
		            - ArrayIndexOutOfBoundsException
		            - StringIndexOutOfBoundsException
		        - NullPointerException
		        - ClassCastException
		        -IllegalArgumentException

		 Error:
		 -------
		 Errors are severe issues that are beyond the programmer's control. They usually indicate problems with the environment in which the application is running.
		 
		 Examples:
		 - OutOfMemoryError
		 - StackOverflowError
		 - VirtualMachineError
		 - AssertionError

		 Key Difference Between Exception and Error:
		 -------------------------------------------
		 - **Exception:** Recoverable. Can be caught and handled using try-catch blocks.
		 - **Error:** Not recoverable. Indicates serious issues that require changes to the runtime environment or application configuration.

		 ****************************
		 */

		
		
		
		
		
		
	}
}
