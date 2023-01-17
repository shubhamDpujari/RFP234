package api;

public class Employe {
	 
    int empID;
    String city;
    String name;
    double salary;

     Employe(int empID, String city, String name, double salary) {
        this.empID = empID;
        this.city = city;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employe [empID=" + empID + ", city=" + city + ", name=" + name + ", salary=" + salary + "]";
	}
    
}


