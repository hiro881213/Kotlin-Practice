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

    println("文字列リテラル")

    var msg1 = "こんにちは。¥n私はKotlinを学んでいます"
    var msg2 = """こんにちは。
私はKotlinを学んでいます"""
    var msg3 = """こんにちは。
                |私はKotlinを学んでいます""".trimMargin()

    println(msg1)
    println(msg2)
    println(msg3)

    println("文字列テンプレート")


    var data = arrayOf(1,2,3)
    println("配列dataの先頭の値は、${data[0]}で要素数は${data.size}です")
    println("1＋1は、${1+1}です。")

    println("null許容型")

    var foo: String? = "foo"
    foo = null

    println(foo)

    var a2: Int  = 10000
    var b2: Int  = a2
    var c2: Int? = a2

    println("Boxing")
    println(a2 == b2)
    println(a2 === b2)
    println(a2 == c2)
    println(a2 === c2)

}