package Oops_basic;

class Class_Object
{      
	// data members ,variable
	 String name;
	 int rollno;
	 int age;
	 
	void info()  //Method /function
	{
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args)
	{
		Class_Object student = new Class_Object();
		// ClassName ObjectName = new ClassName();
		// class_name object_name = new class_name()
		// Accessing and property value
		student.name = "Anushaka";
		student.rollno = 251;
		student.age = 21;
		
		// Calling method
		//objectname.method()
		student.info();
		
	}
} 