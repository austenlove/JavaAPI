package com.example.javaapi.ObjectTest;

public class Book {

    /** 책 정보를 관리할 수 있는 Book클래스 작성 */
    private int number;
    private String title;
    private String author;
    private int price;

    /** 기본 생성자 */
    public Book() {}

    /** 모든 필드를 초기화하는 생성자 */
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /** getter & setter */
    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookVO [number=" + this.number
                + ", title=" + title
                + ", author=" + author
                + ", price=" + price
                + "]";
    }
}