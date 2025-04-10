import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = sc.nextInt();

        Product product1 = new Product("codetree",50);
        Product product2 = new Product(s,n);

        System.out.println("product " + product1.code + " is " + product1.name);
        System.out.println("product " + product2.code + " is " + product2.name);
    }
}

class Product{
    String name;
    int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}