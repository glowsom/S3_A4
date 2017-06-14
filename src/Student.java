//	TODO -Create a class Student which has some private data like name, phone number, roll
//	number, class, use getter and setters to access this private data. 
//	Create a method result which accepts marks in three subjects along with the student roll
//	number and return the result of that student as pass or fails.
//	Create another class StudentResultProcesing and extend this class from the student class
//	and it will print the result of a student. 
public class Student {

	private String name;
	private double phoneNumber;
	private int rollNumber;
	private String classRoom;

	public void setName(String name){
		this.name = name;
	}
	public void setPhoneNumber(double phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}
	public void setClassRoom( String classRoom){
		this.classRoom = classRoom;
	}
	public String getName(){
		return name;
	}
	public double getPhoneNumber(){
		return phoneNumber;
	}
	public int getRollNumber(){
		return rollNumber;
	}
	public String getClassRoom(){
		return classRoom;
	}
	public String result(int mathScore, int englishScore, int scienceScore){
		int average = (mathScore + englishScore + scienceScore)/3;
		if( average < 50)return "Fail";
		else return "Pass";
	}

}