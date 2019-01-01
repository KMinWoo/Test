package ServerUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import DataStructure.UserData;
import Server.ServerAppManger;
import Server.ServerConstant;

public class ServerUserPanel extends JPanel {
	private JComboBox<String> combox;
	private JLabel labUserID;
	private JLabel labUserPassword;
	private JLabel labUserName;
	private JTextField txtSearchInfo;
	private JTextField txtUserID;
	private JTextField txtUserPassword;
	private JTextField txtUserName;
	private JButton btnSearch;
	private JButton btnInsert;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JTable tableBook;
	private DefaultTableModel model;
	private JScrollPane scroll;

	public ServerUserPanel() {
		ServerAppManger.getS_instance().setsUserPanel(this);
		setLayout(null);
		SetUI();
	}

	private void CreateComponent() {
		combox = new JComboBox(ServerConstant.USER_COMBO);
		labUserID = new JLabel(ServerConstant.USER_INFO[0]);
		labUserPassword = new JLabel(ServerConstant.USER_INFO[1]);
		labUserName = new JLabel(ServerConstant.USER_INFO[2]);
		txtSearchInfo = new JTextField();
		txtUserID = new JTextField();
		txtUserPassword = new JTextField();
		txtUserName = new JTextField();
		btnSearch = new JButton(ServerConstant.SERACH);
		btnInsert = new JButton(ServerConstant.INSERT);
		btnUpdate = new JButton(ServerConstant.UPDATE);
		btnDelete = new JButton(ServerConstant.DELETE);
		Object d[][] = { { "casda", "asda", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "b", "b", "b", "b" },
				{ "b", "b", "b", "b" } };
		model = new DefaultTableModel(d, ServerConstant.USER_INFO);
		tableBook = new JTable(model);
		scroll = new JScrollPane(tableBook);

	}

	private void AddComponent() {
		add(combox);
		add(labUserID);
		add(labUserPassword);
		add(labUserName);
		add(txtSearchInfo);
		add(txtUserID);
		add(txtUserPassword);
		add(txtUserName);
		add(btnSearch);
		add(btnInsert);
		add(btnUpdate);
		add(btnDelete);
		add(scroll);
	}

	private void SetUI() {
		CreateComponent();
		combox.setBounds(20, 20, 150, 50);
		txtSearchInfo.setBounds(180, 20, 180, 50);
		btnSearch.setBounds(380, 20, 80, 50);// 480~760

		labUserID.setBounds(480, 90, 100, 70);
		txtUserID.setBounds(600, 90, 150, 70);

		labUserPassword.setBounds(480, 180, 100, 70);
		txtUserPassword.setBounds(600, 180, 150, 70);

		labUserName.setBounds(480, 270, 100, 70);
		txtUserName.setBounds(600, 270, 150, 70);

		btnInsert.setBounds(480, 350, 70, 70);
		btnUpdate.setBounds(570, 350, 70, 70);
		btnDelete.setBounds(660, 350, 70, 70);

		scroll.setBounds(20, 90, 440, 370);

		AddComponent();
	}

	public void AddEvent(ActionListener act) {
		combox.addActionListener(act);
		btnSearch.addActionListener(act);
		btnInsert.addActionListener(act);
		btnUpdate.addActionListener(act);
		btnDelete.addActionListener(act);
	}

	public UserData getUserInfo() {
		return new UserData(txtUserID.getText(), txtUserPassword.getText(), txtUserName.getText());
	}

	public void setUserData(UserData d) {

	}

	public void setUserID(String s) {
		txtUserID.setText(s);
	}

	public void setPassWord(String s) {
		txtUserPassword.setText(s);
	}

	public void setUserName(String s) {
		txtUserName.setText(s);
	}

	public String getUserID() {
		return txtUserID.getText();
	}

	public String getPassWord() {
		return txtUserPassword.getText();
	}

	public String getUserName() {
		return txtUserName.getText();
	}
}
