//分岐クラス

package map;

import java.util.Scanner;

public class Separate {



	public void oneF() {

		System.out.println("分かれ道があります。どちらを選びますか？");
		System.out.println("1：薄暗い道   2：細い道 ▼");
		int floorO = new Scanner (System.in).nextInt();

        switch(floorO) {
            case 1:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            case 2:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            default:
            	oneF();
        }


	}

	public void twoF() {

		System.out.println("分かれ道があります。どちらを選びますか？");
		System.out.println("1：真っ暗な道   2：広い道 ▼");

		int floorT = new Scanner (System.in).nextInt();

        switch(floorT) {
            case 1:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            case 2:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            default:
            	twoF();
        }


	}

	public void threeF() {


		System.out.println("分かれ道があります。どちらを選びますか？");
		System.out.println("1：どう見てもヤバそうな道  2：ボロボロの道 ▼");

		int floorTh = new Scanner (System.in).nextInt();

        switch(floorTh) {
            case 1:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            case 2:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            default:
            	threeF();
        }

	}

	public void fourF() {

		System.out.println("分かれ道があります。どちらを選びますか？");
		System.out.println("1：普通の道   2：絶対に行きたくない道 ”絶対に行きたくない” ▼");

		int floorF = new Scanner (System.in).nextInt();

        switch(floorF) {
            case 1:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            case 2:
            	System.out.println("〇〇に入った ▼");
            	System.out.println("");

            break;
            default:
            	fourF();
        }



	}

	public void fiveF() {


	}
}
