class Product{
int productId;
String productName;
String productPrice;
//instance method
void productDetails(){
system.out.println("Product Details:"+productId+","+productName+","+productType+","+productPrice);
}
}
public class ProductDemo{
 public static void main(String args[]){
 product product1=new Product();
 product1.productId=1203;
 product1.productName="Shirt";
 product1.productType="Cloth";
 product1.productPrice="999";
 productDetails();
}
}