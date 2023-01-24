import models.*;
import servise.Printable;

public class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[]{new Book("Alice in Wonderland", "Lewis Carrol"),
                new Magazine("The New York Times", "New York"), new Book("Anna Karenina", "Leo Tolstoy"),
                new Book("Pride and Prejudice", "Jane Austen"), new Magazine("Vogue", "United States")};

        for(Printable p: printable){
            p.print();
            System.out.println(p);
        }
        printMagazines(printable);
        printBooks(printable);

    }
    static void printMagazines(Printable[] printable){
        System.out.println("Magazines:");
        for(Printable p: printable){
            if(p instanceof Magazine){
                System.out.println(((Magazine) p).getName()+", "+ ((Magazine) p).getEdition());
            }
        }
    }
    static void printBooks(Printable[] printable){
        System.out.println("Books: ");
        for(Printable p: printable){
            if(p instanceof Book){
                System.out.println(((Book) p).getName()+", "+ ((Book) p).getAuthor());
            }
        }
    }
}