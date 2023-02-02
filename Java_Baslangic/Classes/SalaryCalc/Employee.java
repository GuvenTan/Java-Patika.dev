package Classes.SalaryCalc;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee (String name, double salary,int workHours,int hireYear) {
		this.name = name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.workHours = workHours;
	}
	
	double tax() {
		double tax;
		if (this.salary <=1000) {
			tax = 0;
		}else {
			tax = this.salary * 0.03;  
		}
		
		return tax;
	}
	
	
	int bonus(){
		int bonus;
		
		if (this.workHours > 40) {
			bonus = (this.workHours - 40) * 30;
		}else {
			bonus = 0;
		}
		
		return bonus;
	}
	
	
	double raiseSalary() {
		double raise;
		
		int year = 2021 - this.hireYear;
		if (year < 10) {
			raise = this.salary * 0.05;
			
		}else if ((year > 9) && year < 20) {
			raise = this.salary * 0.1;
		}else {
			raise = this.salary * 0.15;
		}
		
		return raise;
	}
	
	double newSalary () {
		double newsal = this.salary - tax() + bonus() + raiseSalary(); 
		
		return newsal;
	}
	
	
	void Info(){
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati : " + this.workHours);
		System.out.println("Başlangıç Tarihi: " + this.hireYear);
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maaş Artışı: " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (newSalary()-raiseSalary()));
		System.out.println("Toplam Maaş: " + newSalary());
		
	}
	
	
	
}









