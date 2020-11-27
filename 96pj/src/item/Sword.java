package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import character.Enemy;
import character.Hero;

public class Sword extends Weapon{

	public String name;
	public int A_up;//武器による攻撃力上昇倍率

	public Sword() {

		this.name = "普通の剣";
		this.A_up = 2;

	}

	//スキルメソッド
	public void skill(Enemy m,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(this.name+"のスキル発動！！");
		rd.readLine();
		//BattleMainの普通の剣スキル使用制限変数が０以下ならば実行
		if(BattleMain.Turn_S <= 0) {
		BattleMain.Turn_S = 6;//BattleMainの普通の剣スキル使用制限変数をセット
		System.out.println("このつるぎ、、、舞える！！");
		rd.readLine();
		System.out.println("つるぎのまい！！");
		rd.readLine();
		h1.setPower(h1.getPower() + 20);
		System.out.println(h1.getName()+"の攻撃力が5ターンの間20ポイントアップ！");}

		else {
			System.out.println(h1.getName()+"の攻撃力はもう上昇している、、！！");
			System.out.println("スキルの発動に失敗した。");
			rd.readLine();
		}

	}




	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getA_up() {return this.A_up;}
}

