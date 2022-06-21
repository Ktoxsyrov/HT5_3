package com.example.ht5_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ht5_3.databinding.FragmentFavoritesBinding

class FavoritesFragment(favCatsList: List<Cat>) : Fragment() {
    val favList = favCatsList
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFavoritesBinding.inflate(layoutInflater)
        val favRecyclerView = binding.favoritesRecycler
        val adapter = FavCatAdapter()
        adapter.setFavCatsList(favList)
        favRecyclerView.adapter = adapter
        favRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        println(favList.size)
        return super.onCreateView(inflater, container, savedInstanceState)

    }
}