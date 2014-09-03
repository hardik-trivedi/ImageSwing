package com.imageswing;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageResizer extends JFrame {
	private final int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 200;

	public static void main(String args[]) {
		new ImageResizer();
	}

	public ImageResizer() {
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		add(getWelcomeLabel());
		add(getWelcomeLabel());
		// add(getResizeOptions());
		setTitle(Message.APP_NAME);
		setVisible(true);
	}

	private JLabel getWelcomeLabel() {
		JLabel lblWelcome = new JLabel(Message.WELCOME);
		lblWelcome.setHorizontalAlignment(JLabel.CENTER);
		lblWelcome.setVerticalAlignment(JLabel.TOP);
		return lblWelcome;
	}

	private JPanel getResizeOptions() {
		JPanel optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(0, 5));

		JCheckBox chkLdpi = new JCheckBox(Message.LDPI);
		chkLdpi.setSelected(true);

		JCheckBox chkMdpi = new JCheckBox(Message.MDPI);
		chkMdpi.setSelected(true);

		JCheckBox chkHdpi = new JCheckBox(Message.HDPI);
		chkHdpi.setSelected(true);

		JCheckBox chkXhdpi = new JCheckBox(Message.XHDPI);
		chkXhdpi.setSelected(true);

		JCheckBox chkXxhdpi = new JCheckBox(Message.XXHDPI);
		chkXxhdpi.setSelected(true);

		optionsPanel.add(chkLdpi);
		optionsPanel.add(chkMdpi);
		optionsPanel.add(chkHdpi);
		optionsPanel.add(chkXhdpi);
		optionsPanel.add(chkXxhdpi);

		return optionsPanel;
	}
}
