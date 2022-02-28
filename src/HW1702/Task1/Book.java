package HW1702.Task1;

import java.util.Arrays;

public class Book {
   private String titleOfBook;
   private short pageCount;
   private short yearOfPublic;
   private String author[];

    public Book() {
    }

    public Book(String titleOfBook, short pageCount, short yearOfPublic, String[] author) {
        this.titleOfBook = titleOfBook;
        this.pageCount = pageCount;
        this.yearOfPublic = yearOfPublic;
        this.author = author;
    }

    public String getTitleOfBook() { return titleOfBook; }
    public void setTitleOfBook(String titleOfBook) {
        if (titleOfBook == null){
            System.out.println("Книга не может быть без названия!");
        }
        this.titleOfBook = titleOfBook;
    }

    public short getPageCount() { return pageCount; }
    public void setPageCount(short pageCount) {
        if (pageCount <= 0){
            System.out.println("У книги не может быть меньше 1 страницы");
        }
        this.pageCount = pageCount;
    }

    public short getYearOfPublic() { return yearOfPublic; }
    public void setYearOfPublic(short yearOfPublic) {
        if (yearOfPublic > 2022){
            System.out.println("Год публикации введен не корректно!");
        }
        this.yearOfPublic = yearOfPublic;
    }

    public String[] getAuthor() { return author; }
    public void setAuthor(String[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", pageCount=" + pageCount +
                ", yearOfPublic=" + yearOfPublic +
                ", author=" + Arrays.toString(author) +
                '}';
    }
}
