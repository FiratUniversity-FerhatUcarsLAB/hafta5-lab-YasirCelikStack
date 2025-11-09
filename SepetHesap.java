/*
 * Ad Soyad: Muhammet Yasir Çelik
 * Ogrenci No: 250542010
 * Tarih: 09.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)

    // METOT 1: Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
       double satir_toplami = price * quantity ;
       return  satir_toplami;
    }

    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        double ara_toplam = line1 + line2 + line3;
        return ara_toplam;
    }

    // METOT 3: Indirim tutarini hesaplar
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {

        double indirim_tutari = (subtotal * discountPercentage);
        return indirim_tutari;
    }

    // METOT 4: Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
       double indirimli_toplam = subtotal - discountAmount;
       return indirimli_toplam;
    }

    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
       double kdv_tutari = discountedTotal * vatRate;
       return kdv_tutari;
    }

    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        double genel_toplam = discountedTotal + vatAmount + shippingFee;
        return genel_toplam;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        // URUN 1 Bilgileri
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        // URUN 2 Bilgileri
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        // URUN 3 Bilgileri
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        // Indirim Bilgisi
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Urunlerin satis toplamlarini hesapla
        
        double line1Total = calculateLineTotal(price1, qty1);
        double line2Total = calculateLineTotal(price2, qty2);
        double line3Total = calculateLineTotal(price3, qty3);

        // 2. Ara toplami hesapla
        double subtotal = calculateSubtotal(line1Total , line2Total , line3Total);

        // 3. Indirim tutarini hesapla
        double discountAmount = calculateDiscountAmount(subtotal, discountPercent);

        // 4. Indirimli toplami hesapla
        double discountedTotal = applyDiscount(subtotal, discountAmount);

        // 5. KDV tutarini hesapla (Indirimli toplam uzerinden)
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE);

        // 6. Genel toplami hesapla
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE);

        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1Total);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2Total);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3Total);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", subtotal);

        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", discountedTotal);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}
