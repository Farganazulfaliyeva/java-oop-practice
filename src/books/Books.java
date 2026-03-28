package books;
public class Books {
   private String title;
   private String author;
   private int pages;

    public Books(String title, String author, int pages){
        setTitle(title);
        setPages(pages);
        setAuthor(author);
    }
    public String getTitle(){return title;}
    public  String getAuthor(){return author;}
    public int getPages(){return pages;}

   public void setTitle(String title){
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title=title;
   }
   public void setAuthor(String author){
        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author cannot be empty.");
        }
       this.author=author;
   }

   public void setPages(int pages){
       if (pages <1 ){
          throw new IllegalArgumentException("Invalid pages count!");
       }
       this.pages =pages;
   }

   public void printInfo(){
       System.out.println("Title: " + title);
       System.out.println("Author: "+ author);
       System.out.println("Pages Count: "+ pages);
       System.out.println("---------------------------------");
   }
}