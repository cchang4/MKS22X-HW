public class Recursion{

    public String name(){
	return "Chang, Catherine";
    }

    public double sqrt(double n){
	if (n < 0){
	    throw new IllegalArgumentException();
	}

        return sqrtHelp(n, 1);
    }

    public double sqrtHelp(double n, double guess){	
	guess = (n / guess+guess) / 2;

	System.out.println(guess);

        return  sqrtHelp(n, guess);

    }

}
