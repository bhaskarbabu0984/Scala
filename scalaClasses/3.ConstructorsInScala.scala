import scala.beans.BeanProperty

class newEmp(@BeanProperty val fn:String, @BeanProperty val ln:String, val title:String){
	def this(fn:String, ln:String) = this(fn, ln, "Programmer")
} 



/*
	Generates:
public class newEmp {
  private final java.lang.String fn;
  private final java.lang.String ln;
  private final java.lang.String title;
  public java.lang.String fn();
  public java.lang.String ln();
  public java.lang.String title();
  public java.lang.String getFn();
  public java.lang.String getLn();
  //Constructors
  public newEmp(java.lang.String, java.lang.String, java.lang.String);
  public newEmp(java.lang.String, java.lang.String);
}
*/