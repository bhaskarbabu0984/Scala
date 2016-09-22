val a = 3 + 10

println(a)

//This works too... + is a method in scala 
//In this scenario, actual '+' method will be overloaded by scala
val b = 3.+(10)

println(b)

//methods name can be named with +. 
//scala interprets as "$plus: (x: Int, y: Int)Int"
def +(x:Int, y:Int) = x + y

println($plus(10, 20))