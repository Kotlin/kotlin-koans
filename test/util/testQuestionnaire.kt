package util

import java.io.File
import java.io.FileReader
import java.io.BufferedReader
import java.io.IOException
import java.util.ArrayList

fun testQuestionnaire(name: String, todo: () -> Nothing) {
    try {
        val results = readFileToString(File("results.txt"))
        if (!results.contains(name)) {
            todo()
        }
    } catch (e: IOException) {
        todo()
    }
}

fun readFileToString(file: File): String {
    val reader = BufferedReader(FileReader(file))
    val list = ArrayList<String>();
    var line = reader.readLine();
    while (line != null) {
        list.add(line!!);
        line = reader.readLine();
    }
    return list.makeString("\n");
}