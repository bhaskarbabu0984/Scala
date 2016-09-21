var xs = List(1,2,3,4)

var res = List[Int]()

for(a <- xs) {
	res = res :+ (a + 1)
}

println(res)

//Fully functional Style
val xs2 = List(1,2,3,4)

val res2 = for(a <- xs) yield(a+1)

println(res2)