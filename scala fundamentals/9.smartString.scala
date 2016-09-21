//Old classical way
val song = "When I was young \n" +
			"I would listen to the radio \n" +
			"Waiting for my favorite Song"
			
println(song)

//Smart string in scala

val song2 = """#######When I was young
	I would listen to the radio
	Waiting for my favorite Song"""
			
println(song2)


val song3 = """--------When I was young
	@ I would listen to the radio
	@ Waiting for my favorite Song
	@ Its yesterday once more""".stripMargin('@')
			
println(song3)