package edu.uw.ischool.chym2002.quizdroid

class InMemoryTopicRepository : TopicRepository {
    private val topics: List<Topic> = initTopics()

    private fun initTopics(): List<Topic> {
        return listOf(
            Topic(
                name = "Math",
                shortDescription = "Math Quizzes",
                longDescription = "Mathematical quizzes covering various topics.",
                questions = listOf(
                    Question(
                        questionText = "What is 10 - 7?",
                        options = listOf("1", "2", "3", "4"),
                        correctAnswerIndex = 2
                    ),
                    Question(
                        questionText = "What is 8 / 2?",
                        options = listOf("2", "3", "4", "5"),
                        correctAnswerIndex = 2
                    ),
                    Question(
                        questionText = "What is 5 squared?",
                        options = listOf("10", "15", "25", "50"),
                        correctAnswerIndex = 2
                    ),
                    Question(
                        questionText = "What is the value of pi (π)?",
                        options = listOf("3.14", "3.141", "3.1415", "3.14159"),
                        correctAnswerIndex = 3
                    )
                )
            ),
            Topic(
                name = "Physics",
                shortDescription = "Physics Quizzes",
                longDescription = "Quizzes about physical laws and phenomena.",
                questions = listOf(
                    Question(
                        questionText = "What is the acceleration due to gravity on Earth?",
                        options = listOf("9.8 m/s²", "10 m/s²", "9.8 km/s²", "10 km/s²"),
                        correctAnswerIndex = 0
                    ),
                    Question(
                        questionText = "What is the SI unit of electric charge?",
                        options = listOf("Ampere", "Coulomb", "Ohm", "Volt"),
                        correctAnswerIndex = 1
                    ),
                    Question(
                        questionText = "What is the SI unit of energy?",
                        options = listOf("Joule", "Watt", "Newton", "Coulomb"),
                        correctAnswerIndex = 0
                    )
                )
            ),
            Topic(
                name = "Marvel Super Heroes",
                shortDescription = "Marvel Super Heroes Quizzes",
                longDescription = "Quizzes about Marvel characters and their stories.",
                questions = listOf(
                    Question(
                        questionText = "What is the name of Black Panther's home country?",
                        options = listOf("Wakanda", "Latveria", "Genosha", "Madripoor"),
                        correctAnswerIndex = 0
                    ),
                    Question(
                        questionText = "Who is Loki's adoptive brother?",
                        options = listOf("Thor", "Odin", "Heimdall", "Frigga"),
                        correctAnswerIndex = 0
                    ),
                    Question(
                        questionText = "What is the source of Doctor Strange's powers?",
                        options = listOf("Gamma Radiation", "Super Soldier Serum", "Mystic Arts", "A Spider Bite"),
                        correctAnswerIndex = 2
                    ),
                    Question(
                        questionText = "Who was the original Ant-Man?",
                        options = listOf("Scott Lang", "Hank Pym", "Peter Parker", "Reed Richards"),
                        correctAnswerIndex = 1
                    )
                )
            ),
            Topic(
                name = "Music",
                shortDescription = "Music Quizzes",
                longDescription = "Quizzes about music and artists.",
                questions = listOf(
                    Question(
                        questionText = "Who is the lead vocalist of the band Queen?",
                        options = listOf("Freddie Mercury", "Roger Taylor", "Brian May", "John Deacon"),
                        correctAnswerIndex = 0
                    ),
                    Question(
                        questionText = "Which band released the album 'The Dark Side of the Moon'?",
                        options = listOf("The Beatles", "Pink Floyd", "Led Zeppelin", "The Rolling Stones"),
                        correctAnswerIndex = 1
                    )
                )
            )
        )
    }
    override fun getTopics(): List<Topic> = topics

    override fun getTopicByName(name: String): Topic {
        return topics.find { it.name == name } ?: throw IllegalArgumentException("No such topic")
    }
}