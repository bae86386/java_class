package java3;

/**
 * 
 * @author bee83
 *
*/

interface Unit {
	int getAtteck(); 
	int getHp();
	void setHp(int hp);
	String getName();
}

class Ultra implements Unit{
	private String name;
	private int hp;
	private int attack;
	public int getAtteck() {
		return attack;
	}
		
	public Ultra(String name) {
		this(name,100,40);
	}

	public Ultra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
class Zealot implements Unit{
	private String name ;
	private int hp ;
	private int attack ;
	public int getAtteck() {
		return attack;
	}
	
	
	public Zealot(String name) {
		this(name,100,10);
	}


	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}


	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Dragoon implements Unit{
	private String name ;
	private int hp ;
	private int attack ;
	
	
	
	public Dragoon(String name) {
		this(name,100,20);
	}
	public Dragoon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public int getAtteck() {
		return attack;
	};
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Hydra implements Unit{
	private String name;
	private int hp ;
	private int attack;
	
	public Hydra(String name) {
		this(name ,100,30);
	}
	public Hydra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public int getAtteck() {
		return attack;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

	

public class OOPEx04 {
	
	static void attack(Unit u1, Unit u2) {
		u2.setHp(u2.getHp() - u1.getAtteck());
		System.out.println(u2.getName() + "체력은"+u2.getHp()+"입니다.");
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		Hydra h1 = new Hydra("히드라1");
		Ultra u1 = new Ultra("울트라1");
		attack(z1,d1);
		attack(d1,z1);
		attack(d1,u1);
		attack(u1,z1);
	}

}
