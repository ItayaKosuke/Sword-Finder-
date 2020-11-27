package item;

import character.Hero;

public class ItemUse {

	//各回復アイテムのインスタンス化
	Potion Po = new Potion();
	Drink Do = new Drink();
	Omisosiru Omiso = new Omisosiru();

	//各アイテムの使用回数カウント変数
	public static int Use_Po = 0;
	public static int Use_Dri = 0;
	public static int Use_Omi = 0;

	//BattleMain()から呼ばれるアイテム使用メソッド
	public void itemUse(Hero h1) {


	System.out.println("どのアイテムを使用しますか？");
	System.out.println("1.ラベルのないポーション 2.よくわからない液体　3.お味噌汁 ▼");
	int itemSelect = new java.util.Scanner(System.in).nextInt();
	switch(itemSelect) {

	case 1:
	Po.heal_Potion(h1);
	Use_Po++;
	break;

	case 2:
	Do.heal_Drink(h1);
	Use_Dri++;
	break;

	case 3:
	Omiso.heal_Omisosiru(h1);
	Use_Omi++;
	break;

	//１から３の選択肢以外が選択されたときの処理
	default :
	System.out.println("ポケットを探ったが何も出てこなかった");
	}
	}
}

