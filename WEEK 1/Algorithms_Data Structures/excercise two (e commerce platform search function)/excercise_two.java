import java.util.Scanner;

class product{
    int id;
    String name;

    public product(int id , String name){
        this.id = id;
        this.name = name;
    }
}

class getproduct{
    public static product searchProduct(product[] products ,String target){
        for(int i=0 ; i<products.length; i++){
            if(products[i].name.equalsIgnoreCase(target)) return products[i];
        }
        return null;
    }
}

public class excercise_two {
    public static void main(String[] args) {
        product[] products = { new product(101, "Mobile"),
                               new product(102, "Laptop"),
                               new product(103, "Headphones"),
                               new product(104, "Smart watch"),
                               new product(105, "Keyboard") 

        };
    
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the name of the product you want to search");
        String search = scan.nextLine();

        product result = getproduct.searchProduct(products , search);

        if(result != null){
            System.out.println("the product is found");
            System.out.println("the name of the product is "+result.name);
            System.out.println("the id of the product is "+result.id);
        }
        else{
            System.out.println("product is not found");
        }
        scan.close();
    }
}
