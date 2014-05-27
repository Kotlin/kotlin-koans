package util

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.NoSuchFileException

test fun testQuestionnaire(name: String, todo: () -> Nothing) {
    try {
        val results = String(Files.readAllBytes(Paths.get("results.txt")!!))
        if (!results.contains(name)) {
            todo()
        }
    } catch (e: NoSuchFileException) {
        todo()
    }
}
