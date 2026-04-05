class Amazon {
	void search(String product) {
		System.out.println("product = "+product);
	}
	void search(String product,int price) {
		System.out.println("product = "+product);
		System.out.println("price = "+price);

	}
	void search(String product,int price,String warranty) {
		System.out.println("product = "+product);
		System.out.println("price = "+price);
		System.out.println("warrantry = "+warranty);
	    
	}

}
public class Main
{
	public static void main(String[] args) {
		Amazon a = new Amazon();
		// a.search("laptop");
		// a.search("laptop",50000);
		a.search("asus",50000,"2 years");

	}
}
