import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Drug {
	
	private Text textDIN;
	private Text textIntendedEffects;
	private Text textGenericName;
	private Text textBrandName;
	private Text textSideEffects;
	private Text textFoodCompatability;
	private Text textDrugCompatability;
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Drug window = new Drug();
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
		btnAdd.setBounds(332, 538, 200, 100);
		
		Button btnRemove = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnRemove.setText("Remove");
		btnRemove.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnRemove.setBounds(538, 538, 200, 100);
		
		Button btnModify = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnModify.setText("Modify");
		btnModify.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnModify.setBounds(744, 538, 200, 100);
		
		Label lblDIN = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDIN.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDIN.setAlignment(SWT.CENTER);
		lblDIN.setBounds(130, 50, 125, 45);
		lblDIN.setText("DIN:");
		
		Label lblGenericName = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblGenericName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblGenericName.setText("Generic Name:");
		lblGenericName.setAlignment(SWT.CENTER);
		lblGenericName.setBounds(480, 50, 125, 45);
		
		Label lblSideEffects = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblSideEffects.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblSideEffects.setText("Side Effects:");
		lblSideEffects.setAlignment(SWT.CENTER);
		lblSideEffects.setBounds(80, 333, 125, 45);
		
		Label lblIntendedEffects = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblIntendedEffects.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblIntendedEffects.setText("Intended Effects:");
		lblIntendedEffects.setAlignment(SWT.CENTER);
		lblIntendedEffects.setBounds(80, 150, 125, 45);
		
		Label lblFoodCompatability = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblFoodCompatability.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblFoodCompatability.setText("Food Compatability:");
		lblFoodCompatability.setAlignment(SWT.CENTER);
		lblFoodCompatability.setBounds(720, 150, 125, 45);
		
		Label lblDrugCompatability = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDrugCompatability.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDrugCompatability.setText("Drug Compatibility:");
		lblDrugCompatability.setAlignment(SWT.CENTER);
		lblDrugCompatability.setBounds(720, 333, 125, 45);
		
		Label lblBrandName = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblBrandName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblBrandName.setText("Brand Name:");
		lblBrandName.setAlignment(SWT.CENTER);
		lblBrandName.setBounds(830, 50, 125, 45);
		
		textDIN = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDIN.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDIN.setBounds(280, 50, 125, 45);
		
		textIntendedEffects = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textIntendedEffects.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textIntendedEffects.setBounds(230, 150, 325, 150);
		
		textGenericName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textGenericName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textGenericName.setBounds(630, 50, 125, 45);
		
		textBrandName = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textBrandName.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textBrandName.setBounds(980, 50, 125, 45);
		
		textSideEffects = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textSideEffects.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textSideEffects.setBounds(230, 330, 325, 150);
		
		textFoodCompatability = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textFoodCompatability.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textFoodCompatability.setBounds(870, 150, 325, 150);
		
		textDrugCompatability = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDrugCompatability.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDrugCompatability.setBounds(870, 330, 325, 150);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
