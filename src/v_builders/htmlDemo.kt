package v_builders.demo

import v_builders.renderProductTable
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JScrollPane
import javax.swing.SwingConstants.CENTER


fun main(args: Array<String>) {
    with (JFrame("Product popularity")) {
        setSize(600, 600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        isVisible = true
    }
}

