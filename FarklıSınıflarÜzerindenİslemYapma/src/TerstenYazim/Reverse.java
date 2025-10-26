package TerstenYazim;

public class Reverse {
	
	 void Reverse1(char s[],int index) {
		
		if (index<s.length) {
			index++;
			Reverse1(s,index);
		}
		System.out.println(s[index-1]);
		
		
	}
	
	public static void main(String[] args) {
		char [] array1= {'a','b','c','d'};
		Reverse r=new Reverse();
		r.Reverse1(array1,0);
	}
}
