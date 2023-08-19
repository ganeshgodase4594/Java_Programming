
/// same key vlaue then latest key consider...duplicate key not alllowed..

import java.util.*;

class HashMapDemo1{
	
	public static void main(String[] args){
	
		 HashMap hm=new HashMap();

                hm.put("ganesh","google");
                hm.put("vishal","apple");
                hm.put("ganesh","facebook");
                hm.put("dhiraj","netflix");

                System.out.println(hm);
	}
}
