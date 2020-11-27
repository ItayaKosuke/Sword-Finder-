package action;//a

import java.io.IOException;

import character.Dragon;
import character.Gobrin;
import character.Hero;
import character.Slime;
import character.Unicorn;
import item.ItemMain;

public class Regular {
	Encount en = new Encount();
	ItemMain im = new ItemMain();
	public void regular(Gobrin g,Unicorn u,Dragon d,Slime s,Hero h1,int posiHierarchy) throws IOException {//regular引数
		//Heroの攻撃力のセット
		//バトル発生かアイテムを見つけるかを判定
		int random = (int)(Math.random()*4);
		//バトルとモンスター呼び出しが選ばれる比率を決定
		if(random >=1) {
			random = 1;
		}
		//バトルかアイテムのメソッドを呼び出す
		switch(random){

		case 0:
		//アイテムメソッドを呼ぶ
		im.itemCreate(h1);
		break;

		case 1:
		//バトルスタートを呼ぶ
		en.encount(g,u,d,s,h1,posiHierarchy);
		//ゲームオーバー判定
		break;
		}
	}
}
