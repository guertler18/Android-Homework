package at.fh.swengb.guertler

object MovieRepository {
    private val movies: List<Movie>

    init {
        val person1 = Person("Benjamin TRopper", "20.04.2000")
        val person2 = Person("Henri Pajuni", "20.04.2000")
        val person3 = Person("Marco Holzer", "20.04.2000")
        val person4 = Person("Christeline Eder", "20.04.2000")
        val person5 = Person("Markus Bauer", "20.04.2000")
        val person6 = Person("Luca Verbitsch", "20.04.2000")
        val person7 = Person("Marlene Dirnberger", "20.04.2000")
        val person8 = Person("Sanja Illes", "20.04.2000")
        val person9 = Person("Lukas Bloder","10.05.1989")
        val person10 = Person("Quentin Terentino","10.05.1970")
        val person11 = Person("Leonadro Decaprio","30.06.1978")
        val person12 = Person("Christopher Nolan","30.06.1978")
        val person13 = Person("Jojo Tonhaus","30.06.1978")
        val person14 = Person("Dorsen Tunnelblick","30.06.1978")
        val person15 = Person("Haaagn Schatz","30.06.1978")




        movies = listOf(
            Movie("0",
                "Joker",
                "2019",
                "A socially inept clown for hire - Arthur Fleck aspires to be a stand up comedian among his small job working dressed as a clown holding a sign for advertising. He takes care of his mother- Penny Fleck, and as he learns more about his mental illness, he learns more about his past.",
                MovieGenre.Action,
                person1,
                listOf( person2, person3 ),
                mutableListOf()
            ),
            Movie("1",
                "Pulp Fiction",
                "1994",
                "Pulp Fiction is actually three (or four) stories (depending on how one interprets the layout of the film) set around the world, activities and relationships of an L.A criminal gang boss called Marsellus Wallace, and two of his enforcers called Jules Winnfield and Vincent Vega, during a very prolific week in their lives ",
                MovieGenre.Action,
                person10,
                listOf( person5, person9, person10),
                mutableListOf()
            ) ,
        Movie("1",
            "Pulp Fiction",
            "1994",
            "Pulp Fiction is actually three (or four) stories (depending on how one interprets the layout of the film) set around the world, activities and relationships of an L.A criminal gang boss called Marsellus Wallace, and two of his enforcers called Jules Winnfield and Vincent Vega, during a very prolific week in their lives ",
            MovieGenre.Action,
            person10,
            listOf( person5, person10, person3 ),
            mutableListOf()

        ) ,
        Movie("2",
            "Once Upon a Time in Hollywood",
            "2019",
            "Set in 1969 Los Angeles, the film follows an actor and his stunt double, as they navigate the changing film industry, and features multiple storylines in a modern fairy tale tribute to the final moments of Hollywood's golden age",
            MovieGenre.Action,
            person10,
            listOf( person1, person8, person2 ),
            mutableListOf()

        ) ,
        Movie("3",
            "The Wolf of Wallstreet",
            "2014",
            "Introduced to life in the fast lane through stockbroking, Jordan Belfort takes a hit after a Wall Street crash. He teams up with Donnie Azoff, cheating his way to the top as his relationships slide.",
            MovieGenre.Action,
            person11,
            listOf( person11, person6, person4 ),
            mutableListOf()
        ) ,
        Movie("4",
            "Interstellar",
            "2013",
            "n Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole.",
            MovieGenre.Action,
            person12,
            listOf( person14, person13, person6 ),
            mutableListOf()
        ) ,
        Movie("5",
            "Inception",
            "2010",
            "Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.",
            MovieGenre.Action,
            person12,
            listOf( person11, person6, person10),
            mutableListOf()
        ) ,
        Movie("6",
            "Matrix",
            "1997",
            "Thomas Anderson, a computer programmer, is led to fight an underground war against powerful computers who have constructed his entire reality with a system called the Matrix.",
            MovieGenre.Action,
            person14,
            listOf(person5, person15, person3 ),
            mutableListOf()
        ) ,
        Movie("7",
            "Ghost Rider",
            "2005",
            "Stunt motorcyclist Johnny Blaze decides to give up his soul to become the Ghost Rider and fight against Blackheart, the son of Mephistopheles, the devil himself.",
            MovieGenre.Action,
            person6,
            listOf( person12, person3, person7, person4 ),
            mutableListOf()
        ) ,
        Movie("8",
            "Fear and Loathing in Las Vegas",
            "1997",
            "Raoul is a journalist who along with his lawyer head to Las Vegas to cover the mint 400 motorcycle race. Soon pleasure overtakes work and they indulge in a variety of recreational drugs.",
            MovieGenre.Action,
            person14,
            listOf( person13, person15, person14),
            mutableListOf()
        ) ,
        Movie("9",
            "Dude, Where's My Car?",
            "2000",
            "Two friends, Jesse and Chester, attempt to discover what happened the previous night as they cannot find their car. Along the way, they stumble upon a host of crazy characters",
            MovieGenre.Action,
            person1,
            listOf( person1, person5, person8 ),
            mutableListOf()
        ) ,
        Movie("10",
            "The Hangover",
            "2009",
            "For a bachelor party, three best men and the groom take a road trip to Las Vegas. They wake up the next morning to realise that not only have they lost the groom but also have no recollection.",
            MovieGenre.Action,
            person8,
            listOf( person10, person6 ),
            mutableListOf()
        ) ,
        Movie("11",
            "Inglourious Bastards",
            "2011",
            "A few Jewish soldiers are on an undercover mission to bring down the Nazi government and put an end to the war. Meanwhile, a woman wants to avenge the death of her family from a German officer.",
            MovieGenre.Action,
            person10,
            listOf( person11, person10, person13 ),
            mutableListOf()
        ) ,
        Movie("12",
            "Django Unchained",
            "2013",
            "When Django, a slave, is freed, he joins forces with a bounty hunter to rescue his wife, who has been captured by a hard-hearted plantation owner.",
            MovieGenre.Action,
            person10,
            listOf( person11, person2, person3 ),
            mutableListOf()
        ) ,
        Movie("13",
            "12 Years a Slave",
            "2010",
            "Solomon Northup, a free African-American, is promised a fortnightly job by Brown and Hamilton. However, after arriving in Washington DC, he realises that he has been sold into slavery.",
            MovieGenre.Action,
            person1,
            listOf( person2, person3, person9 ),
            mutableListOf()
        ) ,
        Movie("14",
            "Evil Bong",
            "1994",
            "Evil Bong is a 2006 horror comedy film directed by Charles Band. The plot is about a group of college stoners who smoke from a sentient, malevolent bong unaware that it traps the toker in a surreal strip-club with killer stripper",
            MovieGenre.Action,
            person11,
            listOf( person11, person7, person4 ),
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


