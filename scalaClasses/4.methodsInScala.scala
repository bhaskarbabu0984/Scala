import scala.beans.BeanProperty

class Employee(@BeanProperty val fn:String, @BeanProperty val ln:String, val title:String){
	//Constructor
	def this(fn:String, ln:String) = this(fn, ln, "Programmer")
	
	//new Method
	def fullname = s"$fn $ln"
} 


//How can you enable change of names @ runtime with val variables?

class EmployeeChange(@BeanProperty val fn:String, @BeanProperty val ln:String, val title:String){
	//Constructor
	def this(fn:String, ln:String) = this(fn, ln, "Programmer")
	
	//new Method
	def fullname = s"$fn $ln"
	
	//create another object using copy method
	def copy(fn:String=this.fn, ln:String=this.ln) = new EmployeeChange(fn, ln)
} 
