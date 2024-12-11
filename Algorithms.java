import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int two = two();
        int temp = temp();
        System.out.println(two);
        System.out.println(temp);
        s.close();}

 public static int two() throws FileNotFoundException{
        s = new Scanner(f);
        int two = 0;
        int temp = 0;
        while (s.hasNext()) {
             temp = s.next();
            if(temp.length == 2){
                two ++;
            }
            return two;}}}
                