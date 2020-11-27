package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import character.Enemy;
import character.Hero;

public class Ice_Sword extends Weapon{
	public String name;
	public int A_up;//武器による攻撃力上昇倍率

	public Ice_Sword() {

		this.name = "氷の剣";
		this.A_up = 3;

	}
	
	//スキルメソッド
	public void skill(Enemy m,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(this.name+"のスキル発動！！");
		rd.readLine();
		//BattleMainの氷の剣スキル使用制限変数が０以下ならば実行
		if(BattleMain.Turn_I <= 0) {
		BattleMain.Turn_I = 3;//BattleMainの氷の剣スキル使用制限変数をセット
		System.out.println("攻防一体の冰気が"+h1.getName()+"を包む・・・！");
		rd.readLine();
		System.out.println("冰気の攻撃！！");
		m.setHp(m.getHp() - h1.getPower() * h1.We.getA_up());
		System.out.println(m.getName()+"に"+h1.getPower() * h1.We.getA_up() + "のダメージ！！！");
		if(m.getHp() > 0) {
		System.out.println(m.getName() + "の残り体力は" + m.getHp() + "の認識だ");}

		System.out.println(m.getName() + "の攻撃！");
		rd.readLine();
		System.out.println("冰気が敵の攻撃を防いだ！！！");
		rd.readLine();
		System.out.println(m.getName()+"はスキを見せた！");
			
		//////////////////////////////////////////////////////////////////////
		//追加で攻撃を行う
		System.out.println("1.攻撃 ▼");
		int attackSelect = new java.util.Scanner(System.in).nextInt();
		switch(attackSelect) {

		case 1:
		System.out.println("攻撃");
		System.out.println();
		//Heroのattackメソッド呼び出し
		h1.attack(m);
		if(m.getHp() <= 0) {
			System.out.println(m.getName() + "を倒した！");
		}

		break;

		}
		}
		/////////////////////////////////////////////////////////////////////
		else {
			System.out.println("散った冰気の昇華が不十分だ。");
			System.out.println("スキルの発動に失敗した。");
			rd.readLine();
		}


	}


	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getA_up() {return this.A_up;}
}
