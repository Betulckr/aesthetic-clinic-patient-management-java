// SacEktirme classinda sac ektirme estetik doktorunun bilgilerini gosteriyor.
// DoktorAd classindan miras aliyor.
public class SacEktirme extends DoktorAd{

	// int tipinde extra bir özellik maaliyeti yanimladim
	private int maaliyet;
	
	// constructor
	public SacEktirme(String doktorAd, String doktorSoyad, String doktorBolum, int maaliyet) {
		// dokor ad, soyad, bolum bilgilerini superclasstan miras aliyor
		super(doktorAd, doktorSoyad, doktorBolum);
		// girilen maaliyetide this.maaliyete esitliyor
		this.maaliyet = maaliyet;
	}

	// BilgileriGoster() metodu doktor bilgilerini gosteriyor
	public void BilgileriGoster() {
		super.BilgileriGoster();
		System.out.println("Sac Ektirme maaliyeti: " + this.maaliyet + " tl");
		
	}

}