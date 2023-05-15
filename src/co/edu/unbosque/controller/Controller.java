package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Bank;
import co.edu.unbosque.model.Cola;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView mv;
	private Cola cola;
	private Bank bank;

	public Controller() {
		mv = new MainView();
		cola = new Cola();
		bank = new Bank();
		setListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "StartSimulation":
			
			String numATM = mv.getCashierAmountField().getText();
			
			if(numATM.matches("[1-5]{1}")) {
				for(int i = 1; i <= Integer.parseInt(numATM); i++) {
					bank.startATM((int)(Math.random() * (10 - 3)) + 3, i);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 5");
			}											
			
			break;
		}
	}

	public void setListeners() {
		mv.getStartSimulationButton().addActionListener(this);
		mv.getStartSimulationButton().setActionCommand("StartSimulation");
	}
	
}
