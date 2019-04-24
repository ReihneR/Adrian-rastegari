import java.util.ArrayList;
import java.util.Scanner;

public class SecurityDoor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> inBuilding = new ArrayList<String>();
		ArrayList<String> log = new ArrayList<String>();
		int times = input.nextInt();

		for (int i = 0; i <= times; i++) {
			String choice = input.nextLine();
			if (choice.contains("entry")) {
				String name = choice.substring(6, (choice.length()));
				if (inBuilding.contains(name)) {
					log.add(name + " entered (ANOMALY)");
				} else {
					inBuilding.add(name);
					log.add(name + " entered");
				}
			}
			if (choice.contains("exit")) {
				String name = choice.substring(5, (choice.length()));
				if (inBuilding.contains(name)) {
					inBuilding.remove(name);
					log.add(name + " exited");
				} else {
					log.add(name + " exited (ANOMALY)");
				}
			}
		}
		for (String bc : log) {
			System.out.println(bc);
		}
	}
}