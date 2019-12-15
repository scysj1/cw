package sample;
import java.util.ArrayList;
import java.io.*;
/*This method is used for output the txt file for sorted BuyOrder.
 It takes the ArrayList of Orders and output the txt file.
 */
public class writescore {
	public static void SortedFile(ArrayList<Integer> array) {
		try {
            File writeName = new File(".\\\\sample\\\\scoreboard.txt");
            writeName.createNewFile(); 
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                for(int i =0;i<array.size();i++)
                {
                	out.write(array.get(i)+",");

                }
                out.flush(); 
            }
        } catch (IOException e) {
            e.printStackTrace();

	}
}
}