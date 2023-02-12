import java.time.LocalDate


/*
*
* 초기화 데이터 업는 클래스
* */
class FirstClass {

    fun logChekc() {
        println("TEST success")
    }

}

/*
*
* 초기화에 필요한 생성자가 필요한 경우
* */

class consTest constructor(name : String) {

    val Name = name
    fun logChekc() {
        println("${Name} success")
    }

}

/*
*
* 초기화에 필요한 생성자가 필요한 경우
* default 값으로 값 안넣어도 생성 넣어도 생성
* */
class consTest2 constructor(name : String = "아무거나 만들어") {
    val Name = name
    fun logChekc() {
        println("${Name} success")
    }
}

/*
*
* 초기화에 필요한 생성자가 필요한 경우
* default 값으로 값 안넣어도 생성 넣어도 생성
* */
class consTest2 constructor(name : String = "아무거나 만들어") {
    val Name = name
    fun logChekc() {
        println("${Name} success")
    }
}

/*
class car (
    name : String,
    price : Int,
    date : LocalDate
        ){
    constructor(name : String, price :Int, date: LocalDate)

}*/
