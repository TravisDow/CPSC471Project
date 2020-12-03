import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Patient {
	
	private Text textPhoneNumber;
	private Text textSex;
	private Text textPreviousMedications;
	private Text textFName;
	private Text textLName;
	private Text textMName;
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Patient window = new Patient();
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
		
		Label lblPhoneNumber = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblPhoneNumber.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblPhoneNumber.setAlignment(SWT.CENTER);
		lblPhoneNumber.setBounds(130, 50, 125, 45);
		lblPhoneNumber.setText("Phone Number:");
		
		Label lblName = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblName.setText("Name:");
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(480, 50, 125, 45);
		
		Label lblPreviousMedications = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblPreviousMedications.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblPreviousMedications.setText("Previous Medications:");
		lblPreviousMedications.setAlignment(SWT.CENTER);
		lblPreviousMedications.setBounds(480, 175, 125, 45);
		
		Label lblSex = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblSex.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblSex.setText("Sex:");
		lblSex.setAlignment(SWT.CENTER);
		lblSex.setBounds(130, 175, 125, 45);
		
		textPhoneNumber = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textPhoneNumber.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textPhoneNumber.setBounds(280, 50, 125, 45);
		
		textSex = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textSex.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textSex.setBounds(280, 175, 125, 45);
		
		textPreviousMedications = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textPreviousMedications.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textPreviousMedications.setBounds(630, 175, 500, 200);
		
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
