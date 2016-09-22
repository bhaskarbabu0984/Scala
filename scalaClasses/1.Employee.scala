//Simple class in Scala
class Employee(val fn:String, val ln:String)



/* 
Generates:
public class Employee {
  private final java.lang.String fn;
  private final java.lang.String ln;
  public java.lang.String fn();
  public java.lang.String ln();
  public Employee(java.lang.String, java.lang.String);
}
*/


/* 

class Employee(fn:String, ln:String)

In Scala generates

Compiled from "Employee.scala"
public class Employee {
  public Employee(java.lang.String, java.lang.String);
}
*/

