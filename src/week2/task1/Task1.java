package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        a = abs(a);
	    b = abs(b);
	    if (a == 0 && b != 0)
	    {
	    	return b;
	    }
	    else if (a != 0 && b == 0)
	    {
		    return a;
	    }
	    while (a != b)
	    {
		    if (a > b)
		    {
			    a -= b;
		    }
		    else
		    {
			    b -= a;
		    }
	    }
        return a;
        return 0;
    }

    public static int fibonacci(int n) {
        if (n == 0)
             return 1;
        if (n == 1)
             return 1;
        if (n > 1)
            return (fibonacci(n - 1))+(fibonacci(n - 2));
        return 0;
    }
}
