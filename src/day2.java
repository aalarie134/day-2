import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {

    public static void main(String args[]) throws FileNotFoundException {
        int answer;
        mover submarine = new mover();
        File file  = new File("input.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()) {
            String direction = scan.next();
            String way2 = scan.next();
            int distance = Integer.parseInt(way2);
            submarine.move(direction, distance);

            System.out.println("direction " + direction);
            System.out.println("distance "+ distance);
            System.out.println(scan.hasNext());
        }

        System.out.println(submarine.getDepth()*submarine.getHorizontal());
    }
}
