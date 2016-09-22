
//Class with getters and setters
import scala.beans.BeanProperty

class newEmp(@BeanProperty val fn:String, @BeanProperty val ln:String)


/*
Generates:

public class newEmp {
  private final java.lang.String fn;
  private final java.lang.String ln;
  public java.lang.String fn();
  public java.lang.String ln();
  public java.lang.String getFn();
  public java.lang.String getLn();
  public newEmp(java.lang.String, java.lang.String);
}

Note - Only getters are generated as the its a val. Val is immutable.
    If variables are declared as var, u get both setters and getters.

*/