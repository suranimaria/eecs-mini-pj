import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class BankingApp extends Frame {
	private static TextArea infoArea = new TextArea("Trading App");
	private static List<List<String>> securities = new ArrayList<>();
	private Agent agent = new Agent();
	private Panel clientButtonsPanel;

	public static void print(String text) {
		infoArea.setText(text);
	}

	public void printClients() {
		String text = "";
		Iterator<List<String>> it = securities.iterator();
		it.next();
		while (it.hasNext()){
			List<String> record = it.next();

			Iterator<String> field = record.iterator();
			while (field.hasNext()){
				String str = field.next();
				text += str + " ";
			}

			text += "\n";
		}

		print(text);
	}

	public void printClientInfo(int index) {
		String text = this.agent.getClientInfo(index);
		print(text);
	}

	public void addClient(String name) {
		this.agent.addClient(new Client(name));
		int numClients = this.agent.getNumberOfClients();
		Button btn = new Button("Client " + numClients);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String actionCommand = evt.getActionCommand();
				String indexOfClient = actionCommand.substring(7);
				int idx = Integer.parseInt(indexOfClient) - 1;
				BankingApp.this.printClientInfo(idx);
			}
		});
		this.clientButtonsPanel.add(btn);
		this.setVisible(true);
	}

	public BankingApp() {
		Color generalBackground = new Color(10, 25, 47);
		Color lighterBackground = new Color(17, 35, 64);
		Color fontColor = new Color(204, 215, 246);
		Color accentColor = new Color(100, 255, 218);

		Font f = new Font("Courier", 1, 12);

		this.setLayout(new FlowLayout());
		Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 2000);
		scrollbar.setBounds(200, 200, 500, 400);
		this.add(scrollbar);



		this.setBackground(generalBackground);
		this.setForeground(fontColor);
		this.setFont(f);

		// print clients button
		Button reportButton = new Button("Print client list");
		this.add(reportButton);

		reportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				BankingApp.this.printClients();
			}
		});


		//add client button
		Button addClientButton = new Button("Add client");
		this.add(addClientButton);

		addClientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Prompt prompt = new Prompt();
				final TextField textField = new TextField("Enter client name..", 20);

				textField.setBackground(lighterBackground);
				textField.setForeground(fontColor);

				prompt.addSubmitListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String newClient = textField.getText();
						BankingApp.this.addClient(newClient);
					}
				});

				prompt.add(textField);
				prompt.activate();
			}
		});


		// deposit button
		Button depositButton = new Button("Deposit");
		this.add(depositButton);

		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Prompt prompt = new Prompt();

				final TextField nameField = new TextField("Enter name..");
				nameField.setBackground(lighterBackground);
				nameField.setForeground(fontColor);

				final TextField amountField = new TextField("Enter amount..");
				amountField.setBackground(lighterBackground);
				amountField.setForeground(fontColor);

				prompt.addSubmitListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String clientName = nameField.getText();
						String amountEntered = amountField.getText();

						int amount = Integer.parseInt(amountEntered);
						String names = BankingApp.this.agent.getListOfClientNames();
						String[] namesList = names.split("\\R");
						boolean found = false;

						for(int i = 0; i < namesList.length; ++i) {
							if (clientName.equals(namesList[i])) {
								BankingApp.print("The transaction was a success");
								BankingApp.this.agent.deposit(namesList[i], amount);
								found = true;
							}
						}

						if (!found) {
							BankingApp.print("Transaction failed");
						}

					}
				});

				prompt.add(nameField);
				prompt.add(amountField);
				prompt.activate();
			}
		});

		// console
		infoArea.setEditable(false);
		infoArea.setBackground(lighterBackground);
		this.add(infoArea);

		// buttons panel
		this.clientButtonsPanel = new Panel();
		this.clientButtonsPanel.setLayout(new GridLayout(0, 2));
		this.clientButtonsPanel.setVisible(true);
		this.add(this.clientButtonsPanel);


		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");
		this.addClient("Maria Surani");
		this.addClient("Adrian Surani");
		this.addClient("Teodora Robertson");

		WindowCloser wc = new WindowCloser();

		this.addWindowListener(wc);
		this.setSize(500, 500);
		this.setLocationRelativeTo((Component)null);
		this.setVisible(true);
	}

	public static void main(String[] args) throws IOException {
		new BankingApp();

		String COMMA_DELIMITER = ",";
		try (BufferedReader br = new BufferedReader(new FileReader("securities.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				securities.add(Arrays.asList(values));
			}
		}
	}
}
