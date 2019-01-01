package Server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ServerUI.ServerBookPanel;
import ServerUI.ServerPrimaryPanel;
import ServerUI.ServerUserPanel;

public class SeverActionListener implements ActionListener {

	private ServerPrimaryPanel primary = ServerAppManger.getS_instance().getsPrimPanel();
	private ServerBookPanel bookPanel = ServerAppManger.getS_instance().getsBookPanel();
	private ServerUserPanel userPanel = ServerAppManger.getS_instance().getsUserPanel();

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() == primary.getBtnBookManager())
			primary.showBook();
		else if (event.getSource() == primary.getBtnUserManager())
			primary.showUser();

	}

}
