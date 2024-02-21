package edu.uw.ischool.chym2002.quizdroid

interface TopicRepository {
    fun getTopics(): List<Topic>
    fun getTopicByName(name: String): Topic
}