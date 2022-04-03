/**
 * 
 * Main関数
 * 
 */
fun main() {
    println("Hello World!")

    var a = 1000
    var b = 1_000
    var c = 0x3E8


    println("変数の利用")
    println(a)
    println(b)
    println(c)

    println("型サフィックス")
    var d = 10L
    var e = 10F

    println(a::class)
    println(d::class)
    println(e::class)

}