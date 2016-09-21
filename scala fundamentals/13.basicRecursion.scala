//Note:- for recursive methods, u need to specify return type
//else you would encounter "error: recursive method factorial needs result type"
def factorial(n:Int):Int = {
	if(n==0 || n==1) 1
	else n * factorial(n-1)
}

println(factorial(10))

//passing huge number which results to 0 (due to return type being Int and value gets truncated)
println(factorial(100))


//Change type to BigInt and the large numbers will work good
def factorial1(n:BigInt):BigInt = {
	if(n==0 || n==1) 1
	else n * factorial1(n-1)
}

println(factorial1(100))


//passing much larger number which results to java.lang.StackOverflowError
//this requires tail optimized recursion
println(factorial1(100000))
