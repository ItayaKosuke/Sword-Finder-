package main;
//NNNNN
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import action.BattleMain;
import action.Regular;
import character.Boss;
import character.Dragon;
import character.Gobrin;
import character.Hero;
import character.Slime;
import character.Unicorn;
import item.Punch;
import map.FloorMain;
import map.Separate;
import map.Stepup;
import story.Announce;
import story.EndStory;

public class Main {

	public static void main(String[] args) throws IOException{
		EndStory endS = new EndStory();
		Hero h1 = new Hero();
		Punch P = new Punch();
		h1.We = P;

		Dragon d = new Dragon();
		Unicorn u = new Unicorn();
		Gobrin g = new Gobrin();
		Slime s = new Slime();
		Boss b = new Boss();

		Announce an = new Announce();
		Regular re = new Regular();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Stepup st = new Stepup();//階段を上がる
		Separate sep = new Separate();//分岐
		FloorMain fr = new FloorMain();//フロア

		BattleMain bat = new BattleMain();

		System.out.println("「Sword Finder 〜遺失物横領罪〜」 Push Enter ");
		reader.readLine();

		//ストーリー始める
		an.announce1(h1);
		reader.readLine();
		for(int finish = 2;finish == 2;) {
			//階段のループ
			for(int posiHierarchy = 1;posiHierarchy < 5;posiHierarchy++) {
				switch(posiHierarchy) {
				//1階
				case 1:
					fr.oneFloor();
				break;
				//2階
				case 2:
				    fr.twoFloor();
				break;
				//3階
				case 3:
				    fr.threeFloor();
				break;
				//4階
				case 4:
				    fr.fourFloor();
				break;
				//5階
				case 5:
				    fr.fiveFloor();
				break;
				}
				reader.readLine();
				//床のループ
				for(int posiFloor = 1;posiFloor < 5;posiFloor++) {
					//今いる場所を表示
					System.out.println("現在地："+posiFloor+"マス目 ");
					reader.readLine();
					//クリアするまでループ
					re.regular(g,u,d,s,h1,posiHierarchy);
					reader.readLine();

					reader.readLine();
					}
				//階段が1個増えてマスが1にリセットされる
				switch(posiHierarchy) {
				//一階分岐
				case 1:
				    reader.readLine();
				    st.step(h1);
				break;
				//ニ階分岐
				case 2:
				    reader.readLine();
				    st.step(h1);
				break;
				//三階分岐
				case 3:
				    reader.readLine();
				    st.step(h1);
				break;
				//四階分岐
				case 4:
				    reader.readLine();
				    st.step(h1);
				break;
					}
				}
			//終了条件表示
			//ボス戦
			bat.battleStart(h1,b,bat);

			}
		}
	}
