def func(a:Boolean, x:Int, y:Int) = if(a) x else y

println(func(true, 10, 20))


//Invoking methond in random order with the use of named argument
println(func(x=10, a=false, y=20))

//defining function with default values
def func1(a:Boolean, x:Int, y:Int=40) = if(a) x else y

println(func1(true, 100))