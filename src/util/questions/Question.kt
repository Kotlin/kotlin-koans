package util.questions

class Question(formattedQuestionText: String, vararg answers: Pair<Answer, String>) {
    val answers = mapOf(*answers)
    val questionText = formattedQuestionText.removeIndents()
}

enum class Answer {
    a b c
}

fun String.removeIndents(): String {
    val lines = split("\n")
    val indent = lines.filter { !it.isEmpty() }.map { s -> s.size - s.trimLeading().size }.min()!!
    return split("\n").map {
        s ->
        if (!s.isEmpty()) s.substring(indent) else s
    }.makeString("\n").trim()
}
