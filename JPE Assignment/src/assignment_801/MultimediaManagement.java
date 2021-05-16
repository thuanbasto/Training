package assignment_801;

import java.util.ArrayList;
import java.util.List;

public class MultimediaManagement {
	public List<Multimedia> listOfMultimedia = new ArrayList<Multimedia>();

	public MultimediaManagement() {
	}
	
	public MultimediaManagement(List<Multimedia> listOfMultimedia) {
		super();
		this.listOfMultimedia = listOfMultimedia;
	}
	
	public void addMultiMedia(Multimedia multimedia) {
		listOfMultimedia.add(multimedia);
	}
	
	public void displayMultiMedia() {
		System.out.println("----- LIST OF MULTIMEDIA ------");
		for (Multimedia multimedia : listOfMultimedia) {
			System.out.println(multimedia);
		}
	}

	public List<Multimedia> getListOfMultimedia() {
		return listOfMultimedia;
	}

	public void setListOfMultimedia(List<Multimedia> listOfMultimedia) {
		this.listOfMultimedia = listOfMultimedia;
	}
	
}
