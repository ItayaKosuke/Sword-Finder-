//ボスを倒した後のストーリクラス by荒金栄治

package story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import character.Hero;

public class EndStory {

	BufferedReader readerE = new BufferedReader(new InputStreamReader(System.in));

	public void announceEnd(Hero h1) throws IOException {

	    System.out.println("「はぁ、、、っはぁ、、、っく、、、」");
	    readerE.readLine();
	    System.out.println("「やっと終わったか、、、」");
	    readerE.readLine();
	    System.out.println("ガイド「無事勝ったようですね、、、よかったです、、本当に。」");
	    readerE.readLine();
	    System.out.println("「あぁ、、ガイド、いたのか。終わったぞ、、、」");
	    readerE.readLine();
	    System.out.println("「さあ、戻してくれ、、！！」");
	    readerE.readLine();
	    System.out.println("ガイド「・・・・ふふ。」");
	    readerE.readLine();
	    System.out.println("！？　ガイドの様子がおかしい。");
	    readerE.readLine();
	    System.out.println("ガイド「あ”ー疲れた！！！！やーっと終わったよ〜」");
	    readerE.readLine();
	    System.out.println("「ん？　あぁそうだ、やっと倒したぞ、、！！！」");
	    readerE.readLine();
	    System.out.println("ガイド「うんうん、これでやーっと自分の世界に戻れるよ〜」");
	    readerE.readLine();
	    System.out.println("「それは、、どういう、、、？？」");
	    readerE.readLine();
	    System.out.println("ガイド「あ、ごめんね。実は魔王を倒して頂上に一緒に来ることが、」");
	    readerE.readLine();
	    System.out.println("ガイド「私が元の世界に戻るための方法なの！！」");
	    readerE.readLine();
	    System.out.println("ガイド「ちなみに！このルールは"+h1.getName()+"さんも一緒だよ！！」");
	    readerE.readLine();
	    System.out.println("「え、、？  えええええぇぇぇぇぇええええ！！！！！？？」");
	    readerE.readLine();
	    System.out.println("ガイド「では！改めましてガイド"+h1.getName()+"さん！！頑張ってね〜！」");
	    readerE.readLine();
	    readerE.readLine();
	    readerE.readLine();
	    System.out.println("Game Clear！！！！！！");

	    readerE.readLine();
	}
	    public void score(Hero h1) throws IOException {
	    System.out.println("スコア");
	    System.out.println("ゲームクリア:10000p");
	    System.out.println("ゲームオーバー回数:"+h1.getReStart()+"回:"+h1.getReStart()+"*(-100)="+h1.getReStart()*(-100)+"p");
	    System.out.println("Lv:"+h1.getLevel());
	    System.out.println("Hp:"+h1.getHp());
	    System.out.println("所持武器:"+h1.We.getName());
	    System.out.println("「ラベルのないポーション」使用回数"+item.ItemUse.Use_Po+"回:"+item.ItemUse.Use_Po+"*(-50)="+item.ItemUse.Use_Po*(-50)+"p");
	    System.out.println("「よくわからない液体」使用回数"+item.ItemUse.Use_Dri+"回:"+item.ItemUse.Use_Dri+"*(-30)="+item.ItemUse.Use_Dri*(-30)+"p");
	    System.out.println("「お味噌汁」使用回数"+item.ItemUse.Use_Omi+"回:"+item.ItemUse.Use_Omi+"*(-100)="+item.ItemUse.Use_Omi*(-100)+"p");
	    int Po_p = (item.ItemUse.Use_Po*(-50));
	    int Dri_p = (item.ItemUse.Use_Dri*(-30));
	    int Omi_p = (item.ItemUse.Use_Omi*(-100));
	    int Over = h1.getReStart()*(-100);
	    int total = (10000 + Po_p + Dri_p + Omi_p + Over);
	    System.out.println("トータルスコア:"+total+"p");

	    if(total > 9500) {System.out.println("よくできました");}
	    else if(total > 9000) {System.out.println("そこそこよくできました");}
	    else if(total > 8500) {System.out.println("もう少し頑張りましょう");}
	    else {System.out.println("運が悪かったのね、、、、");}
	    }



	public void stuffRoll(){

		System.out.println("");
		System.out.println("");
		System.out.println("Created By 96PJ");
	    System.out.println("");
	    System.out.println("Eiji Aragane");
	    System.out.println("Kousuke Itaya");
	    System.out.println("Takaki Nakagawa");
	    System.out.println("Yuki Moriya");
	    System.out.println("");
	    System.out.println("Thank you for Playing");

	}
}
