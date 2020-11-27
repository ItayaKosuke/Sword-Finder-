package story;

import character.Hero;

public class Welcome {

	public String U = "涼";
	public String K = "康太";


	public void welcome(Hero h1) {

	if(h1.getName().equals(U))
	{System.out.println("開発一同「ようこそU地様！！！！！」");}
	else if(h1.getName().equals(K))
	{System.out.println("開発一同「ようこそK島様！！！！！」");}
	else {}
	}
}
