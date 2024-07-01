package lesson.javaBasic;

public class ProductFactory {

    public Product get_product(String product_type){

        if(product_type == null){
            return null;
        }

        if(product_type.equalsIgnoreCase("ProductA")){
            return new ConcreteProductA();
        }

        if(product_type.equalsIgnoreCase("ProductB")){
            return new ConcreteProductB();
        }

     return null;
    }
}
