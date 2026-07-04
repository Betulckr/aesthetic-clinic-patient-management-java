// BurunEstetik classinda burun estetik doktorunun bilgilerini gosteriyor.
// DoktorAd classindan miras aliyor.
public class BurunEstetik extends DoktorAd{

	// int tipinde extra bir özellik maaliyeti tanimladim
	private int maaliyet;
	
	// constructor
	public BurunEstetik(String doktorAd, String doktorSoyad, String doktorBolum, int maaliyet) {
		// doktor ad, soyad, bolum bilgilerini superclasstan miras aliyor.
		super(doktorAd, doktorSoyad, doktorBolum);
		// girilen maaliyetide this.maaliyete esitliyor.
		this.maaliyet = maaliyet;
	}

	// BilgileriGoster() metodu doktor bilgilerini gosteriyor.
	public void BilgileriGoster() {
		super.BilgileriGoster();
		System.out.println("Burun Estetik maaliyeti: " + this.maaliyet + " tl");
	}

}

