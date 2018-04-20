import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Mani {
	FileReader j;

	public static void main(String[] args) {
		Mani manipulator = new Mani();

		String inputted = JOptionPane.showInputDialog("Input desired quantity of knowledge to be aquired '\\('-')//' ");
		int input = Integer.parseInt(inputted);
		manipulator.getWords(input);
	}

	private void getWords(int input) {
		ArrayList<String> ja = new ArrayList<>();
		try {
			j = new FileReader("src/dictionary.txt");
			BufferedReader jae = new BufferedReader(j);
			ArrayList<String> mastermind = new ArrayList();
			String nextline = jae.readLine();
			while (nextline != null) {

				nextline = jae.readLine();
				mastermind.add(nextline);
			}
			for (int i = 0; i < input; i++) {
				String wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe = mastermind
						.get(new Random().nextInt(mastermind.size()));
				ja.add(wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe);
				System.out.println(wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
