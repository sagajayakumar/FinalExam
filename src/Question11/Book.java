/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Book {

    private String name; // name of the book
    private int numberOfPages; // number of pages present in the book

    //constructor for the book class
    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    // getter for name of the book
    public String getName() {
        return name;
    }

    //setter for name of the book
    public void setName(String name) {
        this.name = name;
    }

    // getter for number of pages in book
    public int getNumberOfPages() {
        return numberOfPages;
    }

    //setter for number of pages in book
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // to string method to convert the book object to string,
    //this method overrides the to string method in object class
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", numberOfPages=" + numberOfPages + '}';
    }

    // this method returns hash value of the object
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.numberOfPages;
        return hash;
    }

    // this method compares the object args and returns boolean value
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.numberOfPages != other.numberOfPages) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
