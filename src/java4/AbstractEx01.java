package java4;

//�߻�Ŭ������ new �Ҽ�����.
//�߻�Ŭ������ ��ü�� �ִ� �޼���� ���� �޼��带 ������ִ�.
interface Į{
	public abstract void ų();
	public abstract void �丮();
	public abstract void ����();
	public abstract void ����();
}

abstract class �丮����� implements Į {
	@Override
	public void ų() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}
class ������  extends  �丮�����{
	@Override
	public void �丮() {
		System.out.println("������ �丮");
		
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		Į k = new ������();
		k.�丮();
	}

}
