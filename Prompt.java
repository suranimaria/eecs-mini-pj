//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.event.*;

public class Prompt extends Frame {
	private Button submit;

	public Prompt() {
		this.setLayout(new GridLayout(0, 3));
		this.submit = new Button("Submit");
		this.submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prompt.this.dispose();
			}
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				((Frame)evt.getSource()).dispose();
			}
		});
	}

	public void addSubmitListener(ActionListener listener) {
		this.submit.addActionListener(listener);
	}

	public void activate() {
		Color lighterBackground = new Color(17, 35, 64);
		Color fontColor = new Color(204, 215, 246);

		this.add(this.submit);
		this.pack();
		this.setLocationRelativeTo((Component)null);
		this.setVisible(true);

		this.setBackground(lighterBackground);
		this.setForeground(fontColor);
	}
}
