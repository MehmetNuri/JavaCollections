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
        System.out.println("\n\n--------------------------------------------------------------------\n\n");

        System.out.println("** Vector **");
        System.out.println("Sychronized bir collection’dır ve varsayılan kapasitesi 10’dur.Varsayılan kapasite ve artış değerlerini kullanıcı belirleyebilir.\n");

        Vector<Integer> v = new Vector<Integer>();
        for (int i = 1; i <= 5; i++)
            v.add(i);
        System.out.println(v);

        // Index'i 3 olan elemanı sil
        v.remove(3);

        System.out.println(v);
        for (Integer integer : v) System.out.print(integer + "\n");
        System.out.println("\n\n--------------------------------------------------------------------\n\n");

        System.out.println("** Queue **");
        System.out.println("Queue interface’i FIFO (first in first out) prensibini uygular. Yani sıraya ilk giren kişi ilk çıkar. Günlük hayattaki market sırası gibidir. .\n");

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Erzincan");
        pq.add("Malatya");
        pq.add("Muğla");

        System.out.println("Kuyruğun ilk hali " + pq);

        pq.remove("Muğla");

        System.out.println("Silme işleminden sonraki hali " + pq);

        System.out.println("Seçme Metodu " + pq.poll());

        System.out.println("Son Kuyruk " + pq);
        System.out.println("\n\n--------------------------------------------------------------------\n\n");

        System.out.println("** HashMap **");
        System.out.println("HashMap’ler sıralamayı garanti etmez. null key ve null value kabul eder..\n");


        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("pencil", "kalem");
        sozluk.put("computer", "bilgisayar");
        sozluk.put("bottle", "şişe");
        sozluk.put("shoe", "ayakkabı");

        sozluk.forEach((kelimeEN, kelimeTR) -> System.out.println(kelimeEN + "-" +kelimeTR ));
        System.out.println("\n\n--------------------------------------------------------------------\n\n");



    }
}
