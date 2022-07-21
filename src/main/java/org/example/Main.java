package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String zipFileToBeCreated;
        System.out.println("Enter the path of the file: ");
        Scanner filePath = new Scanner(System.in);
        zipFileToBeCreated = filePath.nextLine();
        ZipFileCreator.jarFile(zipFileToBeCreated);
    }
}
