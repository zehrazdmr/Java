package karmaTablo;
import java.util.LinkedList;
public class Karma {
	String isim;
	String soyisim;
	int telno;
	int N=29;
	LinkedList <Eleman> []bl;
    String alfabe="abcçdefgğhıijklmnoöprsştuüvyz";
	Karma (int N){
		this.N=N;
		bl=new LinkedList[N];
		for (int i=0;i<N;i++) {
			bl[i]=new LinkedList();
		}
	}

	int karmaFonksiyonu(String isim) {
		isim.toLowerCase(); 
		int i = -1;
		char harf = isim.charAt(0);
		while (i<29) {
			i++;
		    if (harf==alfabe.charAt(i)) {
		    	break;	
		    }  
		}
		return i;
			
		}
	
	
	void karmaEkle(Eleman yeni) {
		this.isim=yeni.isim;
		this.soyisim=yeni.soyisim;
		this.telno=yeni.telno;
		int adres=karmaFonksiyonu(isim);
		bl[adres].addFirst(yeni);
	}
	
	Eleman karmaAra(String isim) {
		Eleman tmp=null;
		
		int adres=karmaFonksiyonu(isim);
		for (int i=0;i<bl[adres].size();i++) {
			tmp=bl[adres].get(i);
			if (isim.equals(tmp.isim)) {
				break;
			}
		}
		
		return tmp ;
	}
	void karmaSil(String isim) {
		Eleman e=karmaAra(isim);
		if (e==null)
			System.out.println("Silinecek kişi bulunamadı");
		else {
			int adres=karmaFonksiyonu(isim);
			System.out.println(e.isim +" kişisi silindi.");
			bl[adres].remove(e);
			}	
	}
	void tabloListele() {
		for (int i=0;i<N;i++) {
			System.out.println(alfabe.charAt(i) + "----------------");
			for (int k=0;k<bl[i].size();k++) { 
		          System.out.println(bl[i].get(k).isim + "\n" +bl[i].get(k).soyisim + "\n" +bl[i].get(k).telno + "\n");	 
			}
		}
	}
	void tabloElemanSayisi() {
		int toplam=0;
		for (int i=0;i<N;i++) {
			for (int k=0;k<bl[i].size();k++) {
				toplam+=1;
			}
		}
		System.out.println(toplam + " adet eleman vardır.");
	}
	void harfListele(String x) {
		int adres=karmaFonksiyonu(x);
		if  (bl[adres].size()==0) {
			System.out.println("Bu harfte kayıtlı eleman yok."); 
		}
		else {
			for (int k=0;k<bl[adres].size();k++) { 
               System.out.println(bl[adres].get(k).isim + "\n" +bl[adres].get(k).soyisim + "\n" +bl[adres].get(k).telno + "\n");
			}
		}
	}
	void harfEleman(String x) {
		int adres=karmaFonksiyonu(x);
		int toplam=0;
		if  (bl[adres].size()==0)
			System.out.println("Bu harfte kayıtlı eleman yoktur.");
		else {
			for (int k=0;k<bl[adres].size();k++) {
				toplam+=1;
		      }
			System.out.println(x + " harfinde kayıtlı "+ toplam + " adet eleman vardır.");
		}
	
}
}
