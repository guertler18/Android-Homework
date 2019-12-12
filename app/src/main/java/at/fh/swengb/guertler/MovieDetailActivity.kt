package at.fh.swengb.guertler

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA";
        val ADD_OR_EDITED_RESULT = 1;
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)
        if (movieId != null) {
            if (resultCode == Activity.RESULT_OK && requestCode == ADD_OR_EDITED_RESULT) {
                titel_detail.text = MovieRepository.movieById(movieId)?.title.toString()
                director_content_detail.text = MovieRepository.movieById(movieId)?.director!!.name
                actors_detail_content.text =
                    MovieRepository.movieById(movieId)?.actors!!.map { it.name }.joinToString()
                genre_detail_content.text = MovieRepository.movieById(movieId)?.genre.toString()
                item_movie_avg_rating_bar.rating =
                    MovieRepository.movieById(movieId)?.ratingAverage()!!.toFloat()
                item_movie_avg_rating_value.text =
                    MovieRepository.movieById(movieId)?.ratingAverage().toString()
                item_movie_rating_count.text =
                    MovieRepository.movieById(movieId)?.reviews!!.size.toString()
                release_detail_content.text = MovieRepository.movieById(movieId)?.release.toString()
                plot_detail_content.text = MovieRepository.movieById(movieId)?.plot.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)



        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)


        //LessonRepository.lessonById(lessonId)?.name

      //  titel_detail.text = MovieRepository.movieById()

        if(movieId != null) {
            titel_detail.text = MovieRepository.movieById(movieId)?.title.toString()
            director_content_detail.text = MovieRepository.movieById(movieId)?.director!!.name
            actors_detail_content.text =
                MovieRepository.movieById(movieId)?.actors!!.map { it.name }.joinToString()
            genre_detail_content.text = MovieRepository.movieById(movieId)?.genre.toString()
            item_movie_avg_rating_bar.rating =
                MovieRepository.movieById(movieId)?.ratingAverage()!!.toFloat()
            item_movie_avg_rating_value.text =
                MovieRepository.movieById(movieId)?.ratingAverage().toString()
            item_movie_rating_count.text =
                MovieRepository.movieById(movieId)?.reviews!!.size.toString()
            release_detail_content.text = MovieRepository.movieById(movieId)?.release.toString()
            plot_detail_content.text = MovieRepository.movieById(movieId)?.plot.toString()
        }
        else
        {
            Toast.makeText(this, "No movie ID given", Toast.LENGTH_SHORT).show()
           // finish()
        }

        open_movie_review.setOnClickListener {
            val intent = Intent(this, MovieReviewActivity::class.java)
            intent.putExtra("PassedID", movieId)

            intent.putExtra(MovieListActivity.EXTRA_MOVIE_ID, it.id)
            startActivityForResult(intent, ADD_OR_EDITED_RESULT)
        }

    }
}
