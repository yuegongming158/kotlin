fun foo(o: Any, c: Char){ }
fun foo(s: String, i: Int){ }

fun bar(sss: String) {
    foo(<caret>)
}

//ELEMENT: sss
