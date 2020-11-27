package item;

import java.io.IOException;

import character.Enemy;
import character.Hero;

public class Weapon {
	public String name;
	public int A_up;//武器の攻撃力上昇倍率

	public Weapon(){

		this.name = "武器";
		this.A_up = 1;


	}

	//スキルメソッド
	public void skill(Enemy m,Hero h1) throws IOException{

		System.out.println("武器のスキル発動！！");

	}

	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getA_up() {return this.A_up;}
	}
