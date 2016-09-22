val nwemp = new Employee("Megha", "Babu")

println(nwemp.fn, nwemp.title)

println(nwemp.fullname)



val empChange = new EmployeeChange("Megha", "Babu")

println(empChange.fn, empChange.title)

println(empChange.fullname)

val newName = empChange.copy("Bhaskar", "Babu")

println(newName.fn)

