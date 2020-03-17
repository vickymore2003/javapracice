package ReadnumberOccuranceofworfsfromfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Occuranceofwords {

	
	public static void main(String[] args) throws IOException {
		
		
		   HashMap<String, Integer> wordcount = new HashMap<>();

           BufferedReader reader = new BufferedReader(
                      new FileReader("C:\\Users\\jfundes\\Documents\\Document\\WordCountFile.txt"));
           String currentline = reader.readLine();

           while (currentline != null) {
                String[] words = currentline.toLowerCase().split(" ");

                for (String word : words) {
                      if (wordcount.containsKey(word)) {
                           wordcount.put(word, wordcount.get(word) + 1);
                      } else {
                           wordcount.put(word, 1);
                      }
                }
                currentline = reader.readLine();
           }

           Set<Entry<String, Integer>> data = wordcount.entrySet();
           for (Entry<String, Integer> dat : data) {
                System.out.println(dat.getKey() + " " + dat.getValue());
           }

           reader.close();

	}
	
	
}
