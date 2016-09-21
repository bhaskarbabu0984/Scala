var a = 10

var res = " "

do {
	res = res + a
	if(a > 1) res = res + ","
	
	a =  a - 1
} while(a > 0)

println(res)