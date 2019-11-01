package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
	private Set<String> uniqueWords;
    //Method to take file name as input and remove the duplicate words using the Set
    public void remove(String dataFile) throws FileNotFoundException
    {
        String word;
        uniqueWords = new HashSet<String>();
        Scanner sc = new Scanner(new File(dataFile));
        while(sc.hasNext())
        {
            word = sc.next();
            uniqueWords.add(word);
        }
        sc.close();


    }

    //This method will write the contents of Set to the output file
    public void write(String outputFile) throws IOException
    {
        File f;
        FileWriter fw = null;

        f = new File(outputFile);

//If no file already exists.Create new File. If file already exists, output should be overwritten.
        f.createNewFile();
        fw = new FileWriter(f);
        Iterator itr = uniqueWords.iterator();

        while(itr.hasNext())
        {
            String str = (String)itr.next();
            fw.write(str+"\n");
        }
        fw.close();
        System.out.println("Data Written to File.");


    }
}
