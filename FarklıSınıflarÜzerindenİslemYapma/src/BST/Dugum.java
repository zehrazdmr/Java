package BST;

public class Dugum {
	Dugum sag;
	Dugum sol;
	int icerik;
	
	public Dugum(int icerik) {
		this.icerik=icerik;
		sag=null;
		sol=null;
	}
	Dugum min() {
		Dugum tmp=this;
		while (tmp.sol!=null) {
			if (sol!=null)
				tmp=tmp.sol;
		}
		return tmp;
		
	}
	void ekle(Dugum yeni) {
		if (yeni.icerik>this.icerik) {
			if (sag==null) {
				this.sag=yeni;
				System.out.println(yeni.icerik+" ağaca eklendi.");
			}
			else 
				sag.ekle(yeni);
		}
		else {
			if (sol==null) {
				this.sol=yeni;
				System.out.println(yeni.icerik+" ağaca eklendi.");
			}
			else
				sol.ekle(yeni);
		}
		
	}
	void sil(Dugum parent,int veri) {
		if (this.icerik==veri) {
			if (sag==null && sol==null) //yaprak silme
				if (this.icerik>parent.icerik)
					parent.sag=null;
				else 
					parent.sol=null;	
			else if (sag!=null && sol==null) { //tek çocuğu olan düğüm silme (sağ çocuk)
				if (this.icerik>parent.icerik)
					parent.sag=this.sag;
				else
					parent.sol=this.sag;
			}
			else if (sag==null && sol!=null){//tek çocuğu olan düğüm silme (sol çocuk)
				if (this.icerik>parent.icerik)
					parent.sag=this.sol;
				else 
					parent.sol=this.sol;
			}
			else if (sag!=null && sol!=null) {//iki çocuklu eleman silme
				Dugum min=this.sag.min();
				int x=min.icerik;
				this.sag.sil(this, x);
				this.icerik=x;
			}
		}
		else {
			if (veri>this.icerik) {
				if (sag==null)
					return;
				else {
					parent=this;
					sag.sil(parent, veri);
				}
			}
			else  {
				if (sol==null)
					return;
				else {
					parent=this;
					sol.sil(parent, veri);
				}
			}
		}
		    
	}
	void onGezinti() {
		System.out.println(this.icerik);
		if (this.sol!=null)
			this.sol.onGezinti();
		if (this.sag!=null)
			this.sag.onGezinti();
	}
	void araGezinti() {
		if (sol!=null) {
			sol.araGezinti() ;
		}
		System.out.println(icerik);
		if (sag!=null) {
			sag.araGezinti();
			
		}
	}
	

}
