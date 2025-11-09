/*
 * Ad Soyad: Muhammet Yasir Çelik
 * Ogrenci No: 250542010
 * Tarih: 09.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        
        double alan = Math.pow(side,2);
        return alan;
        
    }
    
    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        double cevre_uzunlugu = side * 4;
        return cevre_uzunlugu;
    }
    
    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        double alan_dikdortgen = width * height;
        return alan_dikdortgen ; 
    }
    
    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        double cevre = 2 * (width + height);
        return cevre;
    }
    
    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz
        double daire_alan = Math.PI * radius * radius ;
        return daire_alan;
        
    }
    
    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        double cevre = 2* Math.PI * radius ;
        return cevre;
    }
    
    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        double ucgenalan = (base * height) / 2;
        return ucgenalan ;
    }
    
    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        double ucgencevre = a + b + c;
        return ucgencevre;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // HESAPLAMALARI YAP - Metotlari cagir
        
        
        
        
        
        
        
        
        
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.println("Karenin Alanı : " + calculateSquareArea(squareSide)+ "  Karenin Çevresi : " + calculateSquarePerimeter(squareSide));
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.println("Dikdörtgenin Alanı : " + calculateRectangleArea(rectHeight,rectWidth) + "  Dikdörtgenin Çevresi : "+(calculateRectanglePerimeter(rectHeight,rectWidth)));
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.println("Dairenin Alanı : " + (calculateCircleArea(radius)+ " Dairenin Çevresi : " + calculateCircleCircumference(radius)));
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.println("Üçgenin Alanı : " + calculateTriangleArea(base, height)+ " Üçgenin Çevresi : " + calculateTrianglePerimeter(base, base, base));
        
        
        System.out.println("========================================");
        
        input.close();
    }
}
