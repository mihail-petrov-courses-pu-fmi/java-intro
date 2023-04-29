import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Product[] productCollection = new Product[5];
        int productCollectionIndex = 0;

        while(true) {

            Product newProduct   = new Product();

            newProduct.name     = Console.readString("Име на продукта");
            newProduct.count    = Console.readInt("Количество от продукта");
            newProduct.price    = Console.readDouble("Единична цена");

            productCollection[productCollectionIndex++] = newProduct;

            for(Product element: productCollection) {
                if(element != null) {
                    System.out.println(element.name);
                }
            }
        }
    }
}