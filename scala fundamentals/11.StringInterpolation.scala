//replace any word within a context which is out side of its line
val a = 99

println(s"${a} is the value after interpolation")

//{} not necessary if only one value

println(s"$a is the value after interpolation!!!!!")

//s interpolator
println(s"${a + 3} is the new value")

//f interpolator for floating values

val cost = 500
val item = "laptop"

//$item%s inticates its a string interpolator, $$ is teh escape sequence to print $ symbol
//, $cost%1.2f is float interpolator and %n is new line 
println(f"The $item%s costs $$$cost%1.2f %n")

//interpolation using smart strings

val percentageIncrease = 20

println(f""" The $item%s costs $$$cost%1.2f
but with extra memory
its $percentageIncrease%% increase in total cost %n""".stripMargin)