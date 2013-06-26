/**
 * @author rholtz
 * @description This application will take an input N from the user and construct a 
 *              string representation of the Fibonacci Sequence that to the Nth
 *              sequence number.
 */

package org.holtz.fibonacci;

import java.math.BigInteger;

public class Fibonacci {
	
	
	public String fib(int n) {
        
		int prev1=0, prev2=1;
		StringBuffer buf = new StringBuffer();
        for(int i=0; i<n; i++) {
            buf.append(prev1 + " ");
        	int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
        }
        return buf.toString();
	}

	public String getSequence(int count) {
		if(count > 0)
			if(count < 48)
				return fib(count);
			else
				return("Integer overrun has occured!");
		else 
			return ("Must be a positive number!");
	}
	
	public String getBigSequence(long count) {
		if(count > 0)
			return bigFib(count);
		else
			return ("Must be a positive number!");
	}
	
	public String bigFib(long n1) {
		
		BigInteger prev1 = new BigInteger("0");
		BigInteger prev2 = new BigInteger("1");
		StringBuffer buf = new StringBuffer();
		for(long i = 0;  i<n1; i++) {
			buf.append(prev1 + " ");
			BigInteger savePrev1 = prev1;
			prev1 = prev2;
            prev2 = savePrev1.add(prev2);
		}
		return buf.toString();
	}

}
