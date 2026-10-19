// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, text: String="", char: Char='X'): String {
    if (text.isEmpty()) {
        return document
    }

    val redacted = StringBuilder(document)
    var start = document.indexOf(text)

    if (start == -1) {
        return document
    }
    while (start != -1) {
        for (n in text.indices) {
            redacted[start+n] = char
        }
        start = document.indexOf(text, start+text.length)
    }
    return redacted.toString()
}