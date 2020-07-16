package july2020;

public class Power {
	
	public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
	
	//Alternate
	
	public double myPow2(double x, int n) {
        double temp;
        if(n == 0)
            return 1.000;
        temp = myPow(x,n/2);
        if (n%2 == 0)
            return temp*temp;
        else{
            if(n<0)
                return (temp*temp) / x;
            else
                return x*temp*temp;
        }
    }

}
