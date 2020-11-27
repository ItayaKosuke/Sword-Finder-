package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import character.Enemy;
import character.Hero;

public class Punch extends Weapon{
	public String name;
	public int A_up;//武器による攻撃力上昇倍率

	public Punch() {

		this.name = "拳";
		this.A_up = 1;
		
}

	//スキルにより呼び出され攻撃を行うメソッド
	public void skill_D(Enemy m,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("デュクシ！デュクシ！");
		rd.readLine();
		m.setHp(m.getHp() - 10);
		System.out.println(m.getName()+"に10のダメージ！！");
		
		if(m.getHp() > 0) {
		System.out.println(m.getName() + "の残り体力は" + m.getHp() + "だ");}
		rd.readLine();

	}

	//スキルメソッド
	public void skill(Enemy E,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		int random = (int)(Math.random()*4);//0から3の数字をランダム生成
		switch(random) {

		case 0:
			System.out.println("奥義！多連デュクシ！");
			skill_D(E,h1);
			System.out.println("デュクシは1回あたった");
		break;

		case 1:
			System.out.println("奥義！多連デュクシ！");
			skill_D(E,h1);//複数回呼び出すことで、連続実行を行う
			rd.readLine();
			skill_D(E,h1);
			System.out.println("デュクシは2回あたった");
		break;

		case 2:
			System.out.println("奥義！多連デュクシ！");
			skill_D(E,h1);
			rd.readLine();
			skill_D(E,h1);
			rd.readLine();
			skill_D(E,h1);
			System.out.println("デュクシは3回あたった");
		break;

		case 3:
			System.out.println("秘儀！！百連デュクシ！！！！！");
			rd.readLine();
			System.out.println("デュ〜デュデュデュデュデュデュデュデュ！！！！！");
			rd.readLine();
			E.setHp(E.getHp() - 100);
			System.out.println(E.getName()+"に100のダメージ！！");
			if(E.getHp() > 0) {
			System.out.println(E.getName() + "の残り体力は" + E.getHp() + "だ");
			rd.readLine();
			}

		break;
		}

	}
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getA_up() {return this.A_up;}

}
