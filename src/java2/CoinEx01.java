package java2;

public class CoinEx01 {

	int restmoney = 2680;
	void restMoneyPrint( int coin) {
		System.out.println(coin +"원 갯수" + restmoney / coin);
		restmoney = restmoney % coin;
		System.out.println("남은금액" + restmoney);
	}
	public static void main(String[] args) {

		CoinEx01 coinex01 = new CoinEx01();
		int[] coin = {500,100,50,10};
		
		// 500 * 5 + 100*1 + 50*1 + 10*3
		for(int i = 0; i<4; i ++) {
			coinex01.restMoneyPrint(coin[i]);
		}
	}

}
