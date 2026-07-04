# Aesthetic Clinic Patient Management (Java)

Nesne tabanlı programlama (OOP) prensiplerini uygulamak için yazılmış, bir estetik merkezinin hasta kayıtlarını ve doktor bilgilerini yöneten konsol tabanlı Java uygulaması.

## Özellikler

- Hasta ekleme, silme, güncelleme, listeleme ve TC numarasına göre arama
- Hasta raporlarının `Hastane.txt` dosyasına otomatik olarak yazılması
- Doktor bilgilerinin bölüme göre görüntülenmesi (Dudak Dolgu, Burun Estetik, Saç Ektirme)
- Basit bir kullanıcı adı/şifre ile giriş ekranı

## Kullanılan OOP Kavramları

- **Kalıtım (Inheritance):** `DudakDolgu`, `BurunEstetik`, `SacEktirme` sınıfları soyut `DoktorAd` sınıfından türetilmiştir.
- **Arayüz (Interface):** `IHastane` arayüzü, ana menü ve hasta işlemleri metotlarını tanımlar.
- **Koleksiyonlar:** Hasta kayıtları `ArrayList<Hastalar>` ile tutulur, `Iterator` ile gezilir.
- **Dosya İşlemleri:** `BufferedWriter`/`FileWriter` ile hasta raporu dosyaya yazılır.

## Çalıştırma

Eclipse (veya herhangi bir Java IDE) ile `src/` klasörünü bir proje olarak açıp `IHastane.java` içindeki `main` metodunu çalıştırabilirsiniz. Ya da terminalden:

```bash
cd src
javac *.java -d ../bin
cd ../bin
java IHastane
```

> Not: Giriş ekranındaki varsayılan kullanıcı adı/şifre (`nesneTabanli` / `123456`) koda gömülü ve ekrana da yazdırılan bir demo bilgisidir; gerçek bir kimlik doğrulama/güvenlik mekanizması değildir, sadece OOP alıştırması amacıyla eklenmiştir.
