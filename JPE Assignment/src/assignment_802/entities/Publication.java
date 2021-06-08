package assignment_802.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import assignment_802.utils.Validator;

public abstract class Publication {
	public int publicationYear;
	public String publisher;
	public Date publicationDate;
	
	public abstract void a();
	
	public Publication() {
	}
	
	public Publication(int publicationYear, String publisher, Date publicationDate) {
		super();
		this.publicationYear = publicationYear;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Year:" + publicationYear + "\t Publisher: " + publisher + "\t Date" + dateFormat.format(publicationDate);
	}
	
	@SuppressWarnings({ "resource", "deprecation" })
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (publicationYear == 0) {
					System.out.print("Enter publication year: ");
					this.publicationYear = Integer.valueOf(scanner.nextLine());
				}
				if (publisher == null) {
					System.out.print("Enter publisher: ");
					this.publisher = scanner.nextLine();
				}
				if (publicationDate == null) {
					System.out.print("Enter date (dd/MM/yyyy): ");
					String date = scanner.nextLine();
					if (Validator.isDate(date)) 
						this.publicationDate = new Date(date);
					else
						throw new Exception("Date is incorret. Try again");
				}

				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public abstract void display();

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	
}
