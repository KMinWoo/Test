package ServerUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Server.ServerAppManger;
import Server.ServerConstant;

public class ServerBookPanel extends JPanel {

	private JComboBox<String> combox;
	private JLabel labBookName;
	private JLabel labBookAuthor;
	private JLabel labBookPublish;
	private JTextField txtSearchInfo;
	private JTextField txtBookName;
	private JTextField txtBookAuthor;
	private JTextField txtBookPublish;
	private JButton btnSearch;
	private JButton btnInsert;
	private JButton btnRental;
	private JButton btnDelete;
	private JTable tableBook;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private JDialog RentalInfoDialog;

	public ServerBookPanel() {
		ServerAppManger.getS_instance().setsBookPanel(this);
		// setBackground(Color.BLACK);
		setLayout(null);
		SetUI();
	}

	private void CreateComponent() {
		combox = new JComboBox(ServerConstant.BOOK_INFO);
		labBookName = new JLabel(ServerConstant.BOOK_INFO[1]);
		labBookAuthor = new JLabel(ServerConstant.BOOK_INFO[2]);
		labBookPublish = new JLabel(ServerConstant.BOOK_INFO[3]);
		txtSearchInfo = new JTextField();
		txtBookName = new JTextField();
		txtBookAuthor = new JTextField();
		txtBookPublish = new JTextField();
		btnSearch = new JButton(ServerConstant.SERACH);
		btnInsert = new JButton(ServerConstant.INSERT);
		btnRental = new JButton(ServerConstant.RENTAL);
		btnDelete = new JButton(ServerConstant.DELETE);
		Object d[][] = { { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "a", "a", "a", "a" },
				{ "a", "a", "a", "a" }, { "a", "a", "a", "a" }, { "b", "b", "b", "b" }, { "b", "b", "b", "b" } };
		model = new DefaultTableModel(d, ServerConstant.BOOK_INFO);
		tableBook = new JTable(model);
		scroll = new JScrollPane(tableBook);
		// RentalInfoDialog = new JDialog(arg0, arg1, arg2)
	}

	private void AddComponent() {
		add(combox);
		add(labBookName);
		add(labBookAuthor);
		add(labBookPublish);
		add(txtSearchInfo);
		add(txtBookName);
		add(txtBookAuthor);
		add(txtBookPublish);
		add(btnSearch);
		add(btnInsert);
		add(btnRental);
		add(btnDelete);
		add(scroll);
	}

	private void SetUI() {
		CreateComponent();
		combox.setBounds(20, 20, 150, 50);
		txtSearchInfo.setBounds(180, 20, 180, 50);
		btnSearch.setBounds(380, 20, 80, 50);// 480~760

		labBookName.setBounds(480, 90, 100, 70);
		txtBookName.setBounds(600, 90, 150, 70);

		labBookAuthor.setBounds(480, 180, 100, 70);
		txtBookAuthor.setBounds(600, 180, 150, 70);

		labBookPublish.setBounds(480, 270, 100, 70);
		txtBookPublish.setBounds(600, 270, 150, 70);

		btnInsert.setBounds(480, 350, 70, 70);
		btnRental.setBounds(570, 350, 70, 70);
		btnDelete.setBounds(660, 350, 70, 70);

		scroll.setBounds(20, 90, 440, 370);

		AddComponent();
	}

	public void AddEvent(ActionListener act) {
		btnSearch.addActionListener(act);
		btnInsert.addActionListener(act);
		btnRental.addActionListener(act);
		btnDelete.addActionListener(act);
	}

	public JComboBox<String> getCombox() {
		return combox;
	}

	public void setCombox(JComboBox<String> combox) {
		this.combox = combox;
	}

	public JTextField getTxtSearchInfo() {
		return txtSearchInfo;
	}

	public void setTxtSearchInfo(JTextField txtSearchInfo) {
		this.txtSearchInfo = txtSearchInfo;
	}

	public JTextField getTxtBookName() {
		return txtBookName;
	}

	public void setTxtBookName(JTextField txtBookName) {
		this.txtBookName = txtBookName;
	}

	public JTextField getTxtBookAuthor() {
		return txtBookAuthor;
	}

	public void setTxtBookAuthor(JTextField txtBookAuthor) {
		this.txtBookAuthor = txtBookAuthor;
	}

	public JTextField getTxtBookPublish() {
		return txtBookPublish;
	}

	public void setTxtBookPublish(JTextField txtBookPublish) {
		this.txtBookPublish = txtBookPublish;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(JButton btnSearch) {
		this.btnSearch = btnSearch;
	}

	public JButton getBtnInsert() {
		return btnInsert;
	}

	public void setBtnInsert(JButton btnInsert) {
		this.btnInsert = btnInsert;
	}

	public JButton getBtnRental() {
		return btnRental;
	}

	public void setBtnRental(JButton btnRental) {
		this.btnRental = btnRental;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JTable getTableBook() {
		return tableBook;
	}

	public void setTableBook(JTable tableBook) {
		this.tableBook = tableBook;
	}

}
