package CollectionAndMapInterface.Collection.BookSorter;

import java.util.Comparator;

public class Book implements Comparable<Book>{
    /*
    Book isminde bir sınıf tasarlayınız.
    Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
    Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
    Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
    Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

    Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
     */

    private String bookName;
    private int pageNumber;
    private String authorName;
    private String date;

    public Book(String bookName, int pageNumber, String authorName,String date){
        this.bookName = bookName;
        if (pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.date = date;
    }
    //bookName getter and setter methods
    public String getBookName(){
        return this.bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    //pageNumber getter and setter methods
    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }

    //authorName getter and setter methods
    public String getAuthorName(){
        return this.authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    //date getter and setter methods
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }

    @Override
    public String toString(){
        return "Kitap Adı: " + this.getBookName() + " Sayfa Sayısı: " + this.getPageNumber() + " Yazar: " + this.getAuthorName() + " Tarih: " + this.getDate();
    }

    @Override
    public int compareTo(Book o) {
        //return this.getBookName().compareTo(o.getBookName()); => Kitapları kitap adına göre (A-Z) sıralayan kod
        return this.getPageNumber() - o.getPageNumber(); // => Kitapları sayfa sayısına göre sıralayan kod (Azdan çoka)
    }
}
