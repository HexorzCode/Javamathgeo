import org.example.Geometri;
import org.example.Geovar;
import org.example.HitungLuasGeometri;

import java.util.Scanner;

import static org.example.HitungLuasGeometri.luasJajargenjang;
import static org.example.HitungLuasGeometri.luasTrapesium;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Program Menghitung Luas Geometri");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Jajargenjang");
            System.out.println("4. Trapesium");
            System.out.println("5. Keluar");
            System.out.print("Pilih bentuk geometri: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = input.nextDouble();
                Geometri geoPersegi = new Geometri(new Geovar(0, sisi, 0));
                System.out.println("Luas Persegi: " + HitungLuasGeometri.luasPersegi(geoPersegi));
            } else if (pilihan == 2) {
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = input.nextDouble();
                Geometri geoSegitiga = new Geometri(new Geovar(alasSegitiga, 0, tinggiSegitiga));
                System.out.println("Luas Segitiga: " + HitungLuasGeometri.luasSegitiga(geoSegitiga));
            } else if (pilihan == 3) {
                System.out.print("Masukkan alas jajargenjang: ");
                double alasJajargenjang = input.nextDouble();
                System.out.print("Masukkan tinggi jajargenjang: ");
                double tinggiJajargenjang = input.nextDouble();
                Geometri geoJajargenjang = new Geometri(new Geovar (alasJajargenjang, 0, tinggiJajargenjang));
                System.out.println("Luas Jajargenjang: " + luasJajargenjang(geoJajargenjang));
            } else if (pilihan == 4) {
                System.out.print("Masukkan sisi atas trapesium: ");
                double sisiA = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium: ");
                double sisiB = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = input.nextDouble();
                Geometri geoTrapesium = new Geometri(new Geovar(sisiA, sisiB, tinggiTrapesium));
                System.out.println("Luas Trapesium: " + luasTrapesium(geoTrapesium));
            }
        } while (pilihan != 5);

        input.close();
    }
}
