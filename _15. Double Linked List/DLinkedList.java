import java.util.LinkedList;
import java.util.Scanner;


public class DLinkedList {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<Integer>();

		int choice;

		do {

			System.out.println("\n\n\nDoubly LinkedList Operations\n");
			System.out.println(
					"1. Add Data to First Position\n2. Add Data to Last Position\n3. Add Data to Particular Position\n4. Delete Data to First Position\n5. Delete Data to Last Position\n6. Delete Data at Particular Position\n7. Display List\n8. Exit");


			System.out.print("\nEnter Choice: ");
			choice = scan.nextInt();

			switch (choice) {

				case 1:
					System.out.print("Enter data: ");
					int data = scan.nextInt();
					list.addFirst(data);
					System.out.print(list);
					break;

				case 2:
					System.out.print("Enter data: ");
					int data1 = scan.nextInt();
					list.addLast(data1);
					System.out.print(list);
					break;

				case 3:
					System.out.print("Enter data: ");
					int dat = scan.nextInt();
					System.out.print("Enter position: ");
					int index = scan.nextInt();
					list.add(index-1, dat);
					System.out.print(list);
					break;

				case 4:
					list.removeFirst();
					System.out.print(list);
					break;

				case 5:
					list.removeLast();
					System.out.print(list);
					break;

				case 6:
					System.out.print("Enter position: ");
					int index1 = scan.nextInt();
					list.remove(index1-1);
					System.out.print(list);
					break;

				case 7:
					System.out.print(list);
					break;

				case 8:
					break;

				default:
					System.out.println("Invalid Number");
			}
		} while (choice != 8);
		
		scan.close();
	}
}
