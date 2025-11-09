/*
 * Ad Soyad: Muhammet Yasir Çeik
 * Ogrenci No: 250542010
 * Tarih: 09.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        // Basit bir bölme işlemi, zaman 0 ise 'Infinity' döner.
        // Hata kontrolü istenmediği için direkt formülü uyguluyoruz.
        return distance / time; // DEĞİŞTİRİLDİ
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        return velocityChange / time; // DEĞİŞTİRİLDİ
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return mass * acceleration; // DEĞİŞTİRİLDİ
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        return force * distance; // DEĞİŞTİRİLDİ
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        return work / time; // DEĞİŞTİRİLDİ
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        return 0.5 * mass * Math.pow(velocity, 2); // DEĞİŞTİRİLDİ
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        return mass * gravity * height; // DEĞİŞTİRİLDİ
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        return mass * velocity; // DEĞİŞTİRİLDİ
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();
    
        
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        double velocity = calculateVelocity(distance, time);

        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        double acceleration = calculateAcceleration(deltaV, time);

        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        double force = calculateForce(mass, acceleration);

        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        double work = calculateWork(force, distance);
        
        // 5. Diğer hesaplamalar
        double power = calculatePower(work, time);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        // Potansiyel enerji için sabit olan GRAVITY kullanılıyor
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double momentum = calculateMomentum(mass, velocity);
        
        // SONUCLARI YAZDIR
        // Bu kısım zaten doğru değişken isimlerini kullandığı için
        // yukarıdaki hesaplamalar eklendiğinde otomatik olarak çalışacaktır.
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)            : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)          : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)         : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)             : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)            : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)      : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)   : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji            : %.2f J\n", (kineticEnergy + potentialEnergy));

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)       : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
