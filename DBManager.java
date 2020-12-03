import java.sql.*;
import java.util.ArrayList;

/**
 * A class designed to manage the connection and 
 * communication between this application and
 * a remote mySQL database.
 * @author Travis Dow
 */
public class DBManager 
{
	private Connection con;
	private CallableStatement procedure;
	private ResultSet result;
	private String query;
	private String hostname = "jdbc:mysql://cpsc471project.c37sgm9tiidw.us-east-2.rds.amazonaws.com:3307/pharmacy";
	private String user = "admin";
	private String password = "cpsc471project";
	
	/**
	 * Default constructor for class DBManager that
	 * connects to a mySQL database.
	 */
	DBManager()
	{
		try 
		{
			this.con = DriverManager.getConnection(hostname, user, password);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		this.procedure = null;
		this.result = null;
	}
	
	/**
	 * Completes a physical prescription when a customer
	 * picks it up at the pharmacy.
	 * @param scrip - the paper prescription
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean completePrescription(Physical scrip)
	{
		// Generate query
		query = "{CALL completePrescription(?, ?, ?)}";
			
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query); 
			procedure.setInt(1, scrip.getPrescriptionNo());
			procedure.setString(2, scrip.getPatient());
			procedure.setDate(3, today);
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true
	}
	
	/**
	 * Removes a doctor entry from the database.
	 * @param doctorID - the doctor's ID number
	 * @return boolean - true if successful
	 * 					 false if unsuccessful
	 */
	public boolean deleteDoctor(int doctorID)
	{
		// Generate query
		query = "{CALL deleteDoctor(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, doctorID);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true
	}
	
	/**
	 * Deletes a drug entry from the database.
	 * @param drugID - the ID number of the drug
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteDrug(int drugID)
	{
		// Generate query
		query = "{CALL deleteDrug(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true	
	}
	
	/**
	 * Deletes a drug incompatibility entry from the database.
	 * @param drugID1 - the ID number of the drug
	 * @param drugID2 - the ID number of the incompatible drug
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteDrugCompatible(int drugID1, int drugID2)
	{
		// Generate query
		query = "{CALL deleteDrugCompatibility(?, ?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID1);
			procedure.setInt(2, drugID2);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true
	}
	
	/**
	 * Deletes a food incompatibility entry from the database.
	 * @param drugID - the ID number of the drug
	 * @param compatibility - the food that is incompatible
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteFoodCompatible(int drugID, String incompatible)
	{
		// Generate query
		query = "{CALL deleteFoodCompatibility(?, ?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID);
			procedure.setString(2, incompatible);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true
	}
	
	/**
	 * Deletes an insurance entry from the database.
	 * @param name - the insurance company name
	 * @param phoneNum - the phone number of the patient
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteInsurance(String name, int phoneNum)
	{
		// Generate query
		query = "{CALL deleteInsurance(?, ?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setString(1, name);
			procedure.setInt(2, phoneNum);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true	
	}
	
	/**
	 * Deletes a manufacturer entry from the database.
	 * @param manufacturerID - the ID number of the manufacturer
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteManufacturer(int manufacturerID)
	{
		// Generate query
		query = "{CALL deleteManufacturer(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, manufacturerID);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true		
	}
	
	/**
	 * Deletes a patient file from the database.
	 * @param phoneNum - the patient's phone number.
	 * @return boolean - true if delete okay
	 * 					 false if delete failed
	 */
	public boolean deletePatient(int phoneNum)
	{
		// Generate query
		query = "{CALL deletePatient(?)}";
				
		try
		{
			// Send delete to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, phoneNum);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If delete fails, return false
		}
		
		return true; // If delete successful, return true	
	}
	
	/**
	 * Deletes a pharmacy location from the database.
	 * @param address - the address of the pharmacy location
	 * @return boolean - true if delete okay
	 * 					 false if delete failed
	 */
	public boolean deletePharmacyLocation(String address)
	{
		// Generate query
		query = "{CALL deletePharmacy(?)}";
				
		try
		{
			// Send delete to database
			procedure = con.prepareCall(query);
			procedure.setString(1, address);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If delete fails, return false
		}
		
		return true; // If delete successful, return true		
	}
	
	/**
	 * Deletes a prescription file in the database.
	 * @param preNum - the prescription number
	 * @return boolean - true if delete okay
	 * 					 false if delete failed
	 */
	public boolean deletePrescription(int preNum)
	{
		// Generate query
		query = "{CALL deletePrescription(?)}";
				
		try
		{
			// Send delete to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, preNum);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If delete fails, return false
		}
		
		return true; // If delete successful, return true
	}
	
	/**
	 * Deletes a previous medication entry from the database.
	 * @param phoneNum - the phone number of the patient
	 * @param medication - the name of the medication
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deletePreviousMeds(int phoneNum, String medication)
	{
		// Generate query
		query = "{CALL deletePreviousMeds(?, ?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, phoneNum);
			procedure.setString(2, medication);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true		
	}
	
	/**
	 * Deletes a side effect entry from the database.
	 * @param drugID - the ID number of the drug
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteSideEffects(int drugID)
	{
		// Generate query
		query = "{CALL deleteSideEffects(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true		
	}
	
	/**
	 * Deletes a staff entry from the database.
	 * @param staffID - the ID number of the staff
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteStaff(int staffID)
	{
		// Generate query
		query = "{CALL deleteStaff(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, staffID);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true		
	}
	
	/**
	 * Deletes a stock entry from the database.
	 * @param drugID - the ID number of the drug
	 * @param address - the address of the pharmacy
	 * @return boolean - true if query successful
	 * 					 false if query failed
	 */
	public boolean deleteStock(int drugID, String address)
	{
		// Generate query
		query = "{CALL deleteStock(?, ?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID);
			procedure.setString(2, address);
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If query fails, return false
		}
		
		return true; // If query successful, return true		
	}
	
	/**
	 * Fills a paper prescription by converting it into a 
	 * physical prescription ready for completion.
	 * @param staffID - the staff member who fills the prescription's ID number
	 * @param scrip - the paper prescription being filled
	 * @param phoneNum - the phone number of the customer
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean fillPrescription(int staffID, Paper scrip, int phoneNum)
	{
		// Generate query
		query = "{CALL fillPrescription(?, ?, ?, ?)}";
			
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query); 
			procedure.setInt(1, staffID);
			procedure.setInt(2, scrip.getPrescriptionNo());
			procedure.setDate(3, today);
			procedure.setInt(4, phoneNum);
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true
	}
	
	/**
	 * Queries the database for a list of drugs that
	 * are compatible with the drug provided.
	 * @param DIN - the primary key of the drug
	 * @return ArrayList<Drug> - the list of drugs
	 */
	public void queryCompatible(int DIN)
	{
		// TODO finish query
		return;
	}
	
	/**
	 * Queries the database for a list of patients
	 * that are seen by the provided doctor.
	 * @param DID - the primary key of the doctor
	 * @return ArrayList<Patient> - the list of patients
	 */
	public ArrayList<Patient> queryDoctorPatients(int doctorID)
	{
		// Generate query
		query = "{CALL getDoctorPatients(?)}";
		
		ArrayList<Patient> out = new ArrayList<Patient>();
		
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, doctorID);
			result = procedure.executeQuery();
			
			while(result.next())
			{
				int phoneNum = result.getInt(1);
				out.add(this.queryPatient(phoneNum));
			}
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
		
		return out;
	}
	
	/**
	 * Queries the database for the drug file
	 * with the provided DIN.
	 * @param DIN - the primary key of the drug
	 * @return Drug - the drug's information
	 * @return null - if no drug found
	 */
	public Drug queryDrug(int drugID)
	{
		// Generate query
		query = "{CALL getDrug(?)}";
		
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, drugID);
			result = procedure.executeQuery();
			result.next();
			
			// Parse result set from database
			String gName = result.getString(1);
			String bName = result.getString(2);
			String dose = result.getString(3);
			drugID = result.getInt(4);
			int MID = result.getInt(5);
			int PNO = result.getInt(6);
			
			return new Drug(gName, bName, dose, drugID);
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
	}
	
	/**
	 * Queries the database for a list of drug
	 * food incompatibilities that exist with
	 * the provided drug.
	 * @param DIN - the primary key of the drug
	 * @return ArrayList<String> - list of food names
	 */
	public ArrayList<String> queryFood(int DIN)
	{
		// Generate query
		query = "{CALL getFood(?)}";
		
		ArrayList<String> foods = new ArrayList<String>();
		
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, DIN);
			result = procedure.executeQuery();
			
			// Loops until result set is empty
			while(result.next())
			{
				// Parse result set from database
				foods.add(result.getString(1));
			}
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
		
		return foods;
	}
	
	/**
	 * Queries the database for the patient file with 
	 * PK phoneNum and returns a constructed Patient 
	 * object to the calling function.
	 * @param phoneNum - the primary key of the patient
	 * @return Patient - the patient's info
	 */
	public Patient queryPatient(int phoneNum)
	{
		// Generate query
		query = "{CALL getPatient(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, phoneNum);
			result = procedure.executeQuery();
			result.next();
			
			// Parse result set from database
			String fName = result.getString(1);
			String mName = result.getString(2);
			String lName = result.getString(3);
			String sex = result.getString(4); // TODO Should be character
			phoneNum = result.getInt(5);
			int DID = result.getInt(6);
			
			return new Patient(phoneNum, sex.charAt(0), fName, mName, lName);
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
	}
	
	/**
	 * Queries the database for a list of the
	 * provided patient's prescription history.
	 * @param phoneNum - the primary key of the patient
	 * @return ArrayList<String> - a list of previous medication names
	 */
	public ArrayList<String> queryPatientHistory(int phoneNum)
	{
		// Generate query
		query = "{CALL getPatientHistory(?)}";
		
		ArrayList<String> previousMeds = new ArrayList<String>();
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setInt(1, phoneNum);
			result = procedure.executeQuery();
			
			// Loops until result set empty
			while(result.next())
			{
				previousMeds.add(result.getString(1));
			}
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
				
		return previousMeds;
	}
	
	/**
	 * Queries the database for a list of the
	 * provided patient's current prescriptions.
	 * @param phoneNum - the primary key of the patient
	 */
	public void queryPatientPrescription(int phoneNum)
	{
		// TODO finish query
		return;
	}
	
	/**
	 * Queries the database for a list of the
	 * side effects of the provided drug.
	 * @param DIN - the primary key of the drug
	 */
	public void querySideEffects(int DIN)
	{
		// TODO finish query
		return;
	}
	
	/**
	 * Queries the database for a list of the
	 * staff at the provided pharmacy location.
	 * @param address - the primary key of the
	 * 					pharmacy location.
	 */
	public Staff queryStaff(String address)
	{
		// Generate query
		query = "{CALL getStaff(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setString(1, address);
			result = procedure.executeQuery();
			
			result.next();
			int staffID = result.getInt(1);
			String name = result.getString(2);
			String position = result.getString(3);
			
			return new Staff(staffID, name, position); // TODO fix constructor
			
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}
	}
	
	/**
	 * Queries the database for the information about
	 * the stock of drugs in the pharmacy location
	 * specified by the address.
	 * @param address - the pharmacy location's address
	 * @return ArrayList<Drug> - the stock of drugs
	 */
	public Stock queryStock(String address)
	{
		// Generate query
		query = "{CALL getStock(?)}";
				
		try
		{
			// Send query to database
			procedure = con.prepareCall(query);
			procedure.setString(1, address);
			result = procedure.executeQuery();
			
			result.next();
			int drugID = result.getInt(1);
			int amount = result.getInt(2);
			
			Drug drug = this.queryDrug(drugID);
			
			return new Stock(amount, drug); // TODO fix constructor
			
		}
		catch(SQLException e)
		{
			return null; // If query fails, return null
		}		
	}
	
	/**
	 * Inserts a new doctor file into the database.
	 * @param doctor - the doctor to be inserted
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertDoctor(Doctor doc)
	{	
		// Generate query
		query = "{CALL insertDoctor(?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setString(1, doc.getName()); // TODO fix getters
			procedure.setInt(2, doc.getId());
			procedure.setString(3, doc.getLocation());
			
			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true;
	}
	
	/**
	 * Inserts a new drug file into the database.
	 * @param drug - the drug to be inserted
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertDrug(Drug drug)
	{	
		// Generate query
		query = "{CALL insertDrug(?, ?, ?, ?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setString(1, drug.getGenericName()); // TODO fix getters
			procedure.setString(2, drug.getBrandName());
			procedure.setString(3, drug.getDose());
			procedure.setInt(4, drug.getNumber());
			procedure.setInt(5, drug.getManufacturerNumber());
			procedure.setInt(6, drug.getPrescriptionNumber());
			
			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true;
	}
	
	/**
	 * Inserts a new patient file into the database.
	 * @param patient - the patient to be inserted
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertPatient(Patient patient)
	{		
		// Generate query
		query = "{CALL insertPatient(?, ?, ?, ?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setString(1, patient.getFName()); // TODO fix getters
			procedure.setString(2, patient.getMName());
			procedure.setString(3, patient.getLName());
			procedure.setString(4, patient.getSex());
			procedure.setInt(5, patient.getNumber());
			procedure.setInt(6, patient.getDrugNumber());
			
			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true;
	}
	
	/**
	 * Inserts a new prescription file into the 
	 * database.
	 * @param prescription - the prescription to be 
	 * 						 inserted
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertPrescription(Prescription newPre)
	{
		// Generate query
		query = "{CALL insertPrescription(?, ?, ?, ?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, newPre.getPNo()); // TODO fix getters
			procedure.setString(2, newPre.getDrugName());
			procedure.setString(3, newPre.getPatientName());
			procedure.setString(4, newPre.getDoctorName());
			procedure.setInt(5, newPre.getPhone());
			procedure.setInt(5, newPre.getDate());
			procedure.setInt(6, newPre.getId());
			
			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true; // If insert statement succeeds, return true
	}
	
	/**
	 * Inserts a new staff file into the database.
	 * @param staff - the staff to be inserted
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertStaff(Staff newStaff)
	{	
		// Generate query
		query = "{CALL insertStaff(?, ?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, newStaff.getId()); // TODO fix getters
			procedure.setString(2, newStaff.getName());
			procedure.setString(3, newStaff.getPosition());
			procedure.setString(4, newStaff.getAddress());

			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true; // If insert statement succeeds, return true
	}
	
	/**
	 * Inserts an amount of a new drug into a 
	 * pharmacy location's stock.
	 * @param DIN - the primary key of the drug
	 * @param amount - the amount of the drug
	 * @param address - the primary key of the
	 * 					pharmacy location
	 * @return boolean - true if insert okay
	 * 					 false if insert failed
	 */
	public boolean insertStock(Stock newStock)
	{	
		// Generate query
		query = "{CALL insertStock(?, ?, ?)}";
						
		try
		{
			// Prepare insert statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, newStock.getID()); // TODO fix getters
			procedure.setString(2, newStock.getAddress());
			procedure.setInt(3, newStock.getAmount());

			// Send insert statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true; // If insert statement succeeds, return true	
	}
	
	/**
	 * Updates a doctor file in the database.
	 * @param doc - the new doctor to update
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean updateDoctor(Doctor doc)
	{
		// Generate query
		query = "{CALL insertDoctor(?, ?, ?)}";
		
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query);
			procedure.setString(1, doc.getName()); // TODO fix getters
			procedure.setString(2, doc.getClinic());
			procedure.setInt(3, doc.getID());
			
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If insert statement fails, return false
		}
		
		return true; // If update statement succeeds, return true
	}
	
	/**
	 * Updates a drug file in the database.
	 * @param drug - the new version of the drug
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean updateDrug(Drug drug)
	{
		// Generate query
		query = "{CALL insertDrug(?, ?, ?, ?, ?, ?)}";
				
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query); 
			procedure.setString(1, drug.getGenericName()); // TODO fix getters
			procedure.setString(2, drug.getBrandName());
			procedure.setString(3, drug.getAmount());
			procedure.setInt(4, drug.getID());
			procedure.setInt(5,  drug.getMNo());
			procedure.setInt(6, drug.getPID());
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true
	}
	
	/**
	 * Updates a paper prescription file in the database.
	 * @param paper - the updated paper
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean updatePaper(Paper paper)
	{
		// Generate query
		query = "{CALL updatePaper(?, ?, ?, ?)}";
				
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, paper.getPNo()); // TODO fix getters
			procedure.setDate(2, paper.getDateFilled());
			procedure.setDate(3, paper.getDatePrescribed());
			procedure.setInt(4, paper.getDNo());
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true		
	}
	
	/**
	 * Updates a physical prescription in the database.
	 * @param physical - the physical prescription to update
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean updatePhysical(Physical physical)
	{
		// Generate query
		query = "{CALL updatePhysical(?, ?, ?, ?, ?)}";
				
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, paper.getPNo()); // TODO fix getters
			procedure.setDate(2, paper.getDateFilled());
			procedure.setDate(3, paper.getDatePrescribed());
			procedure.setInt(4, paper.getDNo());
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true		
	}
	
	/**
	 * Updates a staff file in the database.
	 * @param newStaff - the staff to update
	 * @return boolean - true if update okay
	 * 					 false if update failed
	 */
	public boolean updateStaff(Staff newStaff)
	{
		// Generate query
		query = "{CALL updateStaff(?, ?, ?, ?)}";
				
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, newStaff.getStaffId()); // TODO fix getters
			procedure.setDate(2, newStaff.getName());
			procedure.setDate(3, newStaff.getPosition());
			procedure.setInt(4, newStaff.getAddress());
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true			
	}
	
	public boolean updateStock(Stock stock)
	{
		// Generate query
		query = "{CALL updateStock(?, ?, ?)}";
				
		try
		{
			// Prepare update statement
			procedure = con.prepareCall(query);
			procedure.setInt(1, stock.DrugId()); // TODO fix getters
			procedure.setString(2, stock.address());
			procedure.setInt(3, stock.getAmount());
					
			// Send update statement to database
			procedure.executeUpdate();
		}
		catch(SQLException e)
		{
			return false; // If update statement fails, return false
		}
			
		return true; // If update statement succeeds, return true	
	}
}