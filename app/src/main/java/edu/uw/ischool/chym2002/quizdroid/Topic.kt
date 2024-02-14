package edu.uw.ischool.chym2002.quizdroid

data class Topic (
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val questions: List<Question>
)

data class Question (
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)