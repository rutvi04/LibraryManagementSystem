package org.example;

import java.util.ArrayList;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    ArrayList<Person> person = new ArrayList<>();
    static void login(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter password: ");
        String pwd = sc.nextLine();
    }
    static void returning_member(){
            login();
            System.out.println("What do you want to do today?");
            System.out.println("1. Search book");
            System.out.println("2. Borrow book");
            System.out.println("3. Return book");
            System.out.println("4. My Profile");
            System.out.println("5. Return to main menu");
    }
    static void new_member(ArrayList<Person> person){
        // add name, pwd, assign id, overdue fees,
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter password:");
        String pwd = sc.nextLine();
        System.out.println("Enter phone number:");
        String phn_no = sc.nextLine();
        person.add (new Members(name, pwd, phn_no));
    }
    static void librarian(){
        //add book, remove book, create report,update book info,
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.out.print("Hello and welcome!");
        int option = menu();
        switch (option) {
            case 1 -> returning_member();
            case 2 -> new_member(person);
            case 3 -> librarian();
            case 4 -> {
            }
            default -> {
                System.out.println("Enter Valid number from menu.");
                menu();
            }
        }
    }

    static int menu(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Select from following who you are:");
        System.out.println("1. Returning Member");
        System.out.println("2. New Member");
        System.out.println("3. Librarian");
        System.out.println("4. Exit");
        System.out.println("Write any of the above number:");

        return sc.nextInt();
    }
}