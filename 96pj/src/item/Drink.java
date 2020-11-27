package item;

import character.Hero;

public class Drink {
	private String name="よくわからない液体";
	int heal_point=250;//回復量又はダメージ量


	public void heal_Drink(Hero h1) {
	int random = (int)(Math.random()*2)+1;//回復か死亡かを決めるランダム数の生成

		//Hp250以上で使用可能
		if(h1.getHp()>250) {
		System.out.println("まだこいつを使うには早い");
		}else {
		System.out.println(this.name + "を使った！");
		//ランダムで回復か志死亡かを決める
		if(random==1) {
		h1.setHp(h1.getHp() + heal_point);
		System.out.println("これは、、！リポビタンPじゃないか！！");
		System.out.println("なんてウマさなんだ、、、涙が出るっ！！！");		
		System.out.println("HPが"+heal_point+"回復した！！");
		}else if(random==2) {
			h1.setHp(h1.getHp() - heal_point);
			System.out.println("これはっ、、！メタノール！！？？");
			System.out.println("腹部が爆発。"+heal_point+"ダメージを受けた！！");
			h1.dead();
			}
		}
		System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");

	}
}
