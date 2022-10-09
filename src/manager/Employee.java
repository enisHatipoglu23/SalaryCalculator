package manager;

public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int tax() {
		int tax = 0;
		if(this.salary < 1000) {
			tax = 0;
		}else if(this.salary >= 1000) {
			tax = this.salary*3/100;;
		}
		return tax;
	}
	public int bonus() {
		int bonus = 0;
		if(this.workHours > 40) {
			int overtime = workHours-40;
			bonus = overtime*30*4;
		}
		if(this.workHours<40) {
			bonus = 0;
			System.out.println("Bonus = 0");
	}
		return bonus;
	}
	
	public int raiseSalary() {
		int thisYear = 2021;
		int raise = 0;
		int totalYear = thisYear-this.hireYear;
		if(totalYear <= 9) {
			raise += this.salary*5/100 + bonus() - tax();
			this.salary += raise;
			
		}else if(totalYear > 9 && totalYear <= 19) {
			raise += this.salary*10/100 - tax() + bonus();
			this.salary += raise;
		}else if(totalYear > 19) {
			raise += this.salary*15/100 + bonus() - tax();
		}
		return raise;
	}
	
	public void tooString() {
		System.out.println("-------- *** --------");
		System.out.println();
		System.out.println("******** PAYSLIP ********");
		System.out.println();
		System.out.println("Calisan = " + name);
		System.out.println("Ise giris yili = " + hireYear);
		int overtime = (workHours - 40)*4;
		System.out.println("Aylik toplam mesai saati = " + overtime);
		System.out.println("Bonus = " + bonus());
		System.out.println("Onceki Maas = " + this.salary);
		System.out.println("Vergi gideri = " + tax());
		System.out.println("Yillik toplam zam(Bonus ve vergi dahil) = " + raiseSalary());
		System.out.println();
		System.out.println("TOTAL ZAMLI MAAS = " + this.salary);
		System.out.println();
		System.out.println("-------- *** --------");
	}
	
} 
	
	

