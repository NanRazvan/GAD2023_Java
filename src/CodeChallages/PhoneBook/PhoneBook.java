package CodeChallages.PhoneBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        File file = new File("C:\\Java_Projects\\GAD2023\\src\\CodeChallages\\PhoneBook\\input");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] words = line.split(" ");
                if(words[0].equals("Abbey") || words[0].equals("Abdul"))
                    System.out.print(words[1] + ", ");

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("NU MERGE");
        }
    }

}