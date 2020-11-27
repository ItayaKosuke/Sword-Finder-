package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import character.Enemy;
import character.Hero;

public class Lightning_Sword extends Weapon{
	public String name;
	public int A_up;//武器による攻撃力上昇倍率

	public Lightning_Sword() {

		this.name = "雷の剣";
		this.A_up = 3;

	}

	//スキルメソッド
	public void skill(Enemy E,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(this.name+"のスキル発動！！");
		rd.readLine();
		//BattleMainの雷の剣スキル使用制限変数が０以下ならば実行
		if(BattleMain.Turn_L <= 0) {
		BattleMain.Turn_L = 5;//BattleMainの雷の剣スキル使用制限変数をセット
		System.out.println("ライトニングカウル！！！");
		rd.readLine();
		System.out.println(h1.getName()+"に帯電する蒼白の稲妻は攻撃力を上昇させるだけでなく");
		System.out.println("細胞レベルで電気信号に作用し神経系にオーバーフローを引き起こす！");
		rd.readLine();
		h1.setPower(h1.getPower() + 20);
		}
		else {
			System.out.println("これ以上の帯電は危険だ・・・！！！");
			System.out.println("スキルの発動に失敗した。");
			rd.readLine();

		}
	}

		public String getName() {return this.name;}
		public void setName(String name) {this.name = name;}
		public int getA_up() {return this.A_up;}
}
