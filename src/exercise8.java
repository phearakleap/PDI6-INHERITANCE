import java.util.List;
import java.util.ArrayList;

public class exercise8 {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Baked Beans", 1.5));
        products.add(new Electronics("Laptop", 750.67, 5));
        products.add(new Clothing("Hoodie", 10.5, 'L'));
        products.add(new Book("The Summer You Were There", 13.7, "Yuama"));

        System.out.println("=====================================================\n");
        for(Product product : products){
            product.get_info();
            System.out.print("\n");
        }
        System.out.println("=====================================================");
    }
}

class Product{
    protected String name;
    protected double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void get_info(){
        System.out.printf("The product's name is: %s\n", name);
        System.out.printf("The product's price is: %.2f\n", price);
    }
}

class Electronics extends Product{
    private int warranty;

    Electronics(String name, double price, int warranty){
        super(name, price);
        this.warranty = warranty;
    }

    public void get_info(){
        System.out.printf("The electronic's name is: %s\n", name);
        System.out.printf("The electronic's price is: %.2f\n", price);
        System.out.printf("The electronic's warranty last for %d years\n", warranty);
    }
}

class Clothing extends Product{
    private char size;

    Clothing(String name, double price, char size){
        super(name, price);
        this.size = size;
    }

    public void get_info(){
        System.out.printf("The clothing's name is: %s\n", name);
        System.out.printf("The clothing's price is: %.2f\n", price);
        System.out.printf("The clothing's size is %c\n", size);
    }
}

class Book extends Product{
    private String author;

    Book(String name, double price, String author){
        super(name, price);
        this.author = author;
    }

    public void get_info(){
        System.out.printf("The book's name is: %s\n", name);
        System.out.printf("The book's price is: %.2f\n", price);
        System.out.printf("The book's author is: %s\n", author);
    }
}
