import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws FileNotFoundException {
        //Lecture de fichier
        File file = new File("file.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner input = null;
        while (input.hasNextLine()) {
            String line = input.nextLine();
// Utilisez cette ligne pour effectuer des calculs, des traitements,
        }

    }

}
