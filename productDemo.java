class Product{
int productId;
String productName;
String productType;
int productPrice;
//instance method
void productDetails(){
System.out.println("Product Details:"+productId+","+productName+","+productType+","+productPrice);
}
}
 public class productDemo{
 public static void main(String args[]){
 Product product1=new Product();
 product1.productId=1203;
 product1.productName="Shirt";
 product1.productType="Cloth";
 product1.productPrice=999;
 product1.productDetails();
}
} 