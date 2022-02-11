package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProvaCanzoni {

	public static void main(String[] args) throws IOException {
		String[][] canzoniArray = {
				{"Brividi", "Mahmood e Blanco"},
				{"0 passi", "Deddy"},
				{"A un passo dalla luna", "Rocco Hunt & Ana Mena"},
				{"Afterglow", "Ed Sheeran"},
				{"Baby", "Sfera Ebbasta & J Balvin"},
		};
		
		Arrays
			.stream(canzoniArray)
			.filter(c -> c[0].startsWith("A"))
			.forEach(c -> System.out.println(c[0]));
		
		
//		IntStream
//			.range(10, 20)
//			.filter(i -> i%2==0)
//			.forEach(i->System.out.println(i));
		
//		IntStream
//			.range(1, 91)
//			.skip(10)
//			.filter(i -> i%2==0)
//			.filter(i -> i%3==0)
//			.filter(i -> i%6==0)
//			.forEach(System.out::println);

		Arrays
			.stream(new int[]{12,15,18,30,24,15,12,28,24})
			.filter(v -> v >=18)
			.average()
			.ifPresent(System.out::println);
		
		IntSummaryStatistics summaryStatistics = Arrays
		.stream(new int[]{12,15,18,30,24,15,12,28,24})
		.summaryStatistics();
		
		System.out.println(summaryStatistics);
		
		Stream<String> canzoni = Files.lines(Paths.get("files/canzoni.txt"));
		//canzoni.forEach(System.out::println);
		
		//List<String> stringhe = canzoni.collect(Collectors.toList());
		
		//List<String> stringheBis = canzoni.map(c->c.substring(0, 2)).collect(Collectors.toList());
		
		IntStream.range(0, 100).map(i -> i *2).forEach(System.out::println);
		
		
		
		
	}

}
