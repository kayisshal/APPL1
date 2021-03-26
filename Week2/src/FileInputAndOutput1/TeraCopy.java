/*
 * Nama : Kayis Shalahuddin
 * NIM : 191524047
 * Pertemuan : Week-2
 */
package FileInputAndOutput1;

/**
 *
 * @author Kayis
 */
import java.util.Scanner;
import java.io.*;

public class TeraCopy {
    public static void main(String[] args) {
        Scanner fileName = new Scanner(System.in);
        Scanner input = null;
        boolean found = false;
        File file;
        
        while(!found){
            System.out.println("Enter the file name");
            file = new File("src/FileInputAndOutput1/" + fileName.nextLine());
            
            try{
                input = new Scanner(file);
                found = true;
            }catch(FileNotFoundException fileNotFound){
                System.out.println("File not found! \n" + fileNotFound);
            }
        }

        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
    }
}
