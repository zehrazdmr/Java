package Dizi;

public class DiziSil {
	int[] dizi1= {1,2,3,8,9,6,7,4,5,0};
	
	void bastanSil() {
		for (int i=0;i<10;i++) {
			if (i!=9)
			   dizi1[i]=dizi1[i+1];
		}
		DiziYaz();
	
			
		
	}
	void ortadanSil(int sayi1,int sayi2) {
		int k=0;
		while (k!=8){
			k++;
			if (dizi1[k]==sayi1 && dizi1[k+2]==sayi2) {
				for (int i=k;i<8;i++) {
						dizi1[i+1]=dizi1[i+2];
				}
			}
			
		}
		DiziYaz();		
	}
	void sondanSil() {
		for (int i=0;i<9;i++) {
			if (i!=9 && dizi1[i]!=0 && dizi1[i+1]==0) {
				dizi1[i]=0;
				DiziYaz();
			}
			if (i==9 && dizi1[i]!=0) {
				dizi1[i]=0;	
				DiziYaz();
			}
		}
	}
	void DiziYaz() {
		for (int k=0;k<10;) {
		    System.out.println(dizi1[k]);
		    k++;
		}
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
		DiziSil ds=new DiziSil();
		ds.bastanSil();
		ds.ortadanSil(8, 6);
		ds.sondanSil();

	}

}
