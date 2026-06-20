import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//input=orange,orange,apple,grapes,apple,orange
		//output=orange-3,apple-2,grapes-1
		//output=grapes,apple,orange
		
		String[]fruits={"orange","orange","apple","grapes","apple","orange"};
		HashMap<String,Integer>map=new HashMap();
		for(String fruit:fruits){
		    if(map.containsKey(fruit)){
		        map.put(fruit,map.getOrDefault(fruit,0)+1);
		    }
		    else{
		        map.put(fruit,1);
		    }
		}
		System.out.print(map.keySet());
		
		ArrayList<String>list=new ArrayList();
		for(String key:map.keySet()){
		    list.add(key);
		}
	System.out.print(list);
	Collections.reverse(list);
	System.out.print(list);
	}
}
