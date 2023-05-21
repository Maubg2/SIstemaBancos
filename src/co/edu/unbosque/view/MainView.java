package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class MainView {

	private JFrame frame;
	private JTextField cashierAmountField;
	private JLabel lblNewLabel;
	private JTextArea outputArea;
	private JScrollPane scrollArea;
	private JLabel lblNoCajeros;
	private JButton startSimulationButton;
	private JLabel lblNewLabel_1;
	private JLabel timeLabel;

	public MainView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Simulador banco");
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 17));
		lblNewLabel.setBounds(145, 11, 235, 27);
		frame.getContentPane().add(lblNewLabel);

		outputArea = new JTextArea();
		scrollArea = new JScrollPane(outputArea);
		outputArea.setEditable(false);
		scrollArea.setBounds(204, 49, 220, 201);
		frame.getContentPane().add(scrollArea);

		lblNoCajeros = new JLabel("No. Cajeros:");
		lblNoCajeros.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblNoCajeros.setBounds(10, 64, 110, 27);
		frame.getContentPane().add(lblNoCajeros);

		cashierAmountField = new JTextField();
		cashierAmountField.setBounds(103, 67, 86, 20);
		frame.getContentPane().add(cashierAmountField);
		cashierAmountField.setColumns(10);

		startSimulationButton = new JButton("Iniciar");
		startSimulationButton.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		startSimulationButton.setBounds(50, 113, 105, 22);
		frame.getContentPane().add(startSimulationButton);

		lblNewLabel_1 = new JLabel("Hora actual:");
		lblNewLabel_1.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 217, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);

		timeLabel = new JLabel("TIEMPO");
		timeLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		timeLabel.setBounds(103, 214, 91, 20);
		frame.getContentPane().add(timeLabel);

		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Actualizar la hora actual en la etiqueta
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				timeLabel.setText(sdf.format(new Date()));
			}
		});
		timer.start();

		frame.setVisible(true);
		frame.setBounds(new Rectangle(500, 340));
		frame.setLocationRelativeTo(null);
	}

	public void sysoToJTextArea(String text) {
		this.outputArea.append(text + "\n");
		this.outputArea.update(this.outputArea.getGraphics());
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getCashierAmountField() {
		return cashierAmountField;
	}

	public void setCashierAmountField(JTextField cashierAmountField) {
		this.cashierAmountField = cashierAmountField;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JTextArea getOutputArea() {
		return outputArea;
	}

	public void setOutputArea(JTextArea outputArea) {
		this.outputArea = outputArea;
	}

	public JLabel getLblNoCajeros() {
		return lblNoCajeros;
	}

	public void setLblNoCajeros(JLabel lblNoCajeros) {
		this.lblNoCajeros = lblNoCajeros;
	}

	public JButton getStartSimulationButton() {
		return startSimulationButton;
	}

	public void setStartSimulationButton(JButton startSimulationButton) {
		this.startSimulationButton = startSimulationButton;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getTimeLabel() {
		return timeLabel;
	}

	public void setTimeLabel(JLabel timeLabel) {
		this.timeLabel = timeLabel;
	}

}
