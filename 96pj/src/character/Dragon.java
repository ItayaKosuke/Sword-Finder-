package character;

public class Dragon extends Enemy{

	private String name;//Dragonの名前
	private int hp;//DragonのHP
	private int power;//Dragonの攻撃力
	private int ex;//倒された時にヒーローに渡す経験値

	public Dragon() {

		this.name = "バハムーチョ";//Dragonの名前
		this.hp = 100;//Dragonの初期HP
		this.power = 15;//Dragonの初期攻撃力
		this.ex = 60;//ドラゴンが倒された時に渡す初期経験値
	}

	//攻撃メソッド
	public void attack(Hero h1) {

		System.out.println();
		System.out.println(this.name + "の攻撃");
		System.out.println(h1.getName()+"に"+power+"のダメージ");
		h1.setHp(h1.getHp() - power);
		//HeroのHPが0より上の時
		if(h1.getHp() > 0) {
			System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");
			}
		System.out.println();
		}
		//hpのゲッターメソッド
		public int getHp() {return this.hp;}
		//hpのセッターメソッド
		public void setHp(int hp) {this.hp = hp;}

		//nameのゲッターメソッド
		public String getName() {return this.name;}
		//nameのセッターメソッド
		public void setName(String name) {this.name = name;}

		//enemyの経験値ゲットメソッド
		public int getEx() {return this.ex;}
		//enemyの経験値セットメソッド
		public void setEx(int ex) {this.ex = ex;}

		//enemyの攻撃力ゲットメソッド
		public int getPower() {return this.power;}
		//enemyの攻撃力セットメソッド
		public void setPower(int power) {this.power = power;}
}
