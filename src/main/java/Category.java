package java;


import java.util.ArrayList;

public class Category {

    private ArrayList<Product> products;
    private String title;

    public Category(String title) {
        this.products = new ArrayList<>();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Just for debug
     */
    public void print() {
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println(getTitle());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        products.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product p) {
                System.out.println(p.getName() + "  " + p.getPrice() + "  Рейтинг: " + p.getRating());
            }
        });
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
    }
}
