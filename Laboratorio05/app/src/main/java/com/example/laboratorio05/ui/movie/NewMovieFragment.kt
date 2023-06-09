package com.example.laboratorio05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05.R
import com.example.laboratorio05.data.description
import com.example.laboratorio05.data.model.MovieModel

class NewMovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    private lateinit var nameEditText: EditText
    private lateinit var categoryEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var qualificationEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        submitButton.setOnClickListener {
            addMovie()
        }

    }

    private fun bind(){
        nameEditText = view?.findViewById(R.id.name)!!
        categoryEditText = view?.findViewById(R.id.Category)!!
        descriptionEditText = view?.findViewById(R.id.Description)!!
        qualificationEditText = view?.findViewById(R.id.Calification)!!
        submitButton = view?.findViewById(R.id.submitBtn)!!

    }

    private fun addMovie(){
        val name = nameEditText.text.toString()
        val category = categoryEditText.text.toString()
        val description = descriptionEditText.text.toString()
        val qualification = qualificationEditText.text.toString()

        val movie = MovieModel(name, category, description, qualification)

        movieViewModel.addMovies(movie)

        Log.d("NewMovieFragment", movieViewModel.getMovies().toString())

        findNavController().popBackStack()
    }

}