package ServerUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Server.ServerAppManger;
import Server.ServerConstant;

public class ServerPrimaryPanel extends JPanel {

	private JButton btnBookManager;
	private JButton btnUserManager;
	private ServerBookPanel bookPanel;
	private ServerUserPanel userPanel;
	private JPanel mid;
	private CardLayout cardLayout;

	public ServerPrimaryPanel() {
		setPreferredSize(new Dimension(800, 600));
		ServerAppManger.getS_instance().setsPrimPanel(this);
		setLayout(null);
		setUI();
	}

	private void CreateComponent() {
		btnBookManager = new JButton(ServerConstant.BOOK);
		btnUserManager = new JButton(ServerConstant.USER);
		bookPanel = new ServerBookPanel();
		userPanel = new ServerUserPanel();
		mid = new JPanel();
		cardLayout = new CardLayout();
	}

	private void AddComponent() {
		add(btnBookManager);
		add(btnUserManager);
		add(mid);

	}

	private void setUI() {
		CreateComponent();

		btnBookManager.setBounds(400, 20, 150, 60);
		btnUserManager.setBounds(600, 20, 150, 60);
		mid.setBounds(20, 100, 760, 480);
		mid.setLayout(cardLayout);
		mid.add(bookPanel, "book");
		mid.add(userPanel, "user");
		cardLayout.show(mid, "book");
		AddComponent();
	}

	public void AddEvent(ActionListener act) {
		btnBookManager.addActionListener(act);
		btnUserManager.addActionListener(act);
		bookPanel.AddEvent(act);
		userPanel.AddEvent(act);
	}

	public void showBook() {
		cardLayout.show(mid, "book");
	}

	public void showUser() {
		cardLayout.show(mid, "user");
	}

	public JButton getBtnBookManager() {
		return btnBookManager;
	}

	public void setBtnBookManager(JButton btnBookManager) {
		this.btnBookManager = btnBookManager;
	}

	public JButton getBtnUserManager() {
		return btnUserManager;
	}

	public void setBtnUserManager(JButton btnUserManager) {
		this.btnUserManager = btnUserManager;
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

}
