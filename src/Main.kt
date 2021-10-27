fun main () {

    val litter = mutableListOf<Char>()
    val step = 2
    val firstLitter : Char = 'A'
    val lastLitter : Char = 'Z'
    var cod = firstLitter.code

    if (firstLitter.code < lastLitter.code) {

       do {
           litter.add(cod.toChar())
           cod += 1
       }
       while (litter[litter.lastIndex]!= lastLitter)


        for (i in 0..litter.lastIndex) {
            if (((i + 1) % step) == 0) println(litter[i])
        }
    }

    else println("The entered data is incorrect")




}