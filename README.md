Kotlin Koans
===========

Kotlin Koans are a series of exercises to get you familiar with the Kotlin Syntax. 
Each exercise is created as a failing unit test and your job is to make it pass. 

#### How to build and run tests

Working with the project using Intellij IDEA or Android Studio:

1. Import the project as Gradle project.
2. To build the project and run tests use 'test' task on Gradle panel. 

You can also build the project and run all tests in terminal:
```
./gradlew test
```
Here https://www.jetbrains.com/help/idea/gradle.html you can read how to work with Gradle projects in IntelliJ IDEA.

#### How to work with Koans using this project

You have 42 tasks to do. 
Each task lives in its function: from `task0` to `task41`.

You regularly have to change the function `taskN` by replacing its body (which starts out as the function invocation `todoTaskN()`), with the correct code according to the problem.
The function `todoTaskN()` throws an exception, so you have to replace that invocation with meaningful code.

Using `documentation` argument you can open the related part of Kotlin online documentation.
Press `F1` (Quick Documentation) on `docN()`, then "See also" section gives you a link.

Using `references` argument you can navigate and see the code mentioned in the task description.

The repository has two branches, `master` which contains the exercises for you to do and `resolutions` which contains the resolved exercises. 
Make sure you don’t cheat!

#### Other ways to solve Koans

Note that you can solve the similar tasks using Educational Plugin or online:

- Educational Plugin https://blog.jetbrains.com/kotlin/2016/03/kotlin-educational-plugin
- online version of koans http://try.kotl.in

The koans tasks for web-demo and educational plugin can be found here: https://github.com/Kotlin/kotlin-koans-edu.
