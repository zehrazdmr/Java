package OBEB;

public class Obeb {

	int gcd(int x,int y) {
		if (y==0)
			return x;
		if (y>0)
			return gcd(y,x%y);
		return x;
	}
	
	public static void main(String[] args) {
		Obeb sayi=new Obeb();
		System.out.print(sayi.gcd(60,90));
		System.out.println();
		System.out.print(sayi.gcd(4,13));
		

	}

}
