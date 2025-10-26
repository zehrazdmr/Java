package BSTree;

public class AnaSinif {

	public static void main(String[] args) {
		Dugum kok=new Dugum(25);
		Dugum dg=new Dugum(10);
		Dugum dg1=new Dugum(30);
		Dugum dg2=new Dugum(54);
		kok.ekle(dg);
		kok.ekle(dg1);
		kok.ekle(dg2);
		kok.onGezinti();
		System.out.println("****************");
		kok.araGezinti();

	}

}
