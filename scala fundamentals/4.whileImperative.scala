var a = 100

var res = " "

while( a > 0) {
	res = res + a
	if(a > 1) res = res + ","
	a = a - 1
}

println(res)