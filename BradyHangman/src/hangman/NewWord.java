package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewWord {

	public ArrayList<String> allWords = new ArrayList<String>();
	public ArrayList<Character> allChars = new ArrayList<Character>();
	public String word;
	public String wordFile = "words.txt";

	public NewWord() throws FileNotFoundException {
		getNewWord();

	}

	public NewWord(int age) throws FileNotFoundException {

		getWordListFileName(age);
		getNewWord();
	}

	public void getNewWord() throws FileNotFoundException {

		Scanner input = new Scanner(new File(wordFile));
		while (input.hasNext()) {
			allWords.add(input.next());
		}
		input.close();
		newWord();

		getCharList();

	}

	public String newWord() {

		word = allWords.get((int) (Math.random() * allWords.size()));
		return word;
	}

	public ArrayList<Character> getCharList() {

		allChars.clear();
		for (int i = 0; i < word.length(); i++) {

			allChars.add(word.charAt(i));
		}

		return allChars;
	}

	public void getWordListFileName(int age) {

		if (age > 14 && age < 22)
			wordFile = "swearWords.txt";

	}
}