package p2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
	// Instance variable called wordCounter that stores the counts.
    Map<String, Integer> wordCounter = new HashMap<String, Integer> ();
    //   an instance method called count.
    public void count(String dataFile) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader(dataFile));
        String line1 = br1.readLine();
        while(line1 != null)
        {
            String temp[] = line1.split(" ");
            for(String s:temp)
            {
                if (!wordCounter.containsKey(s))
                {
                    wordCounter.put(s, 1);
                }
                else
                {
                    int count = wordCounter.get(s);
                    wordCounter.put(s, count + 1);
                }
            }
            line1 = br1.readLine();
        }

        br1.close();
    }
    // Instance method called write.
    public void write(String outputFile) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(outputFile);
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            pw.println(entry.getKey()+" : "+entry.getValue());
        }
        pw.close();
    }
}
