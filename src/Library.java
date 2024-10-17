import java.util.Arrays;

public class Library {
    long id;
    String name;
    String address;
    Book[]books;
    public Library(){}
    public Library(long id,String name,String address,Book[]books){
        this.id=id;
        this.name=name;
        this.address=address;
        this.books=books;
    }

    @Override
    public String toString() {
        return "     Library\n" +
                ", id=" + id +"\n"+
                ", name='" + name + "\n" +
                ", address='" + address + "\n" +
                ", books=" + Arrays.toString(books);
    }
}
