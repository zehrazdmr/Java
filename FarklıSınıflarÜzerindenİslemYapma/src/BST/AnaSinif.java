package BST;

public class AnaSinif {

	public static void main(String[] args) {
		Dugum kok=new Dugum(5);
		Dugum dg=new Dugum(15);
		Dugum dg1=new Dugum(2);
		Dugum dg2=new Dugum(70);
		Dugum dg3=new Dugum(35);
		Dugum dg4=new Dugum(4);
		kok.ekle(dg);
		kok.ekle(dg1);
		kok.ekle(dg2);
		kok.ekle(dg3);
		kok.ekle(dg4);
		kok.onGezinti();
		//System.out.println("****************************************");
		//kok.araGezinti();
		System.out.println("****************************************");
		kok.sil(kok, 15);
		//kok.araGezinti();
		//System.out.println("****************************************");
		kok.sil(kok, 5);
		kok.araGezinti();

	}

}
