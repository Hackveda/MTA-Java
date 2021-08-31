package Example;

public class TestEmployee {
	 
	   public static void main(String[] args){
	      Employee e = new Employee();
	      e.name = "pratham";
	      e.age = 45;
	      e.salary = 65520.00;
	 
	      Exampl1 p = new Exampl1();
	      p.name = "Bradon";
	      p.age = 37;
	      p.salary = 77435.00;
	      p.language = "Java";
	 
	      Example2 d = new Example2();
	      d.name = "Jack";
	      d.age = 28;
	      d.salary = 45000.00;
	      d.language = "Maths";
	      d.databaseTool = "My SQL";
	 
	      e.printData();
	      p.printData();
	      d.printData();
	   }
	}
