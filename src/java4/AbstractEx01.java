package java4;

//추상클래스는 new 할수없다.
//추상클래스는 몸체가 있는 메서드와 없는 메서드를 만들수있다.
interface 칼{
	public abstract void 킬();
	public abstract void 요리();
	public abstract void 군무();
	public abstract void 조각();
}

abstract class 요리어댑터 implements 칼 {
	@Override
	public void 킬() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 조각() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 군무() {
		// TODO Auto-generated method stub
		
	}
}
class 백종원  extends  요리어댑터{
	@Override
	public void 요리() {
		System.out.println("백종원 요리");
		
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		칼 k = new 백종원();
		k.요리();
	}

}
