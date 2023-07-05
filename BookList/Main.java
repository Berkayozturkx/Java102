package BookList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Nutuk",256,"Mustafa Kemal Atatürk","1927");
        Book b2 = new Book("İnsan Ne ile Yaşar",176,"Tolstoy","1885");
        Book b3 = new Book("Gün Olur Asra Bedel",500,"Cengiz Aytmatov","1980");
        Book b4 = new Book("Satranç",85,"Stefan Zweig","1943");
        Book b5 = new Book("Korku",90,"Stefan Zweig","1925");
        Book b6 = new Book("Bilinmeyen Bir Kadının Mektubu",64,"Stefan Zweig","1922");

        List<Book> bookList = new ArrayList<>();

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);


        Map<String,String> map = new TreeMap<>();

        bookList.forEach(book -> map.put(book.getAuthorName(),book.getBookName()));
        map.forEach((authorName, bookName) -> System.out.println("Book Name : " + bookName + " Author Name: " + authorName));
        System.out.println();
        System.out.println();
        System.out.println("Sayfa Sayısı 100'den fazla olan kitaplar");
        System.out.println();
        List<Book> subBookList = bookList.stream().filter(book -> book.getPageNumber() > 100).toList();
        subBookList.stream().forEach(book -> System.out.println("Kitap Adı: " + book.getBookName() + "Sayfa Sayısı: " + book.getPageNumber()));

    }
}
