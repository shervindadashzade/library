package library.models;

import library.Core.Library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Member extends Person {
    private LocalDate signUpDate;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private Book reservedBook;
    private int shouldPay;



    public Member(String nationalID, String password, String name, String lastName, String birthday, Gender gender) {
        super(nationalID, password, name, lastName, birthday, gender);

        signUpDate = LocalDate.now();
    }

    public Result borrowBook(Book book) {
        if (book.getMemberWhoReserved() != null) {
            return Result.RESERVED;
        }

        if (book.getMemberWhoBorrowed() != null) {
            return Result.BORROWED;
        }

        this.borrowedBooks.add(book);
        book.borrow(this);


        return Result.SUCCESS;
    }

    public Result reserveBook(Book book) {
        if (book.getMemberWhoReserved() != null)
            return Result.RESERVED;

        if (book.getMemberWhoBorrowed() != null)
            return Result.BORROWED;

        if (this.reservedBook != null)
            return Result.RESERVED;

        this.reservedBook = book;
        book.reserve(this);

        return Result.SUCCESS;
    }

    public Result giveBack(Book book){
        for (Book book1:borrowedBooks){
            if (book1 == book){
                borrowedBooks.remove(book1);
                book1.setMemberWhoBorrowed(null);
                book1.setBorrowedDate(null);

                return Result.SUCCESS;
            }
        }
        return Result.FAILED;
    }
}
