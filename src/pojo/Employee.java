package pojo;

public class Employee {
private String employeeId;
private String employeeName;
private String deptId;
private String position;
private String fatherName;
private String motherName;
private String permentAddress;
private String currentAddress;
private String nationalId;
private String contactNo;
private String email;
private int salaryPerDay;
private int overtimeRatePerHour;
private String accNumber;
private String status;
private String password;


public String getEmployeeId() {
	return employeeId;
}






public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}










public String getEmployeeName() {
	return employeeName;
}










public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}










public String getDeptId() {
	return deptId;
}










public void setDeptId(String deptId) {
	this.deptId = deptId;
}










public String getPosition() {
	return position;
}










public void setPosition(String position) {
	this.position = position;
}










public String getFatherName() {
	return fatherName;
}










public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}










public String getMotherName() {
	return motherName;
}










public void setMotherName(String motherName) {
	this.motherName = motherName;
}










public String getPermentAddress() {
	return permentAddress;
}










public void setPermentAddress(String permentAddress) {
	this.permentAddress = permentAddress;
}










public String getCurrentAddress() {
	return currentAddress;
}










public void setCurrentAddress(String currentAddress) {
	this.currentAddress = currentAddress;
}










public String getNationalId() {
	return nationalId;
}










public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
}










public String getContactNo() {
	return contactNo;
}










public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}










public String getEmail() {
	return email;
}










public void setEmail(String email) {
	this.email = email;
}










public int getSalaryPerDay() {
	return salaryPerDay;
}










public void setSalaryPerDay(int salaryPerDay) {
	this.salaryPerDay = salaryPerDay;
}










public int getOvertimeRatePerHour() {
	return overtimeRatePerHour;
}










public void setOvertimeRatePerHour(int overtimeRatePerHour) {
	this.overtimeRatePerHour = overtimeRatePerHour;
}










public String getAccNumber() {
	return accNumber;
}










public void setAccNumber(String accNumber) {
	this.accNumber = accNumber;
}










public String getStatus() {
	return status;
}










public void setStatus(String status) {
	this.status = status;
}










public String getPassword() {
	return password;
}










public void setPassword(String password) {
	this.password = password;
}










@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName="
			+ employeeName + ", deptId=" + deptId + ", position=" + position
			+ ", fatherName=" + fatherName + ", motherName=" + motherName
			+ ", permentAddress=" + permentAddress + ", currentAddress="
			+ currentAddress + ", nationalId=" + nationalId + ", contactNo="
			+ contactNo + ", email=" + email + ", salaryPerDay=" + salaryPerDay
			+ ", overtimeRatePerHour=" + overtimeRatePerHour + ", accNumber="
			+ accNumber + ", status=" + status + ", password=" + password + "]";
}

}
