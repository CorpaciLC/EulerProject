// Problem 9
public class PythagoreanTriplet{
	public int a, b, c;
	public boolean findTriplet(int sum) {
		int c;
		for(int i = 1; i < sum; i++) {
			for(int j = i + 1; j < sum; j++) {
				c = i*i + j*j;
				if(this.checkSquare(c) == true) {
					if( i + j + Math.sqrt(c) ==  1000) {
						this.a = i;
						this.b = j;
						this.c = (int)Math.sqrt(c);
						System.out.println(i + "^2 + " + j + " ^2 = " + (int)Math.sqrt(c) + "^2");
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean checkSquare(int n) {
		if((int)Math.sqrt(n) ==  Math.sqrt(n) )
			return true;
		return false;
	}
}
