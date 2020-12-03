import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class AdminHomescreenGUI {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AdminHomescreenGUI window = new AdminHomescreenGUI();
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
		shlPharmacyManagementSystem.setText("Pharmacy Management System");
		
		Button btnNewButton = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnNewButton.setBounds(300, 180, 200, 150);
		btnNewButton.setText("Drugs");
		
		Button btnPrescriptions = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnPrescriptions.setText("Prescriptions");
		btnPrescriptions.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnPrescriptions.setBounds(300, 25, 200, 150);
		
		Button btnInsurance = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnInsurance.setText("Insurance");
		btnInsurance.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnInsurance.setBounds(300, 335, 200, 150);
		
		Button btnPatients = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnPatients.setText("Patients");
		btnPatients.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnPatients.setBounds(750, 25, 200, 150);
		
		Button btnDoctors = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnDoctors.setText("Doctors");
		btnDoctors.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnDoctors.setBounds(750, 180, 200, 150);
		
		Button btnManufacturers = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnManufacturers.setText("Manufacturers");
		btnManufacturers.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnManufacturers.setBounds(750, 335, 200, 150);
		
		Button btnStaff = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnStaff.setText("Staff");
		btnStaff.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnStaff.setBounds(300, 490, 200, 150);
		
		Button btnStock = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnStock.setText("Stock");
		btnStock.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnStock.setBounds(750, 490, 200, 150);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
