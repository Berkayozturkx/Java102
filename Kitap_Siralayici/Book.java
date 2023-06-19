package CollectionAndMapInterface.Collection.Kitap_Siralayici;

public class Book {
    private String name;
    private int page;
    private String authorName;
    private String date;

    public Book(String name, int page, String authorName, String date){
        this.name = name;
        this.page = page;
        this.authorName = authorName;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPage(){
        return this.page;
    }

    public void setPage(int page){
        if (page <0){
            page = 0;
        }
        this.page = page;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }
}
