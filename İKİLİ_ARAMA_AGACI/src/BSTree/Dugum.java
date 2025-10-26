package BSTree;

public class Dugum {
	Dugum sag;
	Dugum sol;
	Dugum parent;
	int icerik;
	
	public Dugum(int icerik) {
		this.icerik=icerik;
		sag=null;
		sol=null;
	}
	public Dugum min() {
		if (this.sol!=null)
			this.min();
		return this;
	}
	void ekle(Dugum yeni) {
		if (this.icerik >yeni.icerik) {
			if (this.sol!=null)
				this.sol.ekle(yeni);
			else 
				this.sol=yeni;
			
		}
		else {
		    if (this.sag!=null)
			    this.sag.ekle(yeni);
		    else 
		    	this.sag=yeni;		
		}
	}
	
	void sil(Dugum parent,int deger) {
		if (this.icerik==deger ) {
			if (sag==null && sol==null) {//yaprak düğüm silme
			     if (this.icerik>parent.icerik)
				      parent.sag=null;
			     else 
				      parent.sol=null;
			}
		   else if (sag==null && sol!=null) {//Sol çocuklu düğüm silme
			   if (parent.icerik>this.icerik)
				   parent.sol=this.sol;
			   else 
				   parent.sag=this.sol;
		   }
		   else if (sag!=null && this.sol==null) {//Sağ çocuklu düğüm silme
			   if (parent.icerik>this.icerik)
				   parent.sol=this.sag;
			   else 
				   parent.sag=this.sag;
		   }
		   else if (sag!=null && sol!=null) {//iki çocuklu düğüm silme
			   Dugum min=this.sol.min();
			   int x=min.icerik;
			   this.sag.sil(this, x);
			   this.icerik=x;
		   }

		}
		else {
			if (deger >this.icerik) {
				if (sag==null)
					return;
				else {
					parent=this;
					sag.sil(parent, deger);
				}
			
			}
			else {
				if (sol==null)
					return;
				else {
					parent=this;
					sol.sil(parent, deger);
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
		if (this.sol!=null)
			this.sol.onGezinti();
		System.out.println(this.icerik);
		if (this.sag!=null)
			this.sag.onGezinti();
		
	}

}
