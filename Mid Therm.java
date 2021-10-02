package products;

public class Product {
    String name;
	void setNama(String newNama){
		nama=newNama;
	}
	String getNama(){
		return nama;
	}
	public static void main(String args[]){
		SetGet sg=new SetGet();
		sg.setNama("Azhar");
		System.out.println(sg.getNama());
	}
    double price;
	
    private double subtotal, discount_amount, tax_amount, grandTotal;
    public Product(String name){
        this.name = name;
    }

    public void setPrice(double price){
    public void setPrice(double p) {
      price = p;
      if (price < 0) {
         price = 0;
      }
   }
   public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void choose(double price) {
        this.price = price;
        Scanner sc = new Scanner(System.in);
        int menuNumber = sc.nextInt();
    }
 
		{
             double totalBill = 0, salesTax = 0;
             List<Product> productList = getProductList();
             foreach (Product prod in productList)
             {
                 double tax = prod.ComputeSalesTax();
                 salesTax += tax;
                 totalBill += tax + (prod.Quantity * prod.ProductPrice);
                 Console.WriteLine(string.Format("Item = {0} : Quantity = {1} : Price = {2} : Tax = {3}", prod.ProductName, prod.Quantity, prod.ProductPrice + tax, tax));
       public static void main(String[] args) {
        int price;
        int discount;

        Scanner sc = new Scanner(System.in);

        print("Enter price of the product :");
        price = sc.nextInt();

        print("Enter Discount of the product :");
        discount = sc.nextInt();

        int finalPrice = (price * discount) / 100;

        print("Final price is " + finalPrice);
      

        System.out.println("==========ProductListing========");
        System.out.println(String.format("Harga dalam Rupiah: Rp%,.2f", price));
        System.out.println(String.format("Subtotal: Rp%,.2f", subtotal));
        System.out.println(String.format("potongan: Rp%,.2f", discount_amount));
        System.out.println(String.format("pajak: Rp%,.2f", tax_amount));
        System.out.println(String.format("grand total: Rp%,.2f", grandTotal));
        System.out.println("==================");
    }
}