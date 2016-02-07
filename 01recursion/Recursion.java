public class Recursion{

    public String name(){
	return "Chang,Catherine";
    }

    public double sqrt(double n){
	if (n < 0){
	    throw new IllegalArgumentException();
	}

	if (n == 0) return n;

        return sqrtHelp(n, 1);
    }

    public double sqrtHelp(double n, double guess){	
	guess = (n / guess+guess) / 2;

	//	System.out.println(guess);

	if (guess == (n / guess+guess) / 2){
	    return guess;
	}

        return  sqrtHelp(n, guess);

    }

}
