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


    @Override
    public boolean equals(Object obj) {
        /** 경우에 따라 동일한 필드값을 가지는 객체를 동일 객체로 취급할 필요
         * 그러한 경우 equals() 메소드를 오버라이딩하여, 각각의 필드가 동일한 값을 가지는지를 확인하고
         * 모든 필드값이 같은 값을 가지는 경우 true, 아닌 경우 false를 반환하도록 작성 */

        // 두 인스턴스 주소가 같으면 true 반환
        if(this == obj) {
            return true;
        }

        // this는 인스턴스가 생성되면 주소값이 저장되므로 null일 수 없다.
        if(obj == null) {
            return false;
        }

        // 전달된 레퍼런스 변수를 Book 타입으로 형변환하여 각 필드별로 비교
        Book other = (Book) obj;

        if(this.number != other.number) {
            return false;
        }

        if(this.title == null) {
            if(other.title != null) {
                return false;
            }
        } else if (!this.title.equals(other.title)) {
            return false;
        }

        if(this.author == null) {
            if(other.author != null) {
                return false;
            }
        } else if(!this.author.equals(other.author)) {
            return false;
        }

        if(this.price != other.price) {
            return false;
        }

        // 위의 모든 조건 통과 시 true 반환
        return true;
    }

}