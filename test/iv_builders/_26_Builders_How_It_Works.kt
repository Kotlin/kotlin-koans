package iv_builders

import org.junit.Test as test
import java.nio.file.Files
import java.nio.file.Paths
import iv_builders.builders.todoTask26

class _26_Builders_How_It_Works {
    test fun testQuestionnaire() {
        val results = String(Files.readAllBytes(Paths.get("results.txt")!!))
        if (!results.contains("Builders")) {
            todoTask26()
        }
    }
}