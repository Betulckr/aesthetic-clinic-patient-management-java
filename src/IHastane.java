	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;
	import java.util.ArrayList;
	import java.util.Iterator;
// IHastane adýnda bir arayüz oluþturdum.
public interface IHastane {
	// Hastalar classinin arrayListi olusturdum
	 static ArrayList<Hastalar> hasta = new ArrayList<Hastalar>();

	 
	 	// anaMenu() metodu 
	 public static void anaMenu() throws IOException
	 {
		 	// boolean tipinde cikis deðiskenini false esitledim
		 	// kullanici cikmak istedigi zaman kullanilan deðisken
		 boolean cikis = false;
		 
		 	// Scanner sinifinin scan referansini olusturdum
		 Scanner scan = new Scanner(System.in);
	  
		 	
		 	// kullanici AnaMenu de farkli menulere gecmek icin kullanilan degisken
		 byte secim;
		 	
		 	// anamenu yu gosteriyor cikis true olana kadar devam ediyor
		 while(!cikis)
		 {
			 //anamenu ciktilari
			 System.out.println("\n\t\t* * * * * * * OZEL ESTETIK HASTANESI HASTA REZERVASYONU * * * * * * *\n");
			 System.out.println("\t\t1.Hasta Kaydi");
			 System.out.println("\t\t2.Hasta Sil");
			 System.out.println("\t\t3.Hasta Guncelle");
			 System.out.println("\t\t4.Hasta Listele");
			 System.out.println("\t\t5.Hasta Ara");
			 System.out.println("\t\t6.Doktor Bilgileri");
			 System.out.println("\t\t7.Cikis");
			 System.out.println("\nSeciminizin numarasini giriniz: ");
			 // kullanicinin girdigi sayi alindi
			 secim = scan.nextByte();
			 // switch case ile kontrol ediliyor
			 switch(secim)
			 {
			 // eger kullanici 1 girerse 
			 // hastaEkle() metodunu cagiriyor
			 case 1:
				 hastaEkle();
				 break;
			 // eger kullanici 2 girerse 
			 // hastaSil() metodunu cagiriyor
			 case 2:
				 hastaSil();
				 break;
			 // eger kullanici 3 girerse 
			 // hastaGuncelle() metodunu cagiriyor
			 case 3:
				 hastaGuncelle();
				 break;
			 // eger kullanici 4 girerse 
			 // hastaListele() metodunu cagiriyor
			 case 4:
				 hastaListele(hasta);
				 break;
			 // eger kullanici 5 girerse 
			 // hastaAra() metodunu cagiriyor
			 case 5:
				 hastaAra();
				 break;
		     // eger kullanici 6 girerse 
			 // DoktorBilgileri() metodunu cagiriyor
			 case 6:
				 DoktorBilgileri();
				 break;
		     // eger kullanici 7 girerse 
			 // exit yapýyor
			 case 7:
				 System.out.println("\t\tSaglikli Gunler Dileriz...");
				 System.exit(0);
				 break;
			// eger kullanici 1-7 arasinda sayi girmezse
			// kullaniciye bildirim veriyor ve tekrar girmesi için anaMenu ye yonlendiriyor
			 default :
				 System.out.println("Yanlis Islem Numarasi Girdiniz!");
				 break;
			 }
		 }
	  
	 }

	 

	 // HastaListele() metodunda Hastalar classýnýn arrayListinin
	 // hasta referansi olusturdum
	 
	 public static void hastaListele(ArrayList<Hastalar> hasta) throws IOException
	 {
		 // Hastane adinda bir not dosyasi tanimladim
		 File file = new File("Hastane.txt");
		 // eger dosya tanimliysa  
		 if(!file.exists())
		 {
			 // yeni dosya aciyor
			 file.createNewFile();
		 }
		 // dosya yazdirmak icin class referansini olusturdum
		 FileWriter fWriter = new FileWriter(file,false);
		 BufferedWriter bWriter = new BufferedWriter(fWriter);
		 
		// int tipinde sayac degiskenini tanimladim
	  int sayac=0;
	  	// iterator classini referansini olusturdum
	  Iterator<Hastalar> hastalarIterator = hasta.listIterator();
	  
	  // boolean tipinde firstTime degiskenini tanimladim
	  boolean firstTime = true;
	  // eger hasta nesnesinin boyutu 0 dan buyuk ise
	  if(hasta.size() > 0)
	  {
		  // bir sonraki dugumu gosteriyor
	   while(hastalarIterator.hasNext())
	   {
		   // sayac degiskenini 1 arttiriyor
		sayac++;
			// Hastalar class nesnesini olusturdum ve bu referans hastalarIterator bir sonraki dugumu gosteriyor
	    Hastalar hastalar = hastalarIterator.next();
	    
	    // eger firstTime true ise
	    if(firstTime)
	    {
	    	//Rapor ciktisini yazdiriyor ve ayni bilgileri dosyada da not ediyor
	     System.out.print("\n\t\t**GUNLUK HASTA RAPORU**\n");
	     bWriter.write("\n\t\t**GUNLUK HASTA RAPORU**\n");
	     bWriter.write("\n");
	     System.out.println();
	     System.out.print("\tHASTA NO\tHASTA ADI\tHASTA SOYADI\tHASTA YASI\tHASTA TC NO");
	     bWriter.write("\tHASTA NO\tHASTA ADI\tHASTA SOYADI\tHASTA YASI\tHASTA TC NO");
	     bWriter.write("\n");
	     System.out.println();
	     System.out.print("\t=============================================================================================================\n");
	     // firstTime degiskenini false'e esitliyor  ve if den cikiyor
	     firstTime = false;
	    }
	    // rapor bilgilerini hem konsolda  hemde dosyada yazdiriyor 
	    System.out.println("             "+sayac+"             "+hastalar.getHastaAd()+"           "+hastalar.getHastaSoyad()+"           "+hastalar.getHastaYas()+"         "+hastalar.getHastaTcNo());
	    bWriter.write("\n");
	    bWriter.write("             "+sayac+"             "+hastalar.getHastaAd()+"           "+hastalar.getHastaSoyad()+"           "+hastalar.getHastaYas()+"         "+hastalar.getHastaTcNo());
	    
	   }
	   System.out.println();
	   System.out.println("\tToplamda " + hasta.size() + " Hasta Sayisi Listelendi.");
	   bWriter.write("\n\n");
	   bWriter.write("\tToplamda " + hasta.size() + " Hasta Sayisi Listelendi.");
	   bWriter.close();
	   System.out.println("\n\tAna Menuye Aktariliyorsunuz...\n");
	   // anaMenu() metodunu cagiriyor
	   anaMenu();
	  }
	  // eger liste bos ise bildirim veriyor ve anamenu() ye aktariliyor
	  else
	  {
	   System.out.println("Listenecek herhangi bir hasta kaydi bulunamadi!");
	  }
	 }
	 
	 
	 // DoktorBilgileri() metodu Hastane doktorlarinin bilgilerini gosteriyor
	 public static void DoktorBilgileri() {
		 
		 int giris;
		 Scanner scanner = new Scanner(System.in);
		 // Class nesneleri olusturdum 
		 
		 DudakDolgu dudakDolgu = new DudakDolgu("Arda", "Coskun", "Dudak Dolgu", 1200);
		 BurunEstetik burunEstetik = new BurunEstetik("Ahmet", "Cakiroglu", "Burun Estetiik", 5000);
		 SacEktirme sacEktirme = new SacEktirme("Melisa", "Alacati", "Sac Ektirme", 7000);
		 
		 // Bolume gore doktor bilgileri ciktisi gosteriyor
		 System.out.println("\n\t\t* * * * * * * Doktor Bilgileri * * * * * * *\n");
		 System.out.println("\t\t1.Dudak Dolgu doktoru");
		 System.out.println("\t\t2.Burun Estetik doktoru");
		 System.out.println("\t\t3.Sac Ektirme doktoru");
		 System.out.println("\n\n\t\tHangi doktorun bilgilerini gormek istersiniz: ");
		 // kulanicidan giris aliniyor
		 giris = scanner.nextInt();
		 // switch case ile kontrol ediliyor
		 switch(giris) {
		 // eger kullanici 1 girerse  
		 // dudakDolgu classinin bilgileriGoster() metodunu cagiriyor
		 	case 1:
		 		dudakDolgu.BilgileriGoster();
		 		break;
		 	// eger kullanici 2 girerse 
		 	// burunEstetik classinin bilgileriGoster() metodunu cagiriyor
		 	case 2:
		 		burunEstetik.BilgileriGoster();
		 		break;
		 	// eger kullanici 3 girerse 
		 	// sacEktirme classinin bilgileriGoster() metodunu cagiriyor
		 	case 3:
		 		sacEktirme.BilgileriGoster();
		 		break;
		 	// eger kullanici 1-3 arasinda sayi girmezse bildirim veriyor ve 
		 	// tekrar girmesi icin DoktorBilgileri() metodunu cagiriyor
		 	default:
		 		System.out.println("Girdiginiz numara yanlýstir. . . \nLutfen 1-3 arasinda bir sayi giriniz!");
		 		DoktorBilgileri();
		 }
		 
	 }
	 
	 // hastaSil() metodu kayit edilen hastalari siliyor
	 public static void hastaSil() throws IOException
	 {
	  Scanner scanner = new Scanner(System.in);
	  int sayac = 0;
	  // Hastalar listesinin nesnesini olusturdum
	  Iterator<Hastalar> hastalarIterator = hasta.listIterator();
	  // boolean tipinde firstTime degiskeni true'ye esitledim
	  boolean firstTime = true;
	  // eger hasta nesnesinin boyutu 0 den buyuk ise
	  if(hasta.size() > 0)
	  {
		  // while dongusu ile hastalar listesini bir sonraki dugumunu gosteriyor
	   while(hastalarIterator.hasNext())
	   {
		   // dongu her dondugunde sayaci 1 arttiriyor
	    sayac = sayac + 1;
	    // Hastalar classinin nsnesini olusturuyor
	    Hastalar hastalar = hastalarIterator.next();
	    
	    // eger firstTime true ise raporu yazdiriyor
	    if(firstTime)
	    {
	     System.out.println("\n\t\t**GUNLUK HASTA RAPORU**\n");
	     System.out.println();
	     System.out.println("\tHASTA ID NO\tHASTA ADI\tHASTA SOYADI\tHASTA YASI\tHASTA TC NO");
	     System.out.println();
	     System.out.println("\t=============================================================================================================\n");
	     // firstTime degiskenini false esitliyor
	     firstTime = false;
	    }
	    System.out.println("\t"+sayac+"\t"+hastalar.getHastaAd()+"\t"+hastalar.getHastaSoyad()+"\t"+hastalar.getHastaYas()+"\t"+hastalar.getHastaTcNo());
	    
	    
	   }
	   System.out.println();
	   System.out.println("\tToplamda " + hasta.size() + " Hasta Sayisi Listelendi.");
	 
	   
	  }
	  // kullanicidan silmek istedigi hasta sira numarasini soruyor
	  System.out.println("Silinecek Hastanin Sira Numarasini Giriniz: ");
	  int secim = scanner.nextInt();
	  // hasta listeden siliniyor
	  hasta.remove(secim-1);
	  System.out.println("Basariyla hasta kaydi silinmistir.");
	  hastaListele(hasta);
	 }
	  
	 // Hasta guncelle metodu hasta kayitlarini guncelliyor
	 public static void hastaGuncelle()
	 {
		 // class nesneleri olusturdum
	  Scanner scanner = new Scanner(System.in);
	  Hastalar hastalar = new Hastalar();
	  
	  // true olana kadar guncellemek istedigi hasta numarasini soruyor
	  while(true) {
		  System.out.println("Guncellemek Istediginiz Hastanin Numarasini Giriniz: ");
		  // hasta sira numarasini aliyor
		  int numara = scanner.nextInt();
		  // eger numara hasta boyutundan buyuk ise bu numara ile hasta bulunmadigini ekrana yaziyor
		  if(numara > hasta.size()) {
			  System.out.println("Bu numarada hasta yok. . . ");
		  }
		  else {
			  // degilse hasta kaydini siliyor ve ekleme metodunu cagiriyor
			  hasta.remove(numara-1);
			  hastaEkle();
			  break;
		  }
		  
		   	}
	   
	  }

	 
	 // HastaAra metodu kayit edilen hastalarin icinden hasta ariyor
	 public static void hastaAra() throws IOException
	 {
			 
		  Scanner scanner = new Scanner(System.in);
		  // hastanin TC sini girmesini istiyor
		  System.out.println("Aramak Istediginiz Hastanin TC. numarasini Yaziniz: ");
		  String aranacakHasta = scanner.nextLine();
		  // Hastalar listesini referansini olusturuyor
		  Iterator<Hastalar> hastalarIterator = hasta.listIterator();
		  ArrayList<Hastalar> sonuclar = new ArrayList<>();
		  
		  // hastalar listesinin bir sonraki dugumunu gostere kadar devam ediyor
		  while(hastalarIterator.hasNext())
		  {
			  // hastalar nesnesini olusturdum
		   Hastalar hastalar = hastalarIterator.next();
		   // eger hasta TC numarasi dogru girilmisse 
		   if(hastalar.getHastaTcNo().contains(aranacakHasta))
		   {
			   // yeni arraylistesinden sonuclar metoduna erisiyor ve hasta bilgilerini yazdiriyor
		    sonuclar.add(hastalar);
		   }
		   
		  }
		  // hastaListele metoduna sonuclar listesini gonderiyor
		  hastaListele(sonuclar);
		  
	 }
	 // Hasta ekle metodu yeni hastalari ekliyor
	 public static void hastaEkle()
		 {
		 // Hastalar nesnesi olusturdum
		  Hastalar hastalar = new Hastalar();
		  Scanner scan = new Scanner(System.in);
		  // bilgileri tek tek aliyor
		  System.out.println("Hasta Adi: ");
		  hastalar.setHastaAd(scan.nextLine());
		  System.out.println("Hasta Soyadi: ");
		  hastalar.setHastaSoyad(scan.nextLine());
		  System.out.println("Hasta Yasi: ");
		  hastalar.setHastaYas(scan.nextLine());
		  System.out.println("Hasta T.C. Numarasi: ");
		  hastalar.setHastaTcNo(scan.nextLine());
		  
		  // eger hasta lislesi bilgileri kayit ettiyse 
		  if(hasta.add(hastalar))
		  {
			  // Ekrana bildirim veriyor
		   System.out.println("Yeni Hasta Kaydi Basariyla Eklenmistir.");
		  }
		  
	 }
	 	// main metodu
	 public static void main(String[] args) throws IOException {
		 
			Scanner input = new Scanner (System.in);
			String username="nesneTabanli",pasword="123456"; 
			//Varsayilan parolayi ve kullanici adina degerler atadim.
			System.out.println();
			//Bunlari ekrana bastirdim giriste zorluk yasanmasin diye.
			System.out.println("Varsayilan Sistem Kullanici Adi: " + username);
			System.out.println("Varsayilan Sistem Parola: " + pasword);
			System.out.println();
			System.out.println();
			
			//kullanicidan sistem parolasini ve kullanici adini istedim.
			String kullanici_adi, sifre;
			System.out.println("\tSistem Kullanýcý adinizi giriniz:");
			kullanici_adi=input.next();
			System.out.println("\tSistem Sifrenizi giriniz:");
			sifre=input.next();
			
			if (username.equals(kullanici_adi) && pasword.equals(sifre))
			{
				//Sistem kullanici adini ve parolasini dogru girdigi takdirde kullaniciyi anamenu() ye aktardim.
				System.out.println();
				System.out.println ("\tSisteme basariyla giris yapildi!");
				System.out.println();
				System.out.println("\tAna Menuye Yonlendiriliyorsunuz...");
				System.out.println();
				//anaMenu() metodunu cagirdim
				 anaMenu();
			}
			//Yanlis girdigi takdirde tekrar denemesini istedim.
			else 
			{
				System.out.println();
				System.out.println ("\tKullanici adi veya sifre yanlis!\nKontrol ederek tekarar deneyiniz.");
				System.out.println();
			}
			}
	 
	 }
	 
	 

