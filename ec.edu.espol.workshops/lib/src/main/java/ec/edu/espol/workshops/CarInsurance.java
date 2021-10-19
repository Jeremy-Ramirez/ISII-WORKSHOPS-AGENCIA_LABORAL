package ec.edu.espol.workshops;

public class CarInsurance {
	public int age;
	public char sex;
	public String maritalStatus;
	final int basePremium=500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getAge() {
		return age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	
	public int getBasePremium() {
		return basePremium;
	}
	
	public void  setAge(int age)    { 
            this.age = age;
    }
	public void  setSex(char sex)    {
        this.sex = sex;
	}
	public void  setMaritalStatus(String maritalStatus)    {
        this.maritalStatus = maritalStatus;
	}
}
