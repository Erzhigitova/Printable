package models;


import servise.Printable;

public class Magazine implements Printable {

    private String name;
    private String edition;

    public Magazine() {
    }

    public Magazine(String name, String edition) {
        this.name = name;
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public void print() {
        System.out.println("Magazine");
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nedition: " + edition + "\n";
    }
}
