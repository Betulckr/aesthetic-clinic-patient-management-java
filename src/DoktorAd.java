public abstract class DoktorAd {
	private String doktorAd,doktorSoyad,doktorBolum;

	// constructor parametreli;
	public DoktorAd(String doktorAd, String doktorSoyad, String doktorBolum) {
		super();
		this.doktorAd = doktorAd;
		this.doktorSoyad = doktorSoyad;
		this.doktorBolum = doktorBolum;
	}
	
	// getter setter metodlarini olusturdum.

	public String getDoktorAd() {
		return doktorAd;
	}

	public void setDoktorAd(String doktorAd) {
		this.doktorAd = doktorAd;
	}

	public String getDoktorSoyad() {
		return doktorSoyad;
	}

	public void setDoktorSoyad(String doktorSoyad) {
		this.doktorSoyad = doktorSoyad;
	}

	public String getDoktorBolum() {
		return doktorBolum;
	}

	public void setDoktorBolum(String doktorBolum) {
		this.doktorBolum = doktorBolum;
	}
	
	
	public void BilgileriGoster() {
		
		System.out.println("Doktor isim: " + doktorAd);
		System.out.println("Doktor soyisim: " + doktorSoyad);
		System.out.println("Doktor Bölümü: " + doktorBolum);
		
	} 
	

}
