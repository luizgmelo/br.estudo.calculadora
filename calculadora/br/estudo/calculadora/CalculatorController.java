package br.estudo.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOError;

import javax.swing.JButton;

public class CalculatorController {
	Calculator calculator;
	ButtonHandler buttonHandler;
	JButton[] buttons;

	public CalculatorController(Calculator calculator) {
		this.calculator = calculator;
		buttonHandler = new ButtonHandler();
		buttons = calculator.getJbnButtons();
		control();
	}
	
	void control() {
		for (int i = 0; i < buttons.length; i++) {
			calculator.getJbnButtons()[i].addActionListener(buttonHandler);
		}
	
	}
	
	void writeInPanel(String buttonText) {
		String textPanel = calculator.getOutputLabel().getText();
		calculator.getOutputLabel().setText(textPanel + buttonText);
	}
	
	void writeResult(String result) {
		calculator.getOutputLabel().setText(result);
	}
	
	void clearPanel() {
		calculator.getOutputLabel().setText("");
	}
	
	void calculate() {
		String[] problem = calculator.getOutputLabel().getText().split("[+]");
		int result = 0;
		for (int i = 0; i < problem.length; i++) {
			result += Float.parseFloat(problem[i]);
		}
		writeResult(String.valueOf(result));
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton[] buttons = calculator.getJbnButtons();
			
			for (int i = 0; i < 10; i++) {				
				if (e.getSource() == buttons[i]) {		
					writeInPanel(buttons[i].getText());
				}
			}
			
			// Sum +
			if (e.getSource() == buttons[23]) {
				writeInPanel(buttons[23].getText());
			}
			
			// C - clear
			if (e.getSource() == buttons[10]) {
				clearPanel();
			}
			
			// Equals =
			if (e.getSource() == buttons[20]) {
				calculate();
			}
			
		}
		
	}
	
	
}
