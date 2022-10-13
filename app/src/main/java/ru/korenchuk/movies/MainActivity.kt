package ru.korenchuk.movies

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)
        val movie = Movie()

        textView.text = movie.title + " " + movie.year

        button.setOnClickListener {
            textView.text = DefaultMovie.defaultMovie.title + " " + DefaultMovie.defaultMovie.year
        }
    }

}

data class Movie(val title: String = "Какой-то фильм", val year: Int = 2000)

object DefaultMovie {
    val defaultMovie = Movie().copy("Фильм по умолчанию", 1990)
}

