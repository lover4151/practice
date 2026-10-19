public class Book extends TangileAsset {
	private String isbh;
	public Book(String name,int price,String color,String isbh){
		super (name,price,color);
		this.isbh = isbh;
	}
	public String getIsbh(){return this.isbh;}
