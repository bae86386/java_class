package java3;

//Book b1 = new Book();
//���赵 (����,����,�ʱ�ȭ
public class Book {
	private int num;//å��ȣ
	private String name;//å�̸�
	private int page;//å ������
	private String category;//å ī�װ�
	
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
