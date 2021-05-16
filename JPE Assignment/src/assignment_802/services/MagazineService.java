package assignment_802.services;

import java.util.ArrayList;
import java.util.List;

import assignment_802.entities.Magazine;
import assignment_802.entities.Publication;

public class MagazineService {
	public static void addMagazine(List<Publication> list) { 
		Magazine magazine = new Magazine();
		magazine.input();
		list.add(magazine);
	}
	
	public static void displayTop10(List<Publication> list) {
		List<Magazine> magazines = new ArrayList<Magazine>();
		System.out.println(" ------ List of magazine top 10 -------");
		for (Publication publication : list) {
			if (publication instanceof Magazine) {
				magazines.add((Magazine) publication);
			}
		}
		
		magazines.stream()
			.sorted((m1, m2) -> m1.volume - m2.volume)
			.limit(10)
			.forEach(System.out::println);
	}
}
