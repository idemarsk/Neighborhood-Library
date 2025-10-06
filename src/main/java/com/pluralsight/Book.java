package com.pluralsight;

public class Book {
    // Book Class

        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        // Constructor
        public Book(int id, String isbn, String title) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = "";
        }

    }
