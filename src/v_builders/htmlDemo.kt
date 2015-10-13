package v_builders.demo

import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JLabel
import java.awt.Color
import java.awt.Dimension
import javax.swing.SwingConstants.*
import v_builders.renderProductTable


fun main(args: Array<String>) {
    with (JFrame("Product popularity")) {
        setSize(600, 600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        isVisible = true
    }
}

