public class exercise5 {
    public static void main(String[] args){
        Book heartless = new Book("Heartless", 90006);

        heartless.display_info();
        
    }
}

class LibraryItem{
    protected String _title;
    protected int _id;

    LibraryItem(String _title, int _id){
        this._title = _title;
        this._id = _id;
    }
}

class Book extends LibraryItem{
    Book(String _title, int _id){
        super(_title, _id);
    }

    public void display_info(){
        System.out.printf("The book's name is: %s\n", _title);
        System.out.printf("The book's ID is: %d\n", _id);
    }
}