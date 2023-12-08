package Calculator

fun main() {
    // 처음에 숫자 2개와 사칙연산 기호 입력
    println("첫번째 숫자를 입력해주세요")
    var num1 = readln().toDouble()
    println("사용할 기호를 입력해주세요 예) +, -, *, /")
    var op = readln()
    println("두번째 숫자를 입력해주세요")
    var num2 = readln().toDouble()

    var c = Calc3() // a는 Calc3 클래스를 명시함
    // +, -, *, / 중 어떤 기호를 입력했는지에 따라 어느 메소드를 사용할것인지 나눔
    while (true){
        if (op == "+") { //만약 op가 +라면 ~~
            println("${num1} 더하기 ${num2} 결과는 ${c.add(num1, num2)}입니다.")
            break
        }
        if (op == "-") { //만약 op가 +라면 ~~
            println("${num1} 빼기 ${num2} 결과는 ${c.sub(num1, num2)}입니다.")
            break
        }
        if (op == "*") { //만약 op가 +라면 ~~
            println("${num1} 곱하기 ${num2} 결과는 ${c.mul(num1, num2)}입니다.")
            break
        }
        if (op == "/") { //만약 op가 +라면 ~~
            println("${num1} 나누기 ${num2} 결과는 ${c.div(num1, num2)}입니다.")
            break
        }
        else {
            println("기호를 다시 입력해주세요")
            op = readln()
            continue
        }
    }
}
class Calc3{
    fun add(num1:Double,num2:Double): Double {
        var a = AddOp2()
        return a.operate(num1,num2)
    }
    fun sub(num1:Double,num2:Double): Double {
        var s = SubOp2()
        return s.operate(num1,num2)
    }
    fun mul(num1:Double,num2:Double): Double {
        var m = MulOp2()
        return m.operate(num1,num2)
    }
    fun div(num1:Double,num2:Double): Double {
        var d = DivOp2()
        return d.operate(num1,num2)
    }
}
class AddOp2 {
    fun operate(num1: Double, num2: Double): Double = (num1 + num2).toDouble()
}
class SubOp2 {
    fun operate(num1: Double, num2: Double): Double = (num1 - num2).toDouble()
}
class MulOp2 {
    fun operate(num1: Double, num2: Double): Double = (num1 * num2).toDouble()
}
class DivOp2 {
    fun operate(num1: Double, num2: Double): Double = (num1 / num2).toDouble()
}
