package util.questions

import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JRadioButton
import javax.swing.JOptionPane
import javax.swing.ButtonGroup
import javax.swing.JPanel
import javax.swing.SwingConstants
import javax.swing.BoxLayout
import java.awt.Component
import java.util.ArrayList
import java.io.PrintWriter
import java.io.FileWriter
import java.io.BufferedWriter
import java.io.IOException

class QuestionsFrame(name: String): JFrame("$name Questions") {
    val questionLabel = JLabel("", SwingConstants.LEFT)
    val answerButtons = ArrayList<AnswerButton>()
    val buttonGroup: ButtonGroup

    class AnswerButton(val answer: Answer, val answerText: String) : JRadioButton("$answer. $answerText") {}

    {
        setSize(600, 400)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        val panel = JPanel()
        panel.setLayout(BoxLayout(panel, BoxLayout.Y_AXIS))
        panel.setAlignmentX(Component.LEFT_ALIGNMENT)

        panel.add(questionLabel)

        buttonGroup = ButtonGroup()
        for (answer in Answer.values()) {
            val button = AnswerButton(answer, "")
            buttonGroup.add(button)
            answerButtons.add(button)
            panel.add(button)
        }
        add(panel)
        setVisible(true)
    }

    fun setQuestion(index: Int, question: Question) {
        questionLabel.setText("${index + 1}. ${question.questionText}".wrapInHtml())
        buttonGroup.clearSelection()
        for (answerButton in answerButtons) {
            val answer = answerButton.answer
            answerButton.setText("${answer}. ${question.answers[answer]}".wrapInHtml())
        }
    }

    fun setAnswerListener(answerListener: (Answer) -> Unit) {
        for (button in answerButtons) {
            button.getActionListeners().forEach { button.removeActionListener(it) }
            button.addActionListener {
                actionEvent ->
                answerListener((actionEvent.getSource() as AnswerButton).answer)
            }
        }
    }
}

fun doQuestionnaire(name: String, vararg questions: Question) {
    val frame = QuestionsFrame(name)

    val iterator = questions.stream().withIndices().iterator()

    fun processQuestion(questionWithIndex: Pair<Int, Question>) {
        val (index, question) = questionWithIndex
        frame.setQuestion(index, question)
        frame.setAnswerListener {
            answer ->
            if (answer == Keys[name, index]) {
                JOptionPane.showMessageDialog(frame, "The answer '${answer}' is correct.")
                if (iterator.hasNext()) {
                    processQuestion(iterator.next())
                }
                else {
                    recordResults(name)
                    frame.dispose()
                }
            } else {
                JOptionPane.showMessageDialog(frame, "The answer '${answer}' is incorrect.")
            }
        }
    }

    if (!iterator.hasNext()) return
    processQuestion(iterator.next())
}

fun String.wrapInHtml() = "<html>${escapeHtml()}</html>"

fun String.escapeHtml() =
        this
                .replace("&", "&amp;")
                .replace(" ", "&nbsp;")
                .replace("\"", "&quot;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\n", "<br/>")

fun recordResults(name: String) {
    try {
        val out = PrintWriter(BufferedWriter(FileWriter("results.txt", true)));
        out.println(name);
        out.close();
    } catch (e: IOException) {
    }
}