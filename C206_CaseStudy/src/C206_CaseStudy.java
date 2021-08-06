import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_OUT = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<Account> accounts = new ArrayList<Account>();

		accounts.add(new Account("Jane123x", "12345", "Parent"));
		accounts.add(new Account("xxRoxy23", "45678", "Student"));
		accounts.add(new Account("Regina34", "67805", "Parent"));
		accounts.add(new Account("Bob89", "90234", "Student"));
		
		menuList.add(new Menu("Western", "Carbonara", "Fruit punch", "Watermelon Slice"));
		menuList.add(new Menu("Asian", "Chicken Rice", "Milo", "Pear Slice"));
		menuList.add(new Menu("Vegeterian", "Vegeterian Bee Hoon", " Apple Juice", "Banana"));
		

		int option = 0;

		while (option != OPTION_OUT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.setHeader("Select option to view");
				System.out.println("1. View user account for Parents/Secondary school students");
				System.out.println("2. View menu items");
				System.out.println("3. View monthly menu");
				System.out.println("4. View lunch box menu");
				System.out.println("5. View brder bill");

				int view = Helper.readInt("Enter option to view selected item > ");
				if (view == 1) {
					viewAccount(accounts);

				}

			} else if (option == 2) {
				C206_CaseStudy.setHeader("Select option to view");
				System.out.println("1. Add user account for Parents/Secondary school students");
				System.out.println("2. Add menu items");
				System.out.println("3. Add monthly menu");
				System.out.println("4. Add lunch box menu");
				System.out.println("5. Add brder bill");

				int add = Helper.readInt("Enter option to view selected item > ");
				if (add == 1) {
					addAccount(accounts);
				} else if (add == 2) {

				} else if (add == 3) {

				} else if (add == 4) {

				} else if (add == 5) {

				}

			} else if (option == 2) {
				C206_CaseStudy.setHeader("Select option to view");
				System.out.println("1. Delete user account for Parents/Secondary school students");
				System.out.println("2. Delete menu items");
				System.out.println("3. Delete monthly menu");
				System.out.println("4. Delete lunch box menu");
				System.out.println("5. Delete brder bill");

				int delete = Helper.readInt("Enter option to view selected item > ");

			}

		}

	}

	public static void menu() {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("Lunch Box Order");
		System.out.println("1. View Inventory");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Quit");

		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void addAccount(ArrayList<Account> accounts) {
		String user = Helper.readString("Are you a student/ parent > ");
		String username = Helper.readString("Enter username: ");
		String password = Helper.readString("Enter password: ");

		Account newAcct = new Account(username, password, user);
		accounts.add(newAcct);
	}

	public static void viewAccount(ArrayList<Account> accounts) {
		String view = String.format("%-10s %-10s %s\n", "Username", "Password", "User");
		Helper.line(60, "-");
		for (Account a : accounts) {
			view += String.format("%-10s %-10s %s\n", a.getUsername(), a.getPassword(), a.getUser());
		}
		System.out.println(view);
	}

}
