import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class StockGUI {

	private Text textDIN;
	private Text textStock;
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StockGUI window = new StockGUI();
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
		
		Button btnModify = new Button(shlPharmacyManagementSystem, SWT.NONE);
		btnModify.setText("Modify");
		btnModify.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnModify.setBounds(538, 480, 200, 100);
		
		Label lblDin = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblDin.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblDin.setAlignment(SWT.CENTER);
		lblDin.setBounds(130, 50, 125, 45);
		lblDin.setText("DIN:");
		
		Label lblStock = new Label(shlPharmacyManagementSystem, SWT.NONE);
		lblStock.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblStock.setText("Stock:");
		lblStock.setAlignment(SWT.CENTER);
		lblStock.setBounds(130, 175, 125, 45);
		
		textDIN = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textDIN.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textDIN.setBounds(280, 50, 125, 45);
		
		textStock = new Text(shlPharmacyManagementSystem, SWT.BORDER);
		textStock.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		textStock.setBounds(280, 175, 125, 45);

		shlPharmacyManagementSystem.open();
		shlPharmacyManagementSystem.layout();
		while (!shlPharmacyManagementSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
