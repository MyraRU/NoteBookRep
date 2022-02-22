package HW1702.Task1;

public class Book {
   private String titleOfBook;
   private short pageCount;
   private short yearOfPublic;
   private String author1;
   private String author2;
   private String author3;


    public String getTitleOfBook() { return titleOfBook; }
    public void setTitleOfBook(String titleOfBook) {
        if (titleOfBook == null){
            throw new IllegalArgumentException ("Книга не может быть без названия!");
        }
        this.titleOfBook = titleOfBook;
    }

    public short getPageCount() { return pageCount; }
    public void setPageCount(short pageCount) {
        if (pageCount <= 0){
            throw new IllegalArgumentException ("У книги не может быть меньше 1 страницы");
        }
        this.pageCount = pageCount;
    }

    public short getYearOfPublic() { return yearOfPublic; }
    public void setYearOfPublic(short yearOfPublic) {
        if (yearOfPublic <= 0 || yearOfPublic > 2022){
            throw new IllegalArgumentException ("Книга не может быть опубликованна в нулевом году так же," +
                    "год публикации не может быть больше текущего года!");
        }
        this.yearOfPublic = yearOfPublic;
    }

    public String getAuthor1() { return author1; }
    public void setAuthor1(String author1) {
        this.author1 = author1;
    }

    public String getAuthor2() { return author2; }
    public void setAuthor2(String author2) {
        this.author2 = author2;
    }

    public String getAuthor3() { return author3; }
    public void setAuthor3(String author3) {
        this.author3 = author3;
    }
}
