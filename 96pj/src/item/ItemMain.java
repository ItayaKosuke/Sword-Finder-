package item;

import character.Hero;

	public class ItemMain {
	public void itemCreate(Hero h1) {

		//各アイテムのインスタンス化
		Weapon W = new Weapon();
		Sword S = new Sword();
		Lightning_Sword L = new Lightning_Sword();
		Ice_Sword I = new Ice_Sword();
		Fire_Sword F = new Fire_Sword();


		int random = (int)(Math.random()*4);//０から３の数字をランダム生成
		switch(random) {

		case 0:
			System.out.println(S.getName() + "を見つけた！！！");
				System.out.println("拾って装備しますか？");
				System.out.println("1.はい 2.いいえ ▼");
				int select_0 = new java.util.Scanner(System.in).nextInt();
				switch(select_0) {
				case 1:
					h1.setWeapon(S);
					System.out.println(S.getName() + "を装備した！！！");
				break;
				case 2:
					System.out.println("このまま旅を続けよう");
					System.out.println(h1.getName() + "は" + h1.We.getName() + "で旅を続けている");
				break;
				}
		break;

		case 1:
			System.out.println(L.getName() + "を見つけた！！！");
			System.out.println("拾って装備しますか？");
			System.out.println("1.はい 2.いいえ ▼");
			int select_1 = new java.util.Scanner(System.in).nextInt();
			switch(select_1) {
			case 1:
				h1.setWeapon(L);
				System.out.println(L.getName() + "を装備した！！！");
				//h1.setPower(h1.getPower()*S.A_up);
			break;
			case 2:
				System.out.println("このまま旅を続けよう");
				System.out.println(h1.getName() + "は" + h1.We.getName() + "で旅を続けている");
			break;
			}
		break;

		case 2:
			System.out.println(I.getName() + "を見つけた！！！");
			System.out.println("拾って装備しますか？");
			System.out.println("1.はい 2.いいえ ▼");
			int select_2 = new java.util.Scanner(System.in).nextInt();
			switch(select_2) {
			case 1:
				h1.setWeapon(I);
				System.out.println(I.getName() + "を装備した！！！");
				//h1.setPower(h1.getPower()*S.A_up);
			break;
			case 2:
				System.out.println("このまま旅を続けよう");
				System.out.println(h1.getName() + "は" + h1.We.getName() + "で旅を続けている");
			break;
			}
		break;

		case 3:
			System.out.println(F.getName() + "を見つけた！！！");
			System.out.println("拾って装備しますか？");
			System.out.println("1.はい 2.いいえ ▼");
			int select_3 = new java.util.Scanner(System.in).nextInt();
			switch(select_3) {
			case 1:
				h1.setWeapon(F);
				System.out.println(F.getName() + "を装備した！！！");
			break;
			case 2:
				System.out.println("このまま旅を続けよう");
				System.out.println(h1.getName() + "は" + h1.We.getName() + "で旅を続けている");
			break;
			}
		break;
		}

	}


}
