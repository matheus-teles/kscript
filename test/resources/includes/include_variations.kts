println("Let's resolve includes!")

//INCLUDE rel_includes/include_1.kt
//INCLUDE ./rel_includes//include_2.kt

@file:Include("../includes/include_3.kt")
@file:Include("../includes/include_4.kt")

include_1()
include_2()
include_3()
include_4()



println("wow, so many includes")
