package day1.Q3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		System.out.println("Enter no of Book: ");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Book Id: ");
			int id = sc.nextInt();
			System.out.println("Enter the Book Name: ");
			String name = sc.next();
			System.out.println("Enter the Book Auther: ");
			String Auther = sc.next();
			library.books.add(new Books(id,name,Auther));
		}


		
		for(Books B:library.books) {
			System.out.println(B);
		}
		
		System.out.println("Enter members Details at list 5 : ");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the Member Id: ");
			int id = sc.nextInt();
			System.out.println("Enter the Member Name: ");
			String name = sc.next();
			System.out.println("Enter the MemberdhipNO: ");
			int MemberdhipNO = sc.nextInt();
			System.out.println("Enter the membershipEnddate: ");
			String membershipEnddate = sc.next();
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate Enddate=LocalDate.parse(membershipEnddate,dtf);
			library.members.add(new Members(id,name,MemberdhipNO,Enddate));
		}
		
		for(Members M:library.members) {
			System.out.println(M);
		}
		
	}

}
