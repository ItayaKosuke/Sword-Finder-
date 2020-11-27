package action;

import java.io.IOException;

import character.Boss;
import character.Dragon;
import character.Gobrin;
import character.Hero;
import character.Slime;
import character.Unicorn;

public class Encount {

	BattleMain bm = new BattleMain();

	public void encount(Gobrin g,Unicorn u,Dragon d,Slime s,Hero h1,int posiHierarchy) throws IOException {
		//出現モンスターをランダムで決定
		int random = (int)(Math.random()*4);//モンスターの数4ひき
		switch(random) {
		//モブリンが出現　HPを初期化
		case 0:
			g.setHp(150);
			bm.battleStart(g,h1,posiHierarchy);
		break;
		//ディープコンパクトが出現　HPを初期化
		case 1:
			u.setHp(200);
			bm.battleStart(u,h1,posiHierarchy);
		break;
		//バハムーチョが出現　HPを初期化
		case 2:
			d.setHp(300);
			bm.battleStart(d,h1,posiHierarchy);
		break;
		//ぷよん・ジュンが出現　HPを初期化
		case 3:
			s.setHp(100);
			bm.battleStart(s,h1,posiHierarchy);
		break;
		}
	}
	//ボスと戦闘メソッド呼び出し
	public void bossEncount(Hero h1,Boss b,BattleMain bat) throws IOException {

		bm.battleStart(h1,b,bat);
	}
}
