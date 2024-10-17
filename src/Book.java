import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book {
    long id;
    String bookName;
    int price;
    String genre;
    LocalDate createDate;
    public Book(){}
    public Book(long id,String bookName,int price,String genre,LocalDate createDate){
        this.id=id;
        this.bookName=bookName;
        this.price=price;
        this.genre=genre;
        this.createDate=createDate;
    }

    @Override
    public String toString() {
        return "       Book\n" +
                ", id=" + id +"\n"+
                ", bookName='" + bookName + "\n" +
                ", price=" + price +"\n"+
                ", genre='" + genre + "\n" +
                ", createDate=" + createDate ;
    }
}
