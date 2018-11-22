import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {
	static ArrayList<Person> Contacts = new ArrayList<Person>();

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		while (x < y) {

			Scanner input = new Scanner(System.in);
			System.out.println("Select 1 for new contact, Select 2 to search contact list, Select 3 to edit a contact, Select 4 to delet a contact, Select 5 for Ascii order, Select 6 to exit the program");
			int selection = input.nextInt();

			if (selection == 1) {

				final Person NewContact;
				{

					Scanner insert = new Scanner(System.in);
					System.out.println("Enter The First Name");
					String fN = insert.next();
					System.out.println("Enter The middle Name");
					String mN = insert.next();
					System.out.println("Enter The Last Name");
					String lN = insert.next();
					System.out.println("Enter The House Number");
					String hN = insert.next();
					System.out.println("Enter The Street Name");
					String sN = insert.next();
					System.out.println("Enter The City Name");
					String cN = insert.next();
					System.out.println("Enter The State Name");
					String SN = insert.next();
					System.out.println("Enter The Zip Code");
					String zC = insert.next();
					System.out.println("Enter The Telephone Number");
					String tN = insert.next();

					Person newContact = new Person(fN, mN, lN, hN, sN, cN, SN, zC, tN);
					Contacts.add(newContact);

					System.out.println("Contact added");

				}
				selection = 0;
			} else if (selection == 2) {
				
				System.out.println("Select 1 for firstname serach, select 2 for lastname search, select 3 for telephonenumber search, select 4 for statename search, select 5 for full name search");
				Scanner checker = new Scanner(System.in);
				int checked = checker.nextInt();
				
				if (checked == 1) {
					
					Application.SearchFirstName();
				} else if (checked == 1) {
					
					Application.SearchLastName();
				} else if (checked == 3) {
					
					Application.SearchTelephoneNumber();
				} else if (checked == 4) {	
					
				Application.SearchStateName();
				} else if (checked == 5) {
					
				Application.SearchFullName();
				}
				selection = 0;
				
			} else if (selection == 3) {
				
				System.out.print(EditName());
				selection = 0;
				
			} else if (selection == 4) {
				
				System.out.println(Contacts.toString());
				System.out.println("Select which contact number you wish to delete (List starts from 1)");
				Scanner delete = new Scanner(System.in);
				int deleted = delete.nextInt();

				Contacts.remove(deleted);

				System.out.println("Contact deleted");

				selection = 0;
				
			} else if (selection == 5) {
				
				Collections.sort(Contacts);
				for(int i = 0; i < Contacts.size(); i++) {
					System.out.println(Contacts.get(i));
				}
				
				selection = 0;
			} else if (selection == 6) {
				x = x + 1;
			}
		}
	}
	

	
	final static void SearchFullName() {

		Scanner search = new Scanner(System.in);
		System.out.println("input your first name");
		String firstName = search.next();
		System.out.println("input your middle name");
		String middleName = search.next();
		System.out.println("input your last name");
		String lastName = search.next();

		int size = Contacts.size();

		for (int i = 0; i < size; i++){
		if(firstName.equals(Contacts.get(i).getFirstName()) || (middleName.equals(Contacts.get(i).getMiddleName())) || (lastName.equals(Contacts.get(i).getLastName()))){
				System.out.println(Contacts.get(i));
			}
		}
		
	}

	final static void SearchFirstName() {

		Scanner search = new Scanner(System.in);
		System.out.println("input your keyword");
		String keyword = search.next();
		int size = Contacts.size();

		for (int i = 0; i < size; i++) {
			if (keyword.equals(Contacts.get(i).getFirstName())) {
				System.out.println(Contacts.get(i));
			} 
		}
		


	}
	
	final static void SearchLastName() {

		Scanner search = new Scanner(System.in);
		System.out.println("input your keyword");
		String keyword = search.next();
		int size = Contacts.size();

		for (int i = 0; i < size; i++) {
			if (keyword.equals(Contacts.get(i).getLastName())) {
				System.out.println(Contacts.get(i));
			} 
		}

	}
	
	final static void SearchTelephoneNumber() {

		Scanner search = new Scanner(System.in);
		System.out.println("input your keyword");
		String keyword = search.next();
		int size = Contacts.size();

		for (int i = 0; i < size; i++) {
			if (keyword.equals(Contacts.get(i).getTelephoneNumber())) {
				System.out.println(Contacts.get(i));
			} 
		}

	}
	
	final static void SearchStateName() {

		Scanner search = new Scanner(System.in);
		System.out.println("input your keyword");
		String keyword = search.next();
		int size = Contacts.size();

		for (int i = 0; i < size; i++) {
			if (keyword.equals(Contacts.get(i).getStateName())) {
				System.out.println(Contacts.get(i));
			} 
		}

	}
	
	final static Person EditName(){
		System.out.println(String.valueOf(Contacts));
		Scanner search = new Scanner(System.in);
		
		System.out.println("Which contact would you like to change?(Starts from 1)");
		int selection = search.nextInt();
		selection = selection - 1;
		System.out.println(String.valueOf(Contacts.get(selection)));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which Value you would you like to change? 1 for firstname, 2 for middlename, 3 for lastname, 4 for housenumber ect...");
		int selected = scan.nextInt();
		
		if(selected == 1){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setFirstName(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getFirstName());
		}
		
		else if(selected == 2){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setMiddleName(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getMiddleName());
		}
		
		else if(selected == 3){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setLastName(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getLastName());
		}
		
		else if(selected == 4){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setHouseNumber(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getHouseNumber());
		}
		
		else if(selected == 5){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setStreetName(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getStreetName());
		}
		
		else if(selected == 6){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setStateName(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getStateName());
		}
		
		else if(selected == 7){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setZipCode(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getZipCode());
		}
		
		else if(selected == 8){
		System.out.println("What do you want to change it to?");
		String changed = scan.next();
		Contacts.get(selection).setTelephoneNumber(changed);
		System.out.println("The new value is: " + Contacts.get(selection).getTelephoneNumber());
		}
		
		return null;
		
	}

}
