package sample;


import java.io.*;
import java.util.*;
/* 
This method is almost like the ReadFile class.initialize() but this method is used for New Order
*/
public class readscore {
	public static ArrayList<Integer> Insert() {
		String pathname = new String();
		pathname = ".\\sample\\scoreboard.txt";
		
        int line;
        ArrayList<Integer> list = new ArrayList<Integer>();

        int score=0;
        //int index = 0;
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象
        ) {

            while ((line = br.read()) != -1) {
               
            	if (line> 47 && line < 58) {
            		
            		score = score*10 + (line-48);
            		while((line = br.read()) > 47 && line < 58) {
            			score = score*10 + (line-48);
            			
            		}
            	}
            	list.add(score);
            	score = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
		}
	}