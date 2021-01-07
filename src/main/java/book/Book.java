package book;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    public String getName() {
        return name;
    }

    Author author;
    private String name;
    int rank = 0;

    public int getReleaseDate() {
        return releaseDate;
    }

    private int releaseDate;

    Book() {
    }

    public Book(int rank) {
        this.rank = rank;
    }

    public int compareTo(Book book) {
        if (this.rank > book.rank) {
            return 1;
        }
        if (this.rank < book.rank) {
            return -1;
        } else return 0;
    }

    public int randomIntBetween(int first, int second) {
        return first + (int) Math.round(Math.random() * (second - first));
    }

    public LocalDate createRandomDate(int firstYear, int lastYear) {
        int day = randomIntBetween(1, 28);
        int month = randomIntBetween(1, 12);
        int year = randomIntBetween(firstYear, lastYear);
        return LocalDate.of(year, month, day);
    }

    public void setName(String name) {
        this.name = name;
    }
}

