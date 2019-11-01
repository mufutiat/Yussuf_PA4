package p2;

import java.io.IOException;

public class Application {

	public static void main(String[] args)throws IOException {

		//main method which illustrates the use of DuplicateCounter.
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count("problem2.txt");
        duplicateCounter.write("unique_word_counts.txt");
        System.out.println("Duplicate Counter Operation completed.");
    }

}


