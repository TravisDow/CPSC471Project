import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class StaffHomescreenGUI {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StaffHomescreenGUI window = new StaffHomescreenGUI();
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
		
		Button btnDrugs = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnDrugs.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnDrugs.setBounds(300, 250, 200, 150);
		btnDrugs.setText("Drugs");
		
		Button btnPrescriptions = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnPrescriptions.setText("Prescriptions");
		btnPrescriptions.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnPrescriptions.setBounds(300, 50, 200, 150);
		
		Button btnInsurance = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnInsurance.setText("Insurance");
		btnInsurance.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnInsurance.setBounds(300, 450, 200, 150);
		
		Button btnPatients = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnPatients.setText("Patients");
		btnPatients.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnPatients.setBounds(750, 50, 200, 150);
		
		Button btnDoctors = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnDoctors.setText("Doctors");
		btnDoctors.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnDoctors.setBounds(750, 250, 200, 150);
		
		Button btnManufacturers = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnManufacturers.setText("Manufacturers");
		btnManufacturers.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnManufacturers.setBounds(750, 450, 200, 150);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
