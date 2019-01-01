package Server;

import ServerUI.ServerBookPanel;
import ServerUI.ServerFrame;
import ServerUI.ServerPrimaryPanel;
import ServerUI.ServerUserPanel;

public class ServerAppManger {
	private static ServerAppManger s_instance;
	private ServerFrame sFrame;
	private ServerBookPanel sBookPanel;
	private ServerPrimaryPanel sPrimPanel;
	private ServerUserPanel sUserPanel;

	private ServerAppManger() {

	}

	public static ServerAppManger getS_instance() {
		if (s_instance == null)
			s_instance = new ServerAppManger();
		return s_instance;
	}

	public void setS_ServerFrame(ServerFrame sFrame) {
		this.sFrame = sFrame;
	}

	public ServerFrame getsServerFrame() {
		return sFrame;
	}

	public ServerBookPanel getsBookPanel() {
		return sBookPanel;
	}

	public void setsBookPanel(ServerBookPanel sBookPanel) {
		this.sBookPanel = sBookPanel;
	}

	public ServerPrimaryPanel getsPrimPanel() {
		return sPrimPanel;
	}

	public void setsPrimPanel(ServerPrimaryPanel sPrimPanel) {
		this.sPrimPanel = sPrimPanel;
	}

	public ServerUserPanel getsUserPanel() {
		return sUserPanel;
	}

	public void setsUserPanel(ServerUserPanel sUserPanel) {
		this.sUserPanel = sUserPanel;
	}

}
