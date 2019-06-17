package library.models;

import library.Core.Library;

import java.time.LocalDate;
import java.time.LocalTime;

public class Book {
    private final String ISBN;
    private String name, authorName, year, description;
    private Member memberWhoBorrowed = null;
    private Member memberWhoReserved = null;

    private LocalDate borrowedDate;
    private LocalTime reserveTime;

    // TODO: 6/16/19 set library
    public Library library;

    public Book(String ISBN, String name, String authorName, String year, String description) {
        this.ISBN = ISBN;
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.description = description;
    }

    public void borrow(Member member){
        setMemberWhoBorrowed(member);
        setBorrowedDate(LocalDate.now());
    }

    public void reserve(Member member){
        setMemberWhoReserved(member);
        reserveTime = LocalTime.now();

    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Member getMemberWhoBorrowed() {
        return memberWhoBorrowed;
    }

    public void setMemberWhoBorrowed(Member memberWhoBorrowed) {
        this.memberWhoBorrowed = memberWhoBorrowed;
    }

    public Member getMemberWhoReserved() {
        return memberWhoReserved;
    }

    public void setMemberWhoReserved(Member memberWhoReserved) {
        this.memberWhoReserved = memberWhoReserved;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }
}
