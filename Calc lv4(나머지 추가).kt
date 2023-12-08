package Calculator

fun main() {
    // 처음에 숫자 2개와 사칙연산 기호 입력
    println("첫번째 숫자를 입력해주세요")
    var num1 = readln().toDouble()
    println("사용할 기호를 입력해주세요 예) +, -, *, /")
    var op = readln()
    println("두번째 숫자를 입력해주세요")
    var num2 = readln().toDouble()


    var a = Calc() // a는 Calculator4 클래스를 명시함
    // +, -, *, / 중 어떤 기호를 입력했는지에 따라 어느 메소드를 사용할것인지 나눔
    while (true){
        if (op == "+") { //만약 op가 +라면 ~~
            a.op(AddOp(),num1,num2) //Calculator4의 AddOperation2()를 실행하고 num1 num2를 넣어줌)
            break
        }
        if (op == "-") {
            a.op(SubOp(),num1,num2)
            break
        }
        if (op == "*") {
            a.op(MulOp(),num1,num2)
            break
        }
        if (op == "/") { //나머지의 유무에따라 달라짐
            if (num1%num2==0.0){
                a.op(DivOp(),num1,num2)
            } else {
                a.op(RemOp(),num1,num2)
            }
            break
        }
        else {
            println("기호를 다시 입력해주세요")
            op = readln()
            continue
        }
    }

}
class Calc{
    fun op(operation: AbstOp, num1: Double, num2: Double) {
        //15줄에서 AddOperation2가 실행가능했던 이유가 operateC는 AbstractOperation를 포함하고있기때문
        operation.operate(num1,num2) //윗줄과 아랫줄 모두 오퍼레이션이 들어감
    }
}
abstract class AbstOp {  //추상클래스
    abstract fun operate(num1: Double, num2: Double)//아래 AddOperation2 와 공통되는 부분만 메소드에 표시해놓았다.


}
class AddOp : AbstOp() {  //AddOperation2는 AbstractOperation를 상속받고있음
    override fun operate(num1: Double, num2: Double) { //내가 기호로 +를 입력했다면 아래의 문구가 출력된다
        println("${num1} 더하기 ${num2} 결과는 ${num1+num2} 입니다.")
    }
}
class SubOp : AbstOp() {  //AbstractOperation를 상속받고있음
    override fun operate(num1: Double, num2: Double) { //내가 기호로 -를 입력했다면 아래의 문구가 출력된다
        println("${num1} 빼기 ${num2} 결과는 ${num1 - num2} 입니다.")
    }
}
class MulOp : AbstOp() {  //AbstractOperation를 상속받고있음
    override fun operate(num1: Double, num2: Double) { //내가 기호로 *를 입력했다면 아래의 문구가 출력된다
        println("${num1} 곱하기 ${num2} 결과는 ${num1 * num2} 입니다.")
    }
}
class DivOp : AbstOp() {  //AbstractOperation를 상속받고있음
    override fun operate(num1: Double, num2: Double) { //내가 기호로 /를 입력했다면 아래의 문구가 출력된다
        println("${num1} 나누기 ${num2} 결과는 ${num1 / num2} 입니다.")
    }
}
class RemOp : AbstOp() {
    override fun operate(num1: Double, num2: Double) {
        println("${num1} 나누기 ${num2} 결과는 ${(num1 / num2).toInt()}..나머지${(num1 % num2).toInt()} 입니다.")
    }
}