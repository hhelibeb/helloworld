/* Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).

Note: you may assume that n is not less than 2.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
*/
public class Solution {
    public int integerBreak(int n) 
    {
        if(n < 4) return n-1;
        int a=n/3;
		int b=n-a*3;
		if (b==1)
		{
			a=a-1;
			return pow(3, a)*4;
		}
		else if (b==2)
		{
			return pow(3, a)*2;
		}
		else 
		{
			return pow(3, a);
		}
    }
    public int pow(int x,int n){  
	      
	    if(n==0)  
	        return 1;  
	    else{  
	          
	        //判断n的奇偶  
	        if(n%2==0)  
	            return pow(x*x, n/2);  
	        else   
	            return pow(x*x, (n-1)/2)*x;  
	          
	    }  
	}  
}
