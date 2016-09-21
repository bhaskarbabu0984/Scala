var res = " "

for(a <- 1 to 100) {
	res = res + a
	if(a < 100) res = res + ","
}


println(res)

res = " "

for(a <- 100 to 1 by -1) {
	res = res + a
	if(a > 1) res = res + ","
}


println(res)