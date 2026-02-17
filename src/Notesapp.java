import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Notesapp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fileName = "notes.txt";
        int choice;

        do {
            System.out.println("\n Notes App ");
            System.out.println("1. Write Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    writeNote(fileName, scan);
                    break;

                case 2:
                    readNotes(fileName);
                    break;

                case 3:
                    System.out.println(" You are exit");
                    break;

                    default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

    }

    public static void writeNote(String fileName, Scanner sc) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode
            System.out.print("Enter your note: ");
            String note = sc.nextLine();

            writer.write(note + "\n");
            writer.close();

            System.out.println("Note saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

    }
    public static void readNotes(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\n-- Your Notes --");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("No notes found or error reading file.");
        }
    }

}
