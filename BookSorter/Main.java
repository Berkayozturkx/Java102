package CollectionAndMapInterface.Collection.BookSorter;


import java.util.Collection;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(new Book("Nutuk",543,"Mustafa Kemal Atatürk","1927"));
        bookTreeSet.add(new Book("İnsan Ne ile Yaşar?",101,"Tolstoy","1885"));
        bookTreeSet.add(new Book("Don Kişot",289,"Cervantes","1605"));
        bookTreeSet.add(new Book("Monte Kristo Kontu",592,"Alexandre Dumas","1845"));
        bookTreeSet.add(new Book("Üç Silahşörler",64,"Alexandre Dumas","1844"));

        System.out.println("Kitap İsmine Göre Sıralama");
        //for (Book b: bookTreeSet) {
            //System.out.println(b.toString());
        //}
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Sayfa Sayısına Göre Sıralama");
        for (Book b: bookTreeSet) {
            System.out.println(b.toString());
        }

    }
}
