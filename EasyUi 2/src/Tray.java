import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tray {
	TrayIcon trayIcon = null;
	if (SystemTray.isSupported()) {
	    // get the SystemTray instance
	    SystemTray tray = SystemTray.getSystemTray();
	    // load an image
	    Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jamis\\Mills.png");
	    // create a action listener to listen for default action executed on the tray icon
	    ActionListener listener = new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // execute default action of the application
	            // ...
	        }
	    };
	    // create a popup menu
	    PopupMenu popup = new PopupMenu();
	    // create menu item for the default action
	    MenuItem defaultItem = new MenuItem(...);
	    defaultItem.addActionListener(listener);
	    popup.add(defaultItem);
	    /// ... add other items
	    // construct a TrayIcon
	    trayIcon = new TrayIcon(image, "Tray Demo", popup);
	    // set the TrayIcon properties
	    trayIcon.addActionListener(listener);
	    // ...
	    // add the tray image
	    try {
	        tray.add(trayIcon);
	    } catch (AWTException e) {
	        System.err.println(e);
	    }
	    // ...
	} else {
	    // disable tray option in your application or
	    // perform other actions
	    ...
	}
	// ...
	// some time later
	// the application state has changed - update the image
	if (trayIcon != null) {
		
	    trayIcon.setImage(image);
	}
}
