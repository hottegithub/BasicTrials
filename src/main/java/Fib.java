import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fib fi = new Fib();
		fi.generateFibStr("50");
	}

	public String generateFibStr(String str) {
		
		long n = Long.parseLong(str);
		String returnStr = "";
		long arr[] = new long[(int) n];
		arr[0] = 0;
		arr[1] = 1;
		
		long  t1 = 0, t2 = 1;
		
	        System.out.println("First " + n + " terms: ");
	        for (int i = 2; i < n; ++i)
	        {
	        	arr[i] = arr[i - 1] + arr[i - 2]; 
	        	System.out.println(i +"th element is >>"+arr[i]);
	        }

	        System.out.println(" ++++++++++++++++++++++++++++++++yyy");
	        returnStr = Arrays.toString(arr);
	        System.out.println("returnStr >>>"+returnStr);
	        
		return Arrays.toString(arr);
	}

	
}
