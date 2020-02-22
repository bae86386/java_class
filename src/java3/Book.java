package java3;

//Book b1 = new Book();
//설계도 (상태,행위,초기화
public class Book {
	private int num;//책번호
	private String name;//책이름
	private int page;//책 페지수
	private String category;//책 카테고리
	
	public Book() {
		
	}
	
	public Book(String name, int page) {
		this.name = name;
		this.page = page;
	}

	public Book(int num, String name, int page, String category) {
		this.num = num;
		this.name = name;
		this.page = page;
		this.category = category;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
