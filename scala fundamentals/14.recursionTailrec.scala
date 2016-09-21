//Tail Optimized recursion
//The below code will throw error :
//Could not optimize @tailrec annotated method fact: it contains a recursive call not in tail position
//TailRec needs accumulator
import scala.annotation.tailrec

/* @tailrec
def fact(n:BigInt):BigInt = {
	if(n==0 || n==1) 1
	else n * fact(n-1)
}

println(fact(100000)) */

@tailrec
def fact(n:BigInt, acc:BigInt):BigInt = {
	if(n==0 || n==1) acc
	else fact(n-1, acc * n)
}

println(fact(100, 1))

//Give you a very big number
println(fact(10000, 1))

