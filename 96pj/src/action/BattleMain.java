package action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import character.Boss;
import character.Enemy;
import character.Hero;
import item.ItemUse;

public class BattleMain {

	ItemUse IU = new ItemUse();

	private int attackSelect ;//プレイヤーの行動を選択する変数
	private int sp ;//死の呪いの数値格納用
	public static  int Turn_F = -1;//炎の剣スキルの使用制限のための変数
	public static  int Turn_I = -1;//氷の剣スキルの使用制限のための変数
	public static  int Turn_L = -1;//雷の剣スキルの使用制限のための変数
	public static  int Turn_S = -1;//普通の剣スキルの使用制限のための変数
	//スキャナーを宣言
	Scanner scanner = null;
	//ボスを除いたモンスターとの戦闘
	public void battleStart(Enemy m,Hero h1,int posiHierarchy) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		//Heroの攻撃力にレベルを反映
		h1.setEx_po(h1.getLevel()*2);
		//敵のレベルを決定
		int level = posiHierarchy + (int)(Math.random()*2);
		//敵のHPをセット
		m.setHp(m.getHp()+5*level);
		//敵の攻撃力をセット
		m.setPower(m.getPower()+5*level);
		//敵の放出経験値をセット
		m.setEx(60+10*level);//敵のExを再設定1

		//出てきた敵を確認
		System.out.println(m.getName()+"[レベル"+level+"]が出現！！");
		System.out.println();
		//ヒーローか敵が倒れるまでループ
		//while(ヒーローまたは敵のHpが0になるまでループ){

		do{//自分の行動ターンの開始

			rd.readLine();
		System.out.println("///////////////////////////////////////");
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////////////
		//炎の剣の使用制限
		if (Turn_F > 0 ){System.out.println(h1.getName()+"の攻撃力は上昇したままだ！！！");}
		if (Turn_F == 1 ){
			h1.setPower(h1.getPower() - 100);
			System.out.println(h1.getName()+"の攻撃力は元に戻った。。。");
			};
		 Turn_F--;
		 ////////////////////////////////////////////////////////////////////////////////////////
		 ////////////////////////////////////////////////////////////////////////////////////////
		 //氷の剣の使用制限
		 if (Turn_I > 0 ){System.out.println("冰気が散った冷たさがフィールドに広がっている。。。");}
		 if (Turn_I == 1 ){
			 System.out.println("冰気は消え去った。");
		 };
		 Turn_I--;
		 ////////////////////////////////////////////////////////////////////////////////////////
		 ////////////////////////////////////////////////////////////////////////////////////////
		 //雷の剣の使用制限
		 if (Turn_L > 0 ){
			 System.out.println("オーバーフローが治癒力を加速させる！！");
			 h1.setHp(h1.getHp() + 40);
			 System.out.println("HPが40回復した！！");
				System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");
		 }
		 if (Turn_L == 1 ){System.out.println(h1.getName()+"の帯電が解けた。");};
		 Turn_L--;
		 ////////////////////////////////////////////////////////////////////////////////////////
		 /////////////////////////////////////////////////////////////////////////////////////////
		 //普通の剣の使用制限
		 if (Turn_S > 0 ){System.out.println(h1.getName()+"の攻撃力は今も上昇している！！");}
		 if (Turn_S == 1 ){
			 h1.setPower(h1.getPower() - 20);
			 System.out.println(h1.getName()+"の攻撃力は元に戻った。。。");
		 };
		 Turn_S--;
		 ////////////////////////////////////////////////////////////////////////////////////////
		 //プレイヤーの行動選択
		 for(int i = 4;i >=4;) {
			System.out.println(h1.getName()+"はどうする");
			System.out.println("1.攻撃 2.スキル　3.アイテム ▼");
			//例外処理（InputMismatchException）
			try {
			//キーボードから数字を入力・出力
			scanner = new Scanner(System.in);
			int attackSelect = scanner.nextInt();
			i = attackSelect;
			//入力された値が指定された数字以外ならば再度入力
			if(i>=4) {System.out.println("もう一回考えよう");}
			switch(attackSelect) {

			case 1:
			//攻撃
			System.out.println("攻撃");
			System.out.println();
			h1.attack(m);
			if(m.getHp() <= 0) {
				System.out.println(m.getName() + "を倒した！");
			}
			break;

			case 2:
			//スキルの発動
			System.out.println("スキル");
			h1.We.skill(m,h1);
			break;

			case 3:
			//アイテムの使用
			System.out.println("アイテム");
			IU.itemUse(h1);
			break;

			}
			}catch(InputMismatchException e) {;
			if(i==4) {System.out.println("もう一回考えよう");}
			}
		}
		//敵のHpが0かどうかの判定
		if(m.getHp() >0) {
		//敵からの攻撃
		m.attack(h1);
		rd.readLine();
		}
		//HeroのHPが0ならばHeroのdeadメソッド呼び出し
		if(h1.getHp() <= 0){
			h1.dead();
			}
		//HeroのHP>=0ならばループ
		}while(h1.getHp() > 0 && m.getHp() > 0);
		Turn_F = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_I = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_L = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_S = -1;//敵との戦闘終了でスキルの使用制限を解除
		if(h1.getPower() != 20) {h1.setPower(20);}
		//HeroのHPが<=0ならば経験値・レベル上げを実行
		if(m.getHp() <= 0){
			//得た経験値を表示
			System.out.println(h1.getName()+"は"+m.getEx()+"経験値を得た");
			//ヒーローの経験値に倒したモンスターの経験値を追加
			h1.setExperience(h1.getExperience()+m.getEx());
			//経験値が100以上あればレベルを1上げて経験値を-100
			while(h1.getExperience() >= 100){
				h1.setExperience(h1.getExperience()-100);
				h1.setLevel(h1.getLevel()+1);
				System.out.println(h1.getName()+"はレベルが"+h1.getLevel()+"に上がった！！");
				}
			}

	}
	//Bossとのバトルメソッド
	public void battleStart(Hero h1,Boss b,BattleMain bat) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		//Heroの攻撃力にレベルを反映
				h1.setEx_po(h1.getLevel()*2);

		//ボスとの戦闘開始
		System.out.println(b.getName()+ "が出現！！");
		b.bossStart(h1);
		System.out.println(h1.getName()+"はどうする");


		do{//自分の攻撃
			rd.readLine();
			System.out.println("///////////////////////////////////////");
			System.out.println();
			/////////////////////////////////////////////////////////////////////////////////////////
			//炎の剣の使用制限
			if (Turn_F > 0 ){System.out.println(h1.getName()+"の攻撃力は上昇したままだ！！！");}
			if (Turn_F == 1 ){
				h1.setPower(h1.getPower() - 100);
				System.out.println(h1.getName()+"の攻撃力は元に戻った。。。");
				};
			 Turn_F--;
			 ////////////////////////////////////////////////////////////////////////////////////////
			 ////////////////////////////////////////////////////////////////////////////////////////
			 //氷の剣の使用制限
			 if (Turn_I > 0 ){System.out.println("冰気が散った冷たさがフィールドに広がっている。。。");}
			 if (Turn_I == 1 ){
				 System.out.println("冰気は消え去った。");
			 };
			 Turn_I--;
			 ////////////////////////////////////////////////////////////////////////////////////////
			 ////////////////////////////////////////////////////////////////////////////////////////
			 //雷の剣の使用制限
			 if (Turn_L > 0 ){
				 System.out.println("オーバーフローが治癒力を加速させる！！");
				 h1.setHp(h1.getHp() + 40);
				 System.out.println("HPが40回復した！！");
					System.out.println(h1.getName() + "の残り体力は" + h1.getHp() + "だ");
			 }
			 if (Turn_L == 1 ){System.out.println(h1.getName()+"の帯電が解けた。");};
			 Turn_L--;
			 ////////////////////////////////////////////////////////////////////////////////////////
			 /////////////////////////////////////////////////////////////////////////////////////////
			 //普通の剣の使用制限
			 if (Turn_S > 0 ){System.out.println(h1.getName()+"の攻撃力は今も上昇している！！");}
			 if (Turn_S == 1 ){
				 h1.setPower(h1.getPower() - 20);
				 System.out.println(h1.getName()+"の攻撃力は元に戻った。。。");
			 };
			 Turn_S--;
			 ////////////////////////////////////////////////////////////////////////////////////////
			 //プレイヤーの行動選択
			 for(int i = 4;i >=4;) {
			System.out.println(h1.getName()+"はどうする");
			System.out.println("1.攻撃 2.スキル　3.アイテム ▼");
			//キーボードから数字を入力・取得
			attackSelect = new java.util.Scanner(System.in).nextInt();
			i = attackSelect;
			if(i>=4) {System.out.println("もう一回考えよう");}
			if(sp==2) {
				System.out.println(h1.getName()+"は体がしびれて動けない");
				sp++;
			}else {

				switch(attackSelect) {

					case 1:
					//攻撃
						System.out.println("攻撃");
						h1.attack(b);
					break;

					case 2:
					//スキルの発動
						System.out.println("スキル");
						h1.We.skill(b,h1);
					break;

					case 3:
					//アイテムの使用
						System.out.println("アイテム");
						IU.itemUse(h1);
					break;


				}
			}
			}
			//ボスからの攻撃
			b.bossAttack(h1,bat);//ボスのアタック
			rd.readLine();
			b.bossSuper(h1);//死の呪い

			//ヒーローdeadメソッドを呼び出し
			if(h1.getHp() <= 0){
				h1.dead();
				}
		}while(h1.getHp() > 0 && b.getHp() > 0);
		Turn_F = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_I = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_L = -1;//敵との戦闘終了でスキルの使用制限を解除
		Turn_S = -1;//敵との戦闘終了でスキルの使用制限を解除
		if(h1.getPower() != 20) {h1.setPower(20);}
		}
		//ボスクラスの変数によって呼び出し
		public int getSp() {
        return this.sp;
    }
		//ボスクラスの変数によって呼び出し
    public void setSp(int sp) {
        this.sp = sp;
    }
}
