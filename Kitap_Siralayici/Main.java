package CollectionAndMapInterface.Collection.Kitap_Siralayici;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Nutuk",543,"Mustafa Kemal Atatürk","1927");
        Book b2 = new Book("İnsan Ne ile Yaşar?",101,"Tolstoy","1885");
        Book b3 = new Book("Don Kişot",289,"Cervantes","1605");
        Book b4 = new Book("Monte Kristo Kontu",592,"Alexandre Dumas","1845");
        Book b5 = new Book("Üç Silahşörler",64,"Alexandre Dumas","1844");

        TreeSet<Book> bookTreeSetName = new TreeSet<>(new OrderNameComparator());

        bookTreeSetName.add(b1);
        bookTreeSetName.add(b2);
        bookTreeSetName.add(b3);
        bookTreeSetName.add(b4);
        bookTreeSetName.add(b5);

        Iterator<Book> itr = bookTreeSetName.iterator();

        System.out.println("_____________________________________________");

        System.out.println("Kitap İsmine Göre Sıralama (A-Z)");

        System.out.println("_____________________________________________");

        while (itr.hasNext()){
            System.out.println(itr.next().getName());
        }

        TreeSet<Book> bookTreeSetPage = new TreeSet<>(new OrderPageComparator());

        bookTreeSetPage.add(b1);
        bookTreeSetPage.add(b2);
        bookTreeSetPage.add(b3);
        bookTreeSetPage.add(b4);
        bookTreeSetPage.add(b5);

        Iterator<Book> iterator = bookTreeSetPage.iterator();

        System.out.println("_____________________________________________");

        System.out.println("Kitabın Sayfa Sayısına Göre Sıralama");

        System.out.println("_____________________________________________");

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        System.out.println("_____________________________________________");
    }
}
