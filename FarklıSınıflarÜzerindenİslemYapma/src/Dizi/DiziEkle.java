package Dizi;

public class DiziEkle {
	int [] dizi=new int [10];
	
	void basaEkle(int a) {
		if (dizi[0]==0) {
			dizi[0]=a;
			DiziYaz();
		}
		else 
		{
			for (int i=9;i>-1;i--) {
				if (i!=9)
				   dizi[i+1]=dizi[i];
				if (i==0) {
					dizi[i]=a;
					DiziYaz();
				}
				
			}
			
		}
		
	}
	
	void ortayaEkle(int sayi1, int sayi2, int deger) {
		int k=0;
		while (k!=10) {
			
			if (dizi[k]==sayi1 && dizi[k+1]==sayi2) {
				for (int i=9;i>k;i--) {
					
					if (i!=9)
						dizi[i+1]=dizi[i];
				    if (i==k+1) {
					    dizi[i]=deger;
					    DiziYaz();
				    }  
				}	
			}
			k++;
								
		}
	}
	void sonaEkle(int b) {
		int k=0;
		while (k!=10) {
			if (dizi[k]==0) {
				dizi[k]=b;
				DiziYaz();
				break;
			}
			else
				k++;
		}
	}

	void DiziYaz() {
		for (int k=0;k<10;) {
		    System.out.println(dizi[k]);
		    k++;
		}
		System.out.println("******************");
	}


	public static void main(String[] args) {
	     DiziEkle de=new DiziEkle();
	     de.basaEkle(5);
	     de.basaEkle(7);
	     de.basaEkle(8);
	     de.ortayaEkle(7, 5, 4);
	     de.sonaEkle(9);
	    

	}

}
