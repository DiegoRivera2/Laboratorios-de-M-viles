package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel

class MovieViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

    private var nameTextView = ItemView.findViewById<TextView>(R.id.nameMovie)
    private var qualificationTextView = ItemView.findViewById<TextView>(R.id.qualificationMovie)
    private var movieImage = ItemView.findViewById<ImageView>(R.id.imageMovie)


    fun bind(movie : MovieModel){

        nameTextView.text = movie.name
        qualificationTextView.text = movie.qualification

    }

}

