import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class InsuranceGUI {

	private Text textName;
	private Text textLocation;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InsuranceGUI window = new InsuranceGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shlPharmacyManagementSystem = new Shell();
		shlPharmacyManagementSystem.setMinimumSize(new Point(1280, 720));
		shlPharmacyManagementSystem.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		shlPharmacyManagementSystem.setSize(450, 300);
		shlPharmacyManagementSystem.setText("\r\nPharmacy Management System");
		
		Button btnAdd = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnAdd.setText("Add");
		btnAdd.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnAdd.setBounds(332, 480, 200, 100);
		
		Button btnRemove = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnRemove.setText("Remove");
		btnRemove.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnRemove.setBounds(538, 480, 200, 100);
		
		Button btnModify = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnModify.setText("Modify");
		btnModify.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnModify.setBounds(744, 480, 200, 100);
		
		Label lblName = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(130, 50, 125, 45);
		lblName.setText("Name:");
		
		Label lblLocation = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblLocation.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblLocation.setText("Location:");
		lblLocation.setAlignment(SWT.CENTER);
		lblLocation.setBounds(130, 175, 125, 45);
		
		textName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textName.setBounds(280, 50, 125, 45);
		
		textLocation = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textLocation.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textLocation.setBounds(280, 175, 125, 45);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
