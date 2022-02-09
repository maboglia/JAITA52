package view;

import java.util.ArrayList;
import java.util.List;

public class ProvaFunzioni {

	public static void main(String[] args) {
		
		List<String> nani = new ArrayList<String>();
		
		
		nani.add("gongolo");
		nani.add("mammolo");
		nani.add("eolo");
		nani.add("pisolo");
		nani.add("cucciolo");
		nani.add("dotto");
		nani.add("brontolo");
		
		
		nani
			.stream()
			.filter(n -> n.endsWith("olo"))
			.filter(n -> n.length() > 4)
			.sorted()
			.forEach(n -> System.out.println(n));//operazione terminale
		

	}

}
