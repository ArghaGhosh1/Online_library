package com.company;

import java.util.Scanner;
class library  //custom class
{
    String set;
    String []books = new String[10];

    //to add books
    public void addBook1(String myAddBook1) {
        books[0] = myAddBook1;
    }
    public void addBook2(String myAddBook2) {
        books[1] = myAddBook2;
    }
    public void addBook3(String myAddBook3) {
        books[2] = myAddBook3;
    }
    public void addBook4(String myAddBook4) {
        books[3] = myAddBook4;
    }
    public void addBook5(String myAddBook5) {
        books[4] = myAddBook5;
    }
    public void addBook6(String myAddBook6) {
        books[5] = myAddBook6;
    }
    public void addBook7(String myAddBook7) {
        books[6] = myAddBook7;
    }
    public void addBook8(String myAddBook8) {
        books[7] = myAddBook8;
    }
    public void addBook9(String myAddBook9) {
        books[8] = myAddBook9;
    }
    public void addBook10(String myAddBook10) {
        books[9] = myAddBook10;
    }


    //to issue a book
    public String issueBook(String issue)
    {
        int i;
        for ( i = 0; i < books.length-1; i++)
        {
            if (books[i] == issue)
            {
                books[i] = null;
            }
        }
        return books[i];
    }


    //to return a book
    public void returnBook(String returnn)
    {
        for (int  i = 0; i < books.length-1; i++)
        {
            if (books[i] == null)
            {
                books[i] = returnn;
                break;
            }
        }
    }



    //list of available books
    public void showAvailableBooks()
    {
        for(String e:books)
        {
            System.out.println(e);
        }
    }
}
public class online_library
{
    public static void main(String[] args)
    {
        Scanner ag = new Scanner(System.in);
        library lib = new library();


        System.out.println("THIS IS THE LIBRARY................");
        lib.addBook1("physics");
        lib.addBook2("math");
        lib.addBook3("english");
        lib.addBook4("chem");
        lib.addBook5("cs");
        lib.addBook6("geo");
        lib.addBook7("bang");
        lib.addBook8("bio");
        lib.addBook9("life");
        lib.addBook10("phi");


        System.out.println("what do you want to do.....??\nissue a book--->0\nreturn a book--->1");
        int x = ag.nextInt();
        switch(x)
        {
            case 0:
                Scanner ac = new Scanner(System.in);
                String bi = ac.nextLine();
                lib.issueBook(bi);
                lib.showAvailableBooks();
                break;
            case 1:
                Scanner ar = new Scanner(System.in);
                String ci = ar.nextLine();
                lib.returnBook(ci);
                lib.showAvailableBooks();
                break;
        }


        //returning a book
        //lib.returnBook("g");

        //available books list
        //lib.showAvailableBooks();
    }
}