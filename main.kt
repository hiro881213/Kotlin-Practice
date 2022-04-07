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

    println("セーフコール演算子")

    var a3:String? = "foo"
    println(a3?.length)

    var b3: String? = null
    println(b3?.length ?: 0)

    var c3: String? = "foo"
    println(c3!!.length)

    println("型変換")

    var a4: Float  = 1.2f
    var b4: Double = 10.0

    println("toデータ型メソッド")
    var a5 = 10
    var b5:Long = a5.toLong()

    println("配列の定義")

    // 配列を定義する
    var arrA1 = arrayOf(1, 2, 3)    // [1, 2, 3]
    println("[${arrA1[0]} ${arrA1[1]} ${arrA1[2]}]")

    println("配列の型指定")

    // 配列の中身をInt型に指定
    var arrA2 = intArrayOf(4, 5, 6) // [4, 5, 6]
    println("[${arrA2[0]} ${arrA2[1]} ${arrA2[2]}]")

    println("空の配列作成")
    var arrA3: Array<String?> = arrayOfNulls(3)
    println("[${arrA3[0]} ${arrA3[1]} ${arrA3[2]}]")



}