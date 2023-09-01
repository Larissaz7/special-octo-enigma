fun main() {

 fun getBirthday() : Int{
        print("\n Enter your birthday: ")
        return readLine()?.toIntOrNull() ?: 1
    }


    var fortune1 :String
    for(i in 1..10) {
        fortune1 = getFortune(getBirthday())
        println("\n Your fortune is: $fortune1")
    }
}

fun getFortune(birthday: Int): String {
    return when (birthday) {
        in 1..5 -> "You will have a great day!"
        in 6..10 -> "Things will go well for you today."
        in 11..15 -> "Be humble and all will turn out well."
        in 16..20 -> "Today is a good day for exercising restraint."
        in 21..25 -> "Treasure your friends because they are your greatest fortune."
        in 26..31 -> "Take it easy."
        else -> "Invalid birthday."
    }
}



