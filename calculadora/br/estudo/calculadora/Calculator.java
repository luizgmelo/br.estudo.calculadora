package br.estudo.calculadora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	JLabel outputLabel;
	JLabel resultLabel;
	JPanel buttonsPanel;
	JButton[] jbnButtons;
	
	public Calculator() {
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	
		outputLabel = new JLabel();
		outputLabel.setText("");
		outputLabel.setFont(new Font("Arial", Font.BOLD, 18));
		
		buttonsPanel = new JPanel();
		buttonsPanel.setSize(200, 200);
		buttonsPanel.setLayout(new GridLayout(5, 5));	
		jbnButtons = new JButton[25];
		
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
		jbnButtons[24] = new JButton("<-");
		
		// C, (, ), mod, <-
		for (int i = 10; i <= 13; i++) {
			buttonsPanel.add(jbnButtons[i]);
		}
		
		buttonsPanel.add(jbnButtons[24]); // <-
		
		// 7, 8, 9, /, sqrt
		for (int i = 7; i <= 9; i++) {
			buttonsPanel.add(jbnButtons[i]);
		}
		
		buttonsPanel.add(jbnButtons[15]);
		buttonsPanel.add(jbnButtons[16]);
		
		// 4, 5, 6, x, x^2
		for (int i = 4; i <= 6; i++) {
			buttonsPanel.add(jbnButtons[i]);
		}
		
		buttonsPanel.add(jbnButtons[17]);
		buttonsPanel.add(jbnButtons[18]);
				
		// 1, 2, 3, -, =
		for (int i = 1; i <=3; i++) {
			buttonsPanel.add(jbnButtons[i]);
		}
		
		buttonsPanel.add(jbnButtons[19]);
		buttonsPanel.add(jbnButtons[20]);
		
		// 0, ., %, +, =, PI
		
		buttonsPanel.add(jbnButtons[0]);
		buttonsPanel.add(jbnButtons[21]);
		buttonsPanel.add(jbnButtons[22]);
		buttonsPanel.add(jbnButtons[23]);
		buttonsPanel.add(jbnButtons[14]);
		
		add(outputLabel, BorderLayout.LINE_END);
		add(buttonsPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CalculatorController(new Calculator());
	}

	public JButton[] getJbnButtons() {
		return jbnButtons;
	}

	public JLabel getOutputLabel() {
		return outputLabel;
	}
	
	
}
