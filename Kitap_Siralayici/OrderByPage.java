package CollectionAndMapInterface.Collection.Kitap_Siralayici;

import java.util.Comparator;

public class OrderPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPage()- o2.getPage();
    }
}
