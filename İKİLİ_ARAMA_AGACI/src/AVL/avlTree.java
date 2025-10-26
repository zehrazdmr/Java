package AVL;

public class avlTree {
	avlTree sag;
	avlTree sol;
	int icerik;
	int boyut;
	boolean SAG;
	boolean SOL;
	boolean yon2;
	boolean yon1;
	
	avlTree (int veri){
		this.icerik=veri;
		boyut=1;
		sag=null;
		sol=null;
		SAG=true;
		SOL=false;
		yon2=SAG;
		
	}
	int maks(int a,int b) {
		if (a>b)
			return a;
		else 
			return b;
	}
	void onGezinti() {
		System.out.println(this.icerik);
		if (sol!=null)
			sol.araGezinti();
		if (sag!=null)
			sag.araGezinti();
	}
	void araGezinti() {
		if (sol!=null)
			sol.araGezinti();
		System.out.println(this.icerik);
		if (sag!=null)
			sag.araGezinti();
	}
	void ekle(int veri,boolean yon2) {
		yon1=yon2;
		if (this.icerik>veri) {
			yon2=SOL;
			if(sol==null)
				sol=new avlTree(veri);
			else 
				sol.ekle(veri, yon2);
		}
		else {
			yon2=SAG;
			if (sag==null)
				sag=new avlTree(veri);
			else
				sag.ekle(veri, yon2);
		}
		int sagboy,solboy;
		if (this.sag==null)
			sagboy=0;
		else 
			sagboy=this.sag.boyut;
		
		if (this.sol==null)
			solboy=0;
		else 
			solboy=this.sol.boyut;
		this.boyut=maks(sagboy,solboy)+1;
		int fark=(sagboy-solboy);
		if (Math.abs(fark)==2){
			avlTree tmp;
			if (yon1==SAG && yon2==SAG) {
				tmp=this;
				this.icerik=sag.icerik;
				sol.icerik=tmp.icerik;
				
				
			}
		}
	}
	
	
	

}
