package item;

import character.Hero;

public class Omisosiru {
	private String name="お味噌汁";
	int heal_point=100;


	public void heal_Omisosiru(Hero h1) {
		if(h1.getHp()+ heal_point>500) {
			System.out.println("もう飲めないお腹いっぱいだ");
		}else {
		System.out.println(this.name + "を使った！");
		h1.setHp(h1.getHp() + heal_point);
		System.out.println("HPが100回復した！！");
		}
		System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");

	}
}
