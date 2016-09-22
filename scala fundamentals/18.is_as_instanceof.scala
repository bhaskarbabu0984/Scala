println(3.isInstanceOf[Int])

println(3.isInstanceOf[Boolean])

println("3".isInstanceOf[String])

println(3.0.asInstanceOf[Int].isInstanceOf[Int])

def evaluate(x:Any) =
	if(x.isInstanceOf[Int]) x.asInstanceOf[Int] + 100
	else -1
	
	
println(evaluate(100))	