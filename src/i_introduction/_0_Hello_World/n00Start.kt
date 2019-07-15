package i_introduction._0_Hello_World

import util.TODO
import util.doc0

/*

Note that this project is obsolete.
For the last version of Koans, check either
online version
  - https://play.kotlinlang.org/koans/overview
or
the course in the EduTools plugin
 - https://www.jetbrains.com/help/education/learner-start-guide.html?section=Kotlin%20Koans
 - https://www.jetbrains.com/help/education/install-edutools-plugin.html?section=IntelliJ%20IDEA

The task content can be found at https://github.com/Kotlin/kotlin-koans-edu.

 */

fun todoTask0(): Nothing = TODO(
    """
        Task 0.

        Read README.md to learn how to work with this project and check your solutions.

        Using 'documentation =' below the task description you can open the related part of the online documentation.
            Press 'Ctrl+Q'(Windows) or 'F1'(Mac OS) on 'doc0()' to call the "Quick Documentation" action;
            "See also" section gives you a link.
            You can see the shortcut for the "Quick Documentation" action used in your IntelliJ IDEA
            by choosing "Help -> Find Action..." (in the top menu), and typing the action name ("Quick Documentation").
            The shortcut in use will be written next to the action name.

        Using 'references =' you can navigate to the code mentioned in the task description.

        Let's start! Make the function 'task0' return "OK". Note that you can return expression directly.
    """,
    documentation = doc0(),
    references = { task0(); "OK" }
)

fun task0(): String {
    return todoTask0()
}