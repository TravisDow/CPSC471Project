import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PrescriptionsGUI {
	
	private Text textPrescriptionNumber;
	private Text textPatient;
	private Text textPhysician;
	private Text textDrug;
	private Text textDateFilled;
	private Text textDatePickedUp;
	private Text textDateReceived;
	private Text textDatePrescribed;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PrescriptionsGUI window = new PrescriptionsGUI();
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
		btnAdd.setBounds(332, 453, 200, 100);
		
		Button btnRemove = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnRemove.setText("Remove");
		btnRemove.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnRemove.setBounds(538, 453, 200, 100);
		
		Button btnComplete = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnComplete.setText("Complete");
		btnComplete.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnComplete.setBounds(332, 559, 200, 100);
		
		Button btnRelease = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnRelease.setText("Release");
		btnRelease.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnRelease.setBounds(538, 559, 200, 100);
		
		Button btnReturn = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnReturn.setText("Return");
		btnReturn.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnReturn.setBounds(744, 559, 200, 100);
		
		Button btnModify = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnModify.setText("Modify");
		btnModify.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnModify.setBounds(744, 453, 200, 100);
		
		Label PrescriptionNumber = new Label(shlPharmacyManagementSystem, SWT.NONE);
		PrescriptionNumber.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		PrescriptionNumber.setAlignment(SWT.CENTER);
		PrescriptionNumber.setBounds(130, 50, 125, 45);
		PrescriptionNumber.setText("Prescription Number:");
		
		Label lblDrug = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDrug.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDrug.setText("Drug:");
		lblDrug.setAlignment(SWT.CENTER);
		lblDrug.setBounds(480, 50, 125, 45);
		
		Label lblPhysician = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblPhysician.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblPhysician.setText("Physician:");
		lblPhysician.setAlignment(SWT.CENTER);
		lblPhysician.setBounds(480, 175, 125, 45);
		
		Label lblPatient = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblPatient.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblPatient.setText("Patient:");
		lblPatient.setAlignment(SWT.CENTER);
		lblPatient.setBounds(130, 175, 125, 45);
		
		Label lblDateFilled = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDateFilled.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDateFilled.setText("Date Filled:");
		lblDateFilled.setAlignment(SWT.CENTER);
		lblDateFilled.setBounds(130, 300, 125, 45);
		
		Label lblDatePickedUp = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDatePickedUp.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDatePickedUp.setText("Date Picked Up:");
		lblDatePickedUp.setAlignment(SWT.CENTER);
		lblDatePickedUp.setBounds(480, 300, 125, 45);
		
		Label lblDatePrescribed = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDatePrescribed.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDatePrescribed.setText("Date Prescribed:");
		lblDatePrescribed.setAlignment(SWT.CENTER);
		lblDatePrescribed.setBounds(830, 50, 125, 45);
		
		Label lblDateReceived = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDateReceived.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDateReceived.setText("Date Received:");
		lblDateReceived.setAlignment(SWT.CENTER);
		lblDateReceived.setBounds(830, 175, 125, 45);
		
		textPrescriptionNumber = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textPrescriptionNumber.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textPrescriptionNumber.setBounds(280, 50, 125, 45);
		
		textPatient = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textPatient.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textPatient.setBounds(280, 175, 125, 45);
		
		textPhysician = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textPhysician.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textPhysician.setBounds(630, 175, 125, 45);
		
		textDrug = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDrug.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDrug.setBounds(630, 50, 125, 45);
		
		textDateFilled = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDateFilled.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDateFilled.setBounds(280, 300, 125, 45);
		
		textDatePickedUp = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDatePickedUp.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDatePickedUp.setBounds(630, 300, 125, 45);
		
		textDateReceived = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDateReceived.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDateReceived.setBounds(980, 175, 125, 45);
		
		textDatePrescribed = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDatePrescribed.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDatePrescribed.setBounds(980, 50, 125, 45);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
