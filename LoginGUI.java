import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Menu;

public class LoginGUI {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlPharmacyManagementSystem = new Shell();
		shlPharmacyManagementSystem.setMinimumSize(new Point(1280, 720));
		shlPharmacyManagementSystem.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		shlPharmacyManagementSystem.setSize(450, 300);
		shlPharmacyManagementSystem.setText("Pharmacy Management System");
		
		Button btnAdminButton = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnAdminButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnAdminButton.setBounds(250, 250, 200, 150);
		btnAdminButton.setText("Admin Login");
		
		Button btnStaffLogin = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnStaffLogin.setText("Staff Login");
		btnStaffLogin.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnStaffLogin.setBounds(800, 250, 200, 150);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}


