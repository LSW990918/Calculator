package Calculator

fun main() {
    println("첫번째 숫자를 입력하시오")
    var num1 = readln().toDouble()
    println("사용할 기호를 입력하시오 예) +, -, *, /")
    var op = readln()
    println("두번째 숫자를 입력하시오")
    var num2 = readln().toDouble()

    while (true) {
        if (op == "+") {
            println(num1 + num2)
            break
        } else if (op == "-") {
            println(num1 - num2)
            break
        } else if (op == "*") {
            println(num1 * num2)
            break
        } else if (op == "/") {
            println(num1 / num2)
            break
        } else {
            println("기호를 다시 입력해주세요")
            op = readln()
            continue
        }
    }
}