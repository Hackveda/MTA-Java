package Example;

public class C extends B
{
public static void main(String [] args){
A a = new A();
B b = new B();
System.out.println(a.x);// global variable
System.out.println(b.getB());//retun local variable
}
}
