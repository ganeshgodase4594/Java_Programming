// add data/collection using userdefined set..

import java.util.*;

class CricPlayer{

//	HashSet hs=new HashSet();

	int JerNo=0;
	String PName=null;
	
	CricPlayer(int JerNo,String PName){
		
		this.JerNo=JerNo;
		this.PName=PName;
	}

	public String toString(){
		
		return JerNo + " " +PName;
	}
}

class HashSetDemo{
	
	public static void main(String[] args){
		
		LinkedHashSet hs=new LinkedHashSet();

		hs.add(new CricPlayer(18,"virat"));

		hs.add(new CricPlayer(7,"dhoni"));

		hs.add(new CricPlayer(45,"rohit"));

		hs.add(new CricPlayer(18,"virat"));

		System.out.println(hs);
	}
}
