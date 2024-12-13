class Product{
int productId;
String productName;
String productType;
int productPrice;
static String brandName="Raymonds";
//instance method
void productDetails(){
System.out.println("Product Details:"+productId+","+productName+","+productType+","+productPrice+","+brandName);
}
static void getBrand(){
 System.out.println(brandName);
}
}
 public class productDemo1{
 public static void main(String args[]){
 Product product1=new Product();

 product1.productId=1203;
 product1.productName="Shirt";
 product1.productType="Cloth";
 product1.productPrice=9999;
 product.brandName="Zara";
 product.getBrand();
 product product2=new Product();
 product2.productId=1204;
 product2.productName="Shirt";
 product2.productType="Cloth";
 product2.productPrice=99999;
 product.brandName="H&M";
 product.getBrand();
}
} 