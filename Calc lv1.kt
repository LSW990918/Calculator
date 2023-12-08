package Calculator

fun main() {
    println("첫번째 숫자를 입력하시오")
    var num1 = readln().toDouble()
    println("사용할 기호를 입력하시오 예) +, -, *, /")
    var op = readln()
    println("두번째 숫자를 입력하시오")
    var num2 = readln().toDouble()

    var calc = Calculator(num1 , op, num2)
    calc.operation()
}
class Calculator(num1: Double, op:String, num2: Double) {
    var num1:Double = num1
    var op:String = op
    var num2:Double = num2
    init {
    }
    fun operation() {
        println("계산 진행 중!")
        if (op == "+") {
            println("${num1} ${op} ${num2} = ${num1+num2}")
        }
        else if(op == "-" ) {
            println("${num1} ${op} ${num2} = ${num1-num2}")
        }
        else if(op == "*" ) {
            println("${num1} ${op} ${num2} = ${num1*num2}")
        }
        else if(op == "/" ){
            println("${num1} ${op} ${num2} = ${num1/num2}")
        }
    }
}