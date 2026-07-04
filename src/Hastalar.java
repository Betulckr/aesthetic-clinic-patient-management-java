public class  Hastalar {

	// degiskenleri tanimladim
 public String hastaAd;
 public String hastaSoyad;
 public String hastaYas;
 public String hastaTcNo;
 public int sayac;
 
// getter setter metodlarini olusturdum
public int getSayac() {
	return sayac;
}
public void setSayac(int sayac) {
	this.sayac = sayac;
}
public String getHastaAd() {
  return hastaAd;
 }
 public void setHastaAd(String hastaAd) {
  this.hastaAd = hastaAd;
 }
 public String getHastaSoyad() {
  return hastaSoyad;
 }
 
public void setHastaSoyad(String hastaSoyad) {
  this.hastaSoyad = hastaSoyad;
 }
 public String getHastaTcNo() {
  return hastaTcNo;
 }
 public void setHastaTcNo(String hastaTcNo) {
  this.hastaTcNo = hastaTcNo;
 }
 public String getHastaYas() {
  return hastaYas;
 }
 public void setHastaYas(String hastaYas) {
  this.hastaYas = hastaYas;
 }
 
 
 
 // constructor parametreli
 public Hastalar(String hastaAd,String hastaSoyad, String hastaYas,String hastaTcNo)
 {
  this.hastaAd = hastaAd;
  this.hastaSoyad = hastaSoyad;
  this.hastaTcNo = hastaTcNo;
  this.hastaYas = hastaYas;
  
 }
 
 // parametresiz constructor metot overloading yaptim
 public Hastalar() {
	
}
}