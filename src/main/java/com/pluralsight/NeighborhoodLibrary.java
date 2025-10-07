package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] inventory;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeInventory();
        showMainMenu();
    }

    private static void initializeInventory() {
        inventory = new Book[20];
        inventory[0] = new Book(1, "978-0061120084", "To Kill a Mockingbird");
        inventory[1] = new Book(2, "978-0451524935", "1984");
        inventory[2] = new Book(3, "978-0743273565", "The Great Gatsby");
        inventory[3] = new Book(4, "978-0316769488", "The Catcher in the Rye");
        inventory[4] = new Book(5, "978-0141439518", "Pride and Prejudice");
        inventory[5] = new Book(6, "978-0547928227", "The Hobbit");
        inventory[6] = new Book(7, "978-0345339683", "The Lion, the Witch and the Wardrobe");
        inventory[7] = new Book(8, "978-0590353427", "Harry Potter and the Sorcerer's Stone");
        inventory[8] = new Book(9, "978-0062315007", "The Alchemist");
        inventory[9] = new Book(10, "978-0618640157", "The Lord of the Rings");
        inventory[10] = new Book(11, "978-0679783268", "Anna Karenina");
        inventory[11] = new Book(12, "978-0142437230", "Of Mice and Men");
        inventory[12] = new Book(13, "978-0143039433", "The Grapes of Wrath");
        inventory[13] = new Book(14, "978-0385472579", "Catch-22");
        inventory[14] = new Book(15, "978-0684830421", "The Old Man and the Sea");
        inventory[15] = new Book(16, "978-0060850524", "Brave New World");
        inventory[16] = new Book(17, "978-0486284736", "Frankenstein");
        inventory[17] = new Book(18, "978-0679601395", "Moby-Dick");
        inventory[18] = new Book(19, "978-0064404990", "A Wrinkle in Time");
        inventory[19] = new Book(20, "978-0064471046", "Charlotte's Web");
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println(" NEIGHBORHOOD LIBRARY ");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");
            System.out.print("\n Choose option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    System.out.println("\nThank you for choosing us!");
                    return;
                default:
                    System.out.println("\nNot correct. Try again.");
            }
        }
    }

   }