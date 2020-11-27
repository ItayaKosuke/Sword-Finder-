//ボスのクラス by 荒金栄治

package character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import story.EndStory;

public class Boss extends Enemy{

	//ボスの基礎能力
    private String name = "絶望の王";
    private int hp = 3000;
    private int mp = 100;
    private int power = 50;

    //エンターで会話が進むように文字の受付
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //ボスが死んだ時にエンドロールとスコアを出す
    EndStory endS = new EndStory();

    int bc = 1;//バトルカウント このカウントに応じてボスのアクションが変わる
    int pp = 1;//パワーポイント ターンに応じてボスの攻撃力を変更する

    //ボスのメインアタックメソッド
    public void bossAttack(Hero h1,BattleMain bat) throws IOException {

    	reader.readLine();
        if(this.hp <= 0) {//ボスの体力が0以下になるとスタッフロールが流れる
        	endS.announceEnd(h1);
     	    endS.stuffRoll();

        }else if(h1.getHp() >= 500) {//ヒーローの体力が500以上の時に強攻撃を打つ
        	System.out.println(this.name+"は見えない速さで斬撃を放った ");
        	h1.setHp(h1.getHp() - power*10);
        	System.out.println(this.name+"は"+h1.getName()+"に"+power*6+"のダメージを与えた ");
        	System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ ");
        	bc++;

        }else if(bc == 3) {//バトルカウントが3のときにパワーポイントアップ
        	System.out.println(this.name+"は力を溜めている ");
        	pp++;
        	bc++;

        }else if(bc == 4) {//バトルカウントが4のときにパワーポイントアップ魔法 mpのダメージ
        	System.out.println(this.name+"は灼熱の炎を放った ");
        	h1.setHp(h1.getHp() - mp);
        	System.out.println(this.name+"は"+h1.getName()+"に"+mp+"のダメージを与えた ");
        	System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ ");
        	bc++;

        }else if(bc == 5) {//バトルカウントが5の時に麻痺の呪文
        	System.out.println(this.name+"は麻痺の呪文を唱えた ");
        	bat.setSp(2);
        	bc=1;

        }else {//上記以外は普通の攻撃
	        reader.readLine();
	        System.out.println(this.name + "の攻撃  ");
	        System.out.println("");
			h1.setHp(h1.getHp() - power*pp);
			System.out.println(this.name+"は"+h1.getName()+"に"+power*pp+"のダメージを与えた ");
			System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ ");
			pp = 1;
			bc++;
        }

    }

    //ボス登場時に出力される言葉
    public void bossStart(Hero h1) throws IOException {

    	reader.readLine();
    	System.out.println("お前が"+h1.getName()+"か  ");
    	reader.readLine();
    	System.out.println("思ったより弱そうだな、、、、  ");
    	reader.readLine();
    	System.out.println("さあ、かかってこい  ");
    	reader.readLine();

    }

    //ボスの特殊能力 25回に1回の確立でヒーローの体力が0になる
    public void bossSuper(Hero h1) throws IOException {

    	int random = (int)(Math.random()*10);
		switch(random) {

		case 0:
			System.out.println("");
			System.out.println(this.name+"は死の呪いを唱えた ");
			reader.readLine();
			System.out.println(h1.getName()+"は死亡した ");
			h1.setHp(0);
			System.out.println("");

		break;

		default:
		break;

		}
	}

    //ボスの各データのゲッターとセッター
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}


