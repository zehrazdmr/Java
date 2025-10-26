package karmaTablo;

public class AnaSinif {

	public static void main(String[] args) {
		Karma liste=new Karma(29);
		Eleman eleman=new Eleman("esma","can",4566);
		Eleman eleman1=new Eleman("elif","korhan",2236);
		Eleman eleman2=new Eleman("aslı","meriç",1122);
		Eleman eleman3=new Eleman("ayfer","veli",1111);
		Eleman eleman4=new Eleman("fatma", "özdemir", 1445);
		Eleman eleman5=new Eleman("zehra","özdemir",1554);
		liste.karmaEkle(eleman);
		liste.karmaEkle(eleman1);
		liste.karmaEkle(eleman2);
		liste.karmaEkle(eleman3);
		liste.karmaEkle(eleman4);
		liste.karmaEkle(eleman5);
		liste.harfListele("e");
		liste.karmaSil("elif");
		liste.tabloListele();
		liste.tabloElemanSayisi();
		liste.harfListele("b");
		liste.harfEleman("a");

	}

}
