package assignment7;

public class Student {
/*declaring instance variables 
 * the type is listed after private. These variables are just being initialized 
 * so there are no parameters to mention 
 * they are private because it is just in the class
 */
	private String firstName;
	private String lastName;
	private int studentIdNumber;
	private double qualityPoints; 
	private double bearBucks;
	private int credits;
	private int passingCredits;
/*constructor method with most important student information 
 * The parameters are variables I created
 * @param String a 
 * @param String b 
 * @param int c
 * These values will then go to firstName, lastName, and studentIDNumber, as 
 * visible below. 
 */
	public Student(String a, String b, int c) {
		this.firstName = a;
		this.lastName = b;
		this.studentIdNumber = c; 
	}
/* set first to student 
 * @param  a 
 */
	public void setFirstName(String a) {
		this.firstName = a;
	}
/* set the last name 
 * @param  b
 */
	public void setLastName(String b) {
		this.lastName = b;
	}
/*  get access to the fullName 
 * @return expected
 */
	public String getFullName() {
		String expected = this.firstName + " " + this.lastName;
		return expected;
	}
/* gets ID number 
 * @return this.studentIdNumber
 */
	public int getId() {
		return this.studentIdNumber;
	}
/*this assesses if a grade is worth a pass, and puts any passing credits towards 
 * student's total credits, as well as calculates quality points
 * @param grade (to account for the grades) goes in
 * @param credit (to account for credit for the class) */
	public void submitGrade(double grade, int credit) {
		if (grade >= 1.7) {
			this.passingCredits += credit;
		} 
		this.credits += credit; 
		this.qualityPoints += credit * grade;
		}
/* gets attempted credits
 * @return this.credits
 */
	public int getTotalAttemptedCredits() {
		return this.credits;
	}
/* gets passing credits 
 * @return this.passingCredits
 */
	public int getTotalPassingCredits() {
		return this.passingCredits;
	}
/*calculates GPA with quality points and the student's 
 * @return this.qualityPoints/this.credits for GPA
 */
	public double calculateGradePointAverage() {
		return this.qualityPoints / this.credits;
	}
/* assesses credits in comparison to reqs for class years 
 * @return
 * passingCredits tell the info needed
 */
	public String getClassStanding() {
		if (this.passingCredits < 30) {
			return "First Year";
		} else if (this.passingCredits >= 30 && this.passingCredits < 60) {
			return "Sophomore";
		} else if (this.passingCredits >= 60 && this.passingCredits < 90) {
			return "Junior";
		} else {
			return "Senior";
		}
	}
/* assesses if the student is eligible for PhiBetaKappa based on GPA/credits 
 * @return
 */
	public boolean isEligibleForPhiBetaKappa() {
		if (this.credits >= 98 && this.calculateGradePointAverage() >= 3.6) {
			return true;
		} else if (this.credits >= 75 && this.calculateGradePointAverage() >= 3.8) {
			return true;
		} else {
			return false;
		}
	}
/*adds bearbucks set 
 * @param amount
 */
	public void depositBearBucks(double amount) {
		this.bearBucks += amount;
	}
/* takes out bearbucks set 
 * @param amount
 */
	public void deductBearBucks(double amount) {
		this.bearBucks -= amount;

	}
/*tells bearbucks balance 
 * @return
 */
	public double getBearBucksBalance() {
		return this.bearBucks;
	}
/* cashes out bearbucks. if you have $10 or less, you lose your money
 * if you have more than $10, you get "Xbearbucks - 10"
 * checks how many bearbucks student has and returns final amount. zeros it too
 * @return 
 */
	public double cashOutBearBucks() {
		if (this.bearBucks <= 10) {
			this.bearBucks = 0.0;
			return 0.0;
		} else {
			double cash = this.bearBucks - 10;
			this.bearBucks = 0;
			return cash; 
		}
	}
/*creates a legacy student based on parents' previously stored info on parents 
 * and gives student the parents' old bearbucks (cashed out)
 * @param firstName (gets parent's first name) 
 * @param other (gets other parent's first name) 
 * @param isHyphenated (is the name hyphenated)
 * @param id (id)
 * @return
 */
	public Student createLegacy(String firstName, Student other, boolean isHyphenated, int id) {
		Student legacyX = new Student(firstName, "", id);
		if (isHyphenated == true) {
			legacyX.lastName = this.lastName + "-" + other.lastName;
		} else {
			legacyX.lastName = this.lastName;
		}
		legacyX.bearBucks = this.cashOutBearBucks() + other.cashOutBearBucks();

		return legacyX;
	}
/* my toString function to print basic info 
 * @return 
 */
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.studentIdNumber;
	}

}
