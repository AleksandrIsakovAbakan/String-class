fun main() {

    /*
    Дана строка «Занятие».
    Вывести на экран символы, составляющие данную строку.
    */
    val stroke = "Занятие"
    println(stroke)
    stroke.forEach { a -> println(a) }
    println()

    /*
    Нужно осуществить проверку номера телефона.
    Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
    Если телефон верно введен, выведите true, иначе false.
    */
    val number = "+79121567275"
    println("Проверка номера телефона: $number - ${phoneNumberVerification(number)}")
    println()

    /*
    Дана строка.
    Вывести символы, составляющие эту строку, но в обратном порядке.
    */
    val strokeTwo = "Вывести символы, составляющие эту строку, но в обратном порядке."
    println(strokeTwo)
    println(strokeTwo.reversed())
    println()

    /*
    Дана строка «kotlin2023course».
    Подсчитать количество содержащихся в ней цифр.
    */
    val strokeThree = "kotlin2023course"
    println(strokeThree)
    println("количество содержащихся в ней цифр: " + numberOfDigitsContained(strokeThree))

}

fun phoneNumberVerification(number: String): Boolean {
    if (number.length < 2) return false
    return number.substring(0, 2) == "+7" && number.length == 12 && number.substring(1).toDoubleOrNull() !== null
}

fun numberOfDigitsContained(str: String): Int {
    var counter = 0
    str.forEach { a -> if (a.isDigit()) counter++ }
    return counter
}