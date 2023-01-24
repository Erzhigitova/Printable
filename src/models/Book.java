package models;

import servise.Printable;

public class Book implements Printable {

    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAuthor: " + author + "\n";
    }

    @Override
    public void print() {
        System.out.println("Book");
    }
}
