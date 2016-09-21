var xs = List(1,2,3,4)

var res = List[Int]()

for(a <- xs) {
	res = res :+ (a + 1)
}

println(res)