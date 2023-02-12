/*
data class Study(
    var name: String? = null,
    val age: Int = 0,
    val addr: String = "Strign"
) {
    constructor(
        Study:
    )
}
*/


val list3 : ArrayList<Any> = arrayListOf(1,2,3);


fun helloworld() : Unit {
    print("helloworld");
}

/*
*  함수 선언 시 뒤에 선언 변수 뒤
* */
fun foo(a : Int , b : Int) : Int {
    return a + b;
}

fun minus(a : Int , b : Int) : Int {
    return a - b;
}


/*
* var : variable (변수)
* val : value (상수)

* */
var changeValue : String = "TEST"
val notChangeValue : String = "AB"
var c = "10" // 자동 String 인식
var d = 10
var nullValue = String // null 데이터 생성 (자료형 명시)

fun chiHwan(){
    val valueCheck = "DOLLER SYMBOL"
    print("Value Check : ${notChangeValue}");
    print("Value Check : \$ ${notChangeValue}");
}


fun joKwon(a : Int , b : Int) = if(a > b) a else b

fun whenJoKwan(score : Int){
    when(score) {
        0 -> println("0")
        1 -> println("1")
        2,3,4 -> println("2")
        else -> println("OTHER")
    }
}
fun whenJoKwan2(score : Int){
    when(score) {
        in 0..2 -> println("0")
        in 1..10 -> println("1")
        in 2..20 -> println("2")
        else -> println("OTHER")
    }
}


/*
* Array vs List
* Array 메모리 생성
* List 동적 생성
*
* */

fun array(){
    val array : Array<Int> = arrayOf(1,2,3);
    val list : List<Int> = listOf(1,2,3);

    val array2 : Array<Any> = arrayOf(1,"2",3f)
    val list2 : List<Any> = listOf(1,"2",3L)

    // MUTALBLEArray : 변경이 가능한 어레이
    // arraylist 사용
    val list3 : ArrayList<Any> = arrayListOf(1,2,3);

    val add = list3.add(20)

    list3[2] = 10;
}


fun forMoon(list : ArrayList<Any>){

    // 리스트
    for (string in list) {
        print(string);
    }

    var sum = 0;

    // 정해진 사이즈
    for(i in 1..10){
        println("10까지 돌기 ${i}")
    }

    // 범위내 숫자 에서 2씩 증가
    for(i in 1..10 step 2){
        sum += i
        println("2씩 증가 ${i}");
    }

    // 10에서 1씩 감소 역 반복
    for(i in 10 downTo 1){
        sum += i
        println("역순 1 감소 ${i}");
    }

    // 100을 제외한 값
    for(i in 10 until 100){
        sum += i
        println("100 제외 감소 ${i}");
    }

}

// NonNull NotNull

/*
*
*
* */
fun nullOrNotNull(){

    var test : String? = null;
    var test2 = "String"
    var check : String? = test?.toUpperCase()
    var check2  = test2.toUpperCase()

    val firstName = "PARK"
    val lastName : String? = "S";
    println("${firstName} ${lastName?:"SDtr"}")

    println(check);
    println(check2);

}

/*
*  NULL 이 들어올수 있지만
*  !! 두개로 문법 이슈 무시
* */
fun ignoreNull(str : String?){


    var test : String = str!!


}

/*
*  let null 체크를 한번더 해서 필요한 경우에 조건 처리
*
* */
fun letFun(){

    val email : String? = "dall011@naver.com"
    val emailNull : String? = null

    email?.let {
        println("email : ${email}")
    }
    emailNull?.let {
        print("emailNull : ${emailNull}")
    }

}

fun main(args: Array<String>) {

/*    changeValue = "ab"

    println(changeValue)
    print(notChangeValue)

    print(foo(4, 78))

    chiHwan()


    println(joKwon(6,9))*/


/*    whenJoKwan(7);

    forMoon(list3);*/



//    nullOrNotNull();


//    letFun();


    val FirstClass = FirstClass()
    FirstClass.logChekc()

    val consTest = consTest("park kyung doong")
    consTest.logChekc();

    val consTest2 = consTest2("park kyung doong")
    consTest2.logChekc();

    val consTest22 = consTest2()
    consTest22.logChekc();

}

