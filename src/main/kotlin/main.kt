fun main() {

    var amount = 10_000.0
    val commission = 0.75
    val min = 35.0

    if (amount >= min) {
        amount = (amount * commission / 100)
    } else {
        println("Сумма меньше минимального перевода")
    }
    println("Комиссия равна: $amount")
}