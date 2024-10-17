import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Book book1 = new Book(11,"A tale of two cities",500,"Historical fiction",LocalDate.of(1859,2,2));
Book book2 = new Book(22,"Harry Potter",1200,"Fantasy",LocalDate.of(1997,1,2));
Book book3 = new Book(33,"The little prince",600,"Fantasy",LocalDate.of(1988,2,2));
        Book[]books1={book1,book2,book3};
Book book4 = new Book(44,"The Alchemist",900,"Mystery",LocalDate.of(1943,2,2));
Book book5 = new Book(55,"The Hobbit ",750,"children s fiction",LocalDate.of(1937,2,2));
Book book6 = new Book(66,"The bible ",1200,"Historical",LocalDate.of(1999,2,2));
        Book[]books2={book4,book5,book6};
Book book7 = new Book(77,"To Kill A Mockingbird. by Lee, Harper",580,"War fiction",LocalDate.of(1859,2,2));
Book book8 = new Book(88,"Harry Potter",800,"Fantasy",LocalDate.of(1960,2,2));
Book book9 = new Book(99,"Heidi",1300,"Children fiction",LocalDate.of(1880,2,2));
        Book[]books3={book7,book8,book9};

        Library library1 = new Library(1,"Ч Айтматов","Манаса 12",books1);
        Library library2 = new Library(2,"A Осмонов","Горький 86а",books2);
        Library library3 = new Library(3,"С Жапаров","Фркнзу 145б",books3);
        Library[]libraries={library1,library2,library3};
        Scanner scanner = new Scanner(System.in);
        int id=scanner.nextInt();

        for (Library library:libraries){
            if (id==library.id){
                System.out.println(library);
            }


            }
        System.out.println("андай ID жок");
        }


}