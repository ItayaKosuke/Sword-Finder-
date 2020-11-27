//階段を上がるクラス by 荒金栄治

package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import character.Hero;

public class Stepup {

	public void step(Hero h1) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("階段についた");
		rd.readLine();
		System.out.println(h1.getName()+"は階段を登った");
		rd.readLine();
		System.out.println("........");
		rd.readLine();




	}


}
