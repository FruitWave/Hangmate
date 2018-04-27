import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mani implements KeyListener {
	FileReader j;
	static ArrayList<String> bob;
	JFrame jfr;
	JPanel jpnl;
	JLabel jlbl;
	static int puzzlesLeft;
	static String currentPuzz;

	public static void main(String[] args) {
		Mani manipulator = new Mani();

		String inputted = JOptionPane.showInputDialog("Input desired quantity of knowledge to be aquired '\\('-')//' ");
		int input = Integer.parseInt(inputted);
		puzzlesLeft = input;
		bob = manipulator.getWords(input);
		manipulator.setUI();
	}

	private ArrayList<String> getWords(int input) {
		ArrayList<String> ja = new ArrayList<>();
		ArrayList<String> mastermind = new ArrayList<>();
		try {
			j = new FileReader("src/dictionary.txt");
			BufferedReader jae = new BufferedReader(j);
			String nextline = jae.readLine();
			while (nextline != null) {
				nextline = jae.readLine();
				ja.add(nextline);
			}
			for (int i = 0; i < input; i++) {
				String wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe = ja
						.get(new Random().nextInt(ja.size()));
				mastermind.add(wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe);
				// System.out.println(wyaywdilawuefhkdshucvltafvyamhsduidfihuagwsdhifadsyhvnzsdcxxyioe);
			}
			for (String string : mastermind) {
				System.out.println(string);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mastermind;
	}

	private void setUI() {
		jfr = new JFrame("Hey There! Thanks For Taking A Look!");
		jpnl = new JPanel();
		jlbl = new JLabel();
		String ya = new String();

		if (puzzlesLeft > 0) {
			currentPuzz = bob.get(0);
			bob.remove(0);
		}
		for (int i = 0; i < currentPuzz.length(); i++) {
			// jpnl.add(new JLabel("_"));
			ya += "_";
		}
		jlbl.setText(ya);
		jpnl.add(jlbl);
		jfr.add(jpnl);
		jfr.pack();
		jfr.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		for (int i = 0; i < currentPuzz.length(); i++) {
			if (currentPuzz.charAt(i) == e.getKeyChar()) {
				// replace "_" with that letter
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
