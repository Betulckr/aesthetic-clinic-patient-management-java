// DudakDolgu classinda Dudak dolgusu estetik doktorunun bilgilerini gosteriyor.
// DoktorAd classindan miras aliyor.
public class DudakDolgu extends DoktorAd{

	// int tipinde extra bir özellik maaliyeti tanimladim.
	private int maaliyet;
	
	//constructor parametreli oluþturdum.
	public DudakDolgu(String doktorAd, String doktorSoyad, String doktorBolum, int maaliyet) {
		// dokor ad, soyad, bolum bilgilerini superclasstan miras aliyor.
		super(doktorAd, doktorSoyad, doktorBolum);
		// girilen maaliyetide this.maaliyete esitliyor.
		this.maaliyet = maaliyet;
	}

	public void BilgileriGoster() {
		// BilgileriGoster() metodu doktor bilgilerini gosteriyor.
		super.BilgileriGoster();		
		System.out.println("Dudak Dolgu maaliyeti: " + this.maaliyet + " tl");
		
	
	}

}
