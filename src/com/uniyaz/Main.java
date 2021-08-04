package com.uniyaz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n--------------------------------------------------------------------");

        System.out.println("\n\n#########  Collections #########");

	// HashSet bünyesinde aynı elementten 2 adet barındırmaz
        HashSet<String> meyveler = new HashSet<String>();
        meyveler.add("Kayısı");
        meyveler.add("Üzüm");
        meyveler.add("Elma");
        meyveler.add("Şeftali");

        // Yeniden ekleme
        meyveler.add("Elma");

        meyveler.add(null);
        meyveler.add(null);

        System.out.println("\n\n--------------------------------------------------------------------\n\n");
        System.out.println("** HashSet **");
        System.out.println("HashSet Colleksiyonunda aynı veri tekrarlamaz");
        meyveler.forEach(meyve -> System.out.print(meyve + "\n"));
        System.out.println("\n\n--------------------------------------------------------------------\n\n");


        LinkedHashSet<String> gunler = new LinkedHashSet<String>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        // Aynı veriyi tekrar gir
        gunler.add("Pazartesi");

        System.out.println("** LinkedHashSet ** ");
        System.out.println("LinkedHasSet Kolleksiyonunun farkı ekleme işlemini sıraya göre yapmasıdır. HasSet Kolleksiyonunda bu garanti edilmez\n");
        gunler.forEach(gun -> System.out.print(gun + "\n"));
        System.out.println("\n\n--------------------------------------------------------------------\n\n");


        TreeSet<Integer> sayilar = new TreeSet<Integer>();
        sayilar.add(4);
        sayilar.add(9);
        sayilar.add(3);
        sayilar.add(1);

        // Aynı veriyi tekrar ekle
        sayilar.add(4);


        System.out.println("** TreeSet ** ");
        System.out.println("TreeSet Kolleksiyonu verileri artan sıralamaya göre tuar. Aynı veriden iki adet bulunamaz\n");
        sayilar.forEach(sayi -> System.out.print(sayi + "\n"));
        System.out.println("\n\n--------------------------------------------------------------------\n\n");


        System.out.println("** ArrayList **");
        System.out.println("Collection framework’te en çok kullanılan class’tır. List özelliklerini barındırır.\n");
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Amasya");
        sehirler.add("Sivas");
        sehirler.add("İzmir");
        sehirler.add("Eskişehir");

        // Tekrarlı element ekliyoruz.
        sehirler.add("Amasya");

        // İstediğimiz index'e eleman ekliyoruz.
        sehirler.add(3, "Isparta");
        sehirler.forEach(sehir -> System.out.print(sehir + "\n"));
        System.out.println("\n\n--------------------------------------------------------------------\n\n");


        System.out.println("** LinkedList **");
        System.out.println("Arama işlemlerinde LinkedList O(n) iken ArrayList’te O(1)’dir..\n");
        LinkedList<String> filmler = new LinkedList<String>();
        filmler.add("Person of Interest");
        filmler.add("Black Books");
        filmler.add("Seinfeld");
        filmler.add("Fargo");

        // İstediğimiz index'e eleman ekliyoruz.
        filmler.add(4, "Akasya Durağı");

        filmler.forEach(film -> System.out.print(film + "\n"));


    }
}
