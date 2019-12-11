package at.fh.swengb.guertler

object MovieRepository {
    private val movies: List<Movie>

    init {
        val lecturerIlles = Person("Sanja Illes", "20.04.2000")
        val lecturerBloder = Person("Lukas Bloder","10.05.1945")
        movies = listOf(
            Movie("0",
                "Title 0",
                "09.10.2019",
                "XYC",
                MovieGenre.Action,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            ),
            Movie("1",
                "Title 0",
                "09.10.2019",
                "ABZ",
                MovieGenre.Action,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}


