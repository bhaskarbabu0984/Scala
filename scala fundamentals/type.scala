def add(x:Int, y:Int) = x + y

def sub(x:Double, y:Double) = x - y

println(sub(2.0, 3.0))

//println(add(sub(3, 2), sub(10,2))) // fails due to type mismatch. Scala cannot infer double result to int

println(add(sub(3, 2).toInt, sub(10,2).toInt))