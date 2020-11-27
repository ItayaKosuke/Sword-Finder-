package character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import item.Weapon;


public class Hero {

	private String name;
	private int hp = 500;//HeroのHP
	private int power = 20;//Heroの攻撃力
	private int ex_po = 0;//Heroの経験値
	private int level = 1;//Heroのレベル
	private int ex = 0;//Heroの経験値
	private int restart = 0;//Heroの復活回数
	public Weapon We;//インスタンス化されたウェポン変数


	//攻撃メソッド
	public void attack(Enemy m) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(this.name + "は" + this.We.getName() + "で攻撃");

		m.setHp(m.getHp() - power * We.getA_up());
		System.out.println(m.getName()+"に"+(power+ex_po) * We.getA_up() + "のダメージ！！！");
		//モンスターHPが0より上の時
		if(m.getHp() > 0) {
		System.out.println(m.getName() + "の残り体力は" + m.getHp() + "だ");}
		rd.readLine();
		//
	}
		//Heroのデッドメソッド
		public void dead() {
		//選択された数字以外が入力された場合ループ
			for(int i = 3;i >=3;) {
		Scanner scanner = null;
		System.out.println("1.復活の呪文を唱える 2.そっと見送る　▼");
		scanner = new Scanner(System.in);
		//String型が入力された場合の例外処理
		try {
			int selectDead = scanner.nextInt();
			i = selectDead;
			switch(selectDead) {
				case 1:
				this.setHp(500);
				System.out.println("HeroのHPが"+this.getHp()+"回復した ");
				System.out.println();
				System.out.println("Heroが復活した ");
				setReStart(getReStart()+1);
				System.out.println("コンテニュー回数は"+getReStart()+"回だ");
				break;

				case 2:
				System.out.println("ゲームオーバーになりますがよろしいですか ▼");
				System.out.println("1.やっぱり冒険を続けたい 2.もういい、冒険なんかやめだー! ");
				Scanner sc = new Scanner(System.in);
				//String型が入力された場合の例外処理
				try {
				int death = sc.nextInt();
				//64行目でdeathに1が入力された場合処理
				if(death==1) {i = 3;
				System.out.println("じゃあどうするんだ？ ");}
				//64行目でdeathに2が入力された場合処理
				if(death==2) {
				System.out.println("Heroは復活を諦めてしまった ");
				}
				//64行目でdeathに1又は2以外が入力された場合処理
				if(death>=3) {
					i = 3;
					System.out.println("おめぇ何言ってるかわかんねーな ");
				}
				}catch(InputMismatchException e) {
					i = 3;
					System.out.println("おめぇ何言ってるかわかんねーな ");
				}
				break;
				}
				}catch(InputMismatchException e){
				//System.out.println("型が違います"+e);
			}finally {
				//64行目でdeathに1又は2以外が入力された場合処理
				if(i != 1 && i != 2) {System.out.println("ふざけてる場合じゃないぞ");}
			}
		}
	}
	//Heroの名前の受け取り_ゲッターメソッド
	public String getName() {return this.name;}
	//Heroの名前のセット_セッターメソッド
	public void setName(String name) {this.name = name;}


	//hpのゲッターメソッド
	public int getHp() {return this.hp;}
	//hpのセッターメソッド
	public void setHp(int hp) {this.hp = hp;}

	public Weapon getWeapon() {return this.We;}

	public void setWeapon(Weapon We) {this.We = We;}

	public void setPower(int power) {this.power = power;}
	public int getPower() {return this.power;}

	public int getEx_po() {return this.ex_po;}
	//hpのセッターメソッド
	public void setEx_po(int ex_po) {this.ex_po = ex_po;}

	//Heroの経験値ゲットメソッド
	public int getExperience() {return this.ex;}
	//Heroの経験値セットメソッド
	public void setExperience(int ex) {this.ex = ex;}

	//enemyのレベルゲットメソッド
	public int getLevel() {return this.level;}
	//enemyのレベルセットメソッド
	public void setLevel(int level) {this.level = level;}

	//enemyのレベルゲットメソッド
	public int getReStart() {return this.restart;}
	//enemyのレベルセットメソッド
	public void setReStart(int restart) {this.restart = restart;}

}
