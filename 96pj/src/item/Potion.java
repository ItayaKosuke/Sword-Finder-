package item;

import character.Hero;

public class Potion {

	private String name="ラベルのないポーション";
	int heal_point=50;


	public void heal_Potion(Hero h1) {
		heal_point = (int)(Math.random()*200);
		if(h1.getHp()+ heal_point>500) {
			System.out.println("もう飲めないお腹いっぱいだ");
		}else {
		System.out.println(this.name + "を使った！");
		h1.setHp(h1.getHp() + heal_point);
		System.out.println("HPが"+heal_point+"回復した！！");
		}
		System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");

	}


}
