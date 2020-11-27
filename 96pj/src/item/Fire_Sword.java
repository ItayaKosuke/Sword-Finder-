package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import character.Enemy;
import character.Hero;

public class Fire_Sword extends Weapon{
	public String name;
	public int A_up;//武器による攻撃力上昇倍率

	public Fire_Sword() {

		this.name = "炎の剣";
		this.A_up = 4;

	}
	
	//スキルメソッド
	public void skill(Enemy m,Hero h1) throws IOException{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(this.name+"のスキル発動！！");
		rd.readLine();
		//BattleMainの炎の剣スキル使用制限変数が０以下ならば実行
		if(BattleMain.Turn_F <= 0) {
		BattleMain.Turn_F = 3;//BattleMainの炎の剣スキル使用制限変数をセット
		System.out.println("俺のこの手が光って唸る！！お前を倒せと輝き叫ぶ！！！");
		rd.readLine();
		h1.setPower(h1.getPower() + 100);
		System.out.println(h1.getName()+"の攻撃力が2ターンの間100ポイントアップ！");}

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
