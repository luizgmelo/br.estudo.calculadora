package br.estudo.calculadora;

import java.awt.GridLayout;
import java.nio.channels.NonWritableChannelException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	JLabel outputLabel;
	
	
	JPanel buttonsPanel;
	JButton[] jbnButtons;
	
	public Calculator() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		setLayout(new GridLayout(3, 3));
	
		outputLabel = new JLabel();
		outputLabel.setText("Output here");
		
		
		buttonsPanel = new JPanel();
		buttonsPanel.setSize(200, 200);
		buttonsPanel.setLayout(new GridLayout(5, 5));
		jbnButtons = new JButton[24];
		
		// cria os botões de 0 a 9
		for (int i = 0; i <= 9; i++) {
			jbnButtons[i] = new JButton(String.valueOf(i));
		}
		
		// C, (, ), mod, PI
		jbnButtons[10] = new JButton("C");
		jbnButtons[11] = new JButton("(");
		jbnButtons[12] = new JButton(")");
		jbnButtons[13] = new JButton("mod");
		jbnButtons[14] = new JButton("PI");
	
		// /, sqrt, x, x²
		jbnButtons[15] = new JButton("/");
		jbnButtons[16] = new JButton("sqrt");
		jbnButtons[17] = new JButton("x");
		jbnButtons[18] = new JButton("x^2");	
	
		// -, =
		jbnButtons[19] = new JButton("-");
		jbnButtons[20] = new JButton("=");
		// ., %, +
		jbnButtons[21] = new JButton(".");
		jbnButtons[22] = new JButton("%");
		jbnButtons[23] = new JButton("+");
		
		
		for (int i = 10; i <= 14; i++) {
			buttonsPanel.add(jbnButtons[i]);
		}
				
		
		add(outputLabel);
		add(buttonsPanel);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
