import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DoctorGUI {

	private Text textDoctorID;
	private Text textClinic;
	private Text textFName;
	private Text textLName;
	private Text textMName;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DoctorGUI window = new DoctorGUI();
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
		
		Label lblDoctorID = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDoctorID.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDoctorID.setAlignment(SWT.CENTER);
		lblDoctorID.setBounds(130, 50, 125, 45);
		lblDoctorID.setText("Doctor ID:");
		
		Label lblName = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblName.setText("Name:");
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(480, 50, 125, 45);
		
		Label lblClinic = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblClinic.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblClinic.setText("Clinic:");
		lblClinic.setAlignment(SWT.CENTER);
		lblClinic.setBounds(130, 178, 125, 45);
		
		textDoctorID = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDoctorID.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDoctorID.setBounds(280, 50, 125, 45);
		
		textClinic = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textClinic.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textClinic.setBounds(280, 175, 125, 45);
		
		textFName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textFName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textFName.setBounds(630, 50, 125, 45);
		
		textLName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textLName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textLName.setBounds(892, 50, 125, 45);
		
		textMName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textMName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textMName.setBounds(761, 50, 125, 45);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
