package PascalUcgeni;

public class Pascal {
	int fact (int x) {
			if ( x == 0 )
				return 1;
			if ( x == 1 ) 
				return 1;
			else
				return x* fact ( x-1);

	}
    public int recPascal(int satir, int sutun){
 
        int ans=(fact(satir)/(fact(sutun)*fact(satir-sutun)));
 
    	return ans;
    	
      
    }
    public static void main(String[] args) {
          Pascal psc=new Pascal();
          for(int sat=0;sat<10;sat++){
              System.out.println();
          for(int sut=0;sut<sat+1;sut++)
          System.out.print(+psc.recPascal(sat,sut) +" ");
          }
         
    }
}
