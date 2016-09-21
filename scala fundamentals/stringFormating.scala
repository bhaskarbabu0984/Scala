//format string in imperative style
val str = String.format("This is %s", "My country")

println(str)

//format string in functional style
val str2 = "This is %s".format("My Country!!!")

println(str2)

//Multiple substitution
val str3 = "You need to take medicine %s, %s and %s".format("Morning", "Afternoon", "Night")

println(str3)

//Multiple substitution in reverse Order
val str4 = "You need to take medicine %3$s, %2$s and %1$s".format("Morning", "Afternoon", "Night")

println(str4)

//Lets do a time example using String Format
import java.util.Date

val now = new Date()
println("We will be eating lunch at %1$tB, %1$te in the year %1$tY".format(now))

//use printf instead of println
printf("We will be eating lunch at %1$tB, %1$te in the year %1$tY again !!\n", new Date())


//Formatting Smart string

val song3 = """When %1$s was %2$s
	@ %1$s would listen to the radio
	@ Waiting for my favorite Song
	@ Its yesterday once more""".stripMargin('@').format("I", "young")
			
println(song3)
