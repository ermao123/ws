package until;

import com.MainFrame;

public class SwingUtil {
	public static MainFrame mainFrame;
	
	public static MainFrame  getMainFrame() {
		return mainFrame;
	}
	public static void setMainFrame(MainFrame mainFrame) {
		SwingUtil.mainFrame= mainFrame;
	}
}
