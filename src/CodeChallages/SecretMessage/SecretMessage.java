package CodeChallages.SecretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SecretMessage {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Java_Projects\\GAD2023\\src\\CodeChallages\\SecretMessage\\input.txt";
        String outputFilePath = "C:\\Java_Projects\\GAD2023\\src\\CodeChallages\\SecretMessage\\output.txt";

        try {
            // Read input text from input.txt file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String text = reader.readLine();
            reader.close();

            // Discover the secret message
            String secretMessage = discoverSecretMessage(text);

            // Write the secret message to output.txt file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(secretMessage);
            writer.close();

            System.out.println("Secret message discovered. Output written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static String discoverSecretMessage(String text) {
        StringBuilder secretMessage = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (c != 'X') {
                    secretMessage.append(c);
                } else {
                    secretMessage.append(" ");
                }
            }
        }

        return secretMessage.toString();
    }
}
