package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView mv;

	public Controller() {
		mv = new MainView();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "StartSimulation":
			break;
		}
	}

	public void setListeners() {
		mv.getStartSimulationButton().addActionListener(this);
		mv.getStartSimulationButton().setActionCommand("StartSimulation");
	}
}
