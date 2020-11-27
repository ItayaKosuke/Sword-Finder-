package story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import character.Hero;



public class Announce {

	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

	Welcome wel = new Welcome();

	public void announce1(Hero h1) throws IOException{

	System.out.println("「・・・・・・・・・・っ！！」");
	rd.readLine();
	System.out.println("「ここは・・・？」");
	rd.readLine();
	System.out.println("「俺は・・確か・・・」");
	rd.readLine();
	System.out.println("ズキィ！！！");
	rd.readLine();
	System.out.println("前頭葉だろうか、刹那の激痛が走った。");
	rd.readLine();
	System.out.println("√∆∑ç:˚∆∂©˚∫∂√˚˚å˚˙å");
	System.out.println("πµ:111110100");
	System.out.println("æ£∆¶0√:¶µ√¢§\n"
			+ "∫ƒ£∑:¶0ƒ∫0√  µ√ß√0æ√∂¬∫√ß  0∑∫$0$∫¬µ ");
	rd.readLine();
	System.out.println("理解不能な文字が視界に現れる。");
	rd.readLine();
	System.out.println("「！？・・なん・・・だ？これは、、。」");
	rd.readLine();
	System.out.println("視界に現れた不可解な文字はやがてよく知る姿へと変貌する。");
	rd.readLine();
	System.out.println("Name:xxxxxx");
	System.out.println("Hp:500");
	System.out.println("Weapon:Punch");
	System.out.println("Item:Potion  EnergyDrink  Omisosiru ");
	rd.readLine();
	System.out.println("？？？「お気づきになられましたか？？」");
	rd.readLine();
	System.out.println("？？？「私はこの塔のガイドです。」");
	rd.readLine();
	System.out.println("「ガイド・・・？」\n"+ "「塔・・・？」");
	rd.readLine();
	System.out.println("自らをガイドと名乗る猫目の少女とこの状況に疑問はあるが不信感はない・・・。");
	rd.readLine();

	System.out.println("ガイド「貴方は・・・この世界の住人ではないようですが・・？」");
	rd.readLine();
	System.out.println("そうだ、俺はこんな場所知らない、、、この世界？住人？\n"+"俺は確か・・・");
	rd.readLine();
	System.out.println("1：「堕落」の記憶　２：「目眩」の記憶　３：「痛み」の記憶 ▼");

	Scanner scanner;
	//選択肢外の数字を選択した場合ループする
	 for(int i = 4;i >=4;) {
	//String型が入力された時に例外処理
	try {
	scanner = new Scanner(System.in);
	int Select = scanner.nextInt();
	i = Select;
	if(i>=4) {System.out.println("もう一回思い出してみよう ▼");}
	switch(Select) {

	case 1:

		System.out.println("１：あのゲーム中に突然眠くなって、、、");
	break;

	case 2:
		System.out.println("２：COVID-00に疾患して、、目の前が暗くなって、、");
	break;

	case 3:
		System.out.println("３：タンスに小指ぶつけて「タンスにゴン」の由来を知った途端気を失って、、");
	break;
	}
	}catch(InputMismatchException e) {;
	if(i==4) {System.out.println("もう一回思い出してみよう ▼");}
	}
	 }

	rd.readLine();
	System.out.println("ガイド「なるほど・・・ところで、お名前は？？」");
	rd.readLine();
	System.out.println("「へ？名前？えぇと・・俺は」");
	rd.readLine();
	Scanner scanner1 = null;
	Scanner scanner2 = null;
	//選択肢2又は候補外の数字が入力された場合ループする
	for(int i = 2;i >= 2;) {
	System.out.println("名前の入力 ▼");
	scanner1 = new Scanner(System.in);
	String name = scanner1.nextLine();
	System.out.println(name+"さんですね？");
	System.out.println("1.はい 2.いいえ ▼");
	//String型が入力された時に例外処理
	try {
	scanner2 = new Scanner(System.in);
	int select = scanner2.nextInt();
	i = select;
	if(i == 2) {System.out.println("ガイド「あ、違いましたか。もう一度お願いします。」");}
	if(i != 1 && i != 2) {System.out.println("ガイド「もう一度お伺いしてもいいですか？」");}
	h1.setName(name);
	}catch(InputMismatchException e){
		System.out.println("ガイド「ん〜この世界ではその名前は使えないみたいです。」");
	}finally {;
			}
		}
	System.out.println("そうだ俺は"+h1.getName() + "だ。");
	rd.readLine();
	wel.welcome(h1);
	rd.readLine();
	System.out.println("ガイド「それでは"+h1.getName()+"さん。この世界の説明をしますね。」");
	rd.readLine();
	System.out.println("ガイドは説明を始めた。");
	rd.readLine();
	System.out.println("数回のやり取りを行い・・・");
	rd.readLine();
	System.out.println("ガイド「・・っという事で、元の世界に戻るにはこの塔の頂上を目指して下さい」");
	rd.readLine();
	System.out.println("ガイドが言うには、この塔の頂上から元の世界に戻れるらしいねん。");
	rd.readLine();
	System.out.println("・・・・・・・");
	rd.readLine();
	System.out.println("ん？どうして関西弁が出たんだ？まいいか、、。");
	rd.readLine();
	System.out.println("ガイド「最後にはスコア計算もあるので頑張ってくださいね。」");
	rd.readLine();
	System.out.println("まるでゲームじゃないか、、、けど、やるしかないか。");
	rd.readLine();
	System.out.println("行こう。");
	rd.readLine();
	System.out.println("〜こうして物語が始まった〜");
	rd.readLine();


	}
}

