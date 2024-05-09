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
        return "Book [number=" + this.number
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


    @Override
    public int hashCode() {
        // 곱셈 연산을 누적시켜야 하기 때문에 0이 아닌 값으로 초기화
        int result = 1;

        // 필드마다 곱해줄 소수값을 선언
        // 31 사용은 통상적인 관례이며, 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확율을 증가시킴
        final int PRIME = 31;

        // 31과 필드값을 이용하여 새로운 hashCode 연산 (필드값이 같은 경우 동일한 hashCode 반환)
        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();

        return result;
    }

}