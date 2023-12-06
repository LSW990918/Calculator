package Calculator

fun main() {
    println("첫번째 숫자를 입력해주세요")
    var num1 = readln().toDouble()
    println("사용할 기호를 입력해주세요 예) +, -, *, /")
    var op = readln()
    println("두번째 숫자를 입력해주세요")
    var num2 = readln().toDouble()


    var calc = Calculator3(num1, op,  num2)
    calc.operation()


}
open class Calculator3 (num1: Double, op:String, num2: Double) {
    var num1 = num1
    var op = op
    var num2 = num2
    init {
    }
    open fun operation() {
    while(true){
        if (op == "+") {
            var add = AddOperation(num1, op, num2)
            add.operation()
            break
        }
        if (op == "-") {
            var substract = SubstractOperation(num1, op, num2)
            substract.operation()
            break
        }
        if (op == "*") {
            var multiply = MultiplyOperation(num1, op, num2)
            multiply.operation()
            break
        }
        if (op == "/") {
            var divide = DivideOperation(num1, op, num2)
            divide.operation()
            break
        }
        else {
            println("기호를 다시 입력해주세요!")
            op = readln()
            continue
        }

}

    }
}
class AddOperation (num1: Double, op:String, num2: Double) : Calculator3(num1,op,num2) {
    override fun operation() {
        println("${num1} 더하기 ${num2} 결과는 ${num1 + num2} 입니다.")
    }
}
class SubstractOperation (num1: Double, op:String, num2: Double) : Calculator3(num1,op,num2) {
    override fun operation() {
        println("${num1} 빼기 ${num2} 결과는 ${num1 - num2} 입니다.")
    }
}
class MultiplyOperation (num1: Double, op:String, num2: Double) : Calculator3(num1,op,num2) {
    override fun operation() {
        println("${num1} 곱하기 ${num2} 결과는 ${num1 * num2} 입니다.")
    }
}
class DivideOperation (num1: Double, op:String, num2: Double) : Calculator3(num1,op,num2) {
    override fun operation() {
        println("${num1} 나누기 ${num2} 결과는 ${num1 / num2} 입니다.")
    }
}