public abstract class Library{
    protected String[] books;
    protected String[] personal;

    public Library(){
    }

    public Library(String[] books,String[] personal){
        this.books = books;
        this.personal = personal;
    }

    protected abstract String giveOutBook(int id);
}
