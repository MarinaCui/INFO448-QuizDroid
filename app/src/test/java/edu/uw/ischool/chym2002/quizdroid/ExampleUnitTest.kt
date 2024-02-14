package edu.uw.ischool.chym2002.quizdroid

import org.junit.Test
import org.junit.Before
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private lateinit var repo: InMemoryTopicRepository

    @Before
    fun setUp() {
        repo = InMemoryTopicRepository()
    }
    @Test
    fun getTopicsTest() {
        val topics = repo.getTopics()
        assertEquals(4, topics.size)
    }

    @Test
    fun getTopicByNameTest() {
        val topic = repo.getTopicByName("Music")
        assertEquals("Music", topic.name)
    }
}