package com.androiddevs.mvvmnewsapp.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddevs.mvvmnewsapp.NewsActivity
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_breaking_news.*

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    private lateinit var newsViewModel: NewsViewModel
    private var adapter: NewsAdapter = NewsAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsViewModel = (activity as NewsActivity).newsViewModel
        newsViewModel.getBreakingNewsFromServer()

        setupRecyclerview()
        adapter.setOnItemClickListener {
            val bundle = Bundle().apply { putSerializable("article", it) }
            findNavController().navigate(
                R.id.action_breakingNewsFragment_to_articleFragment,
                bundle
            )
        }

        newsViewModel.newsBreakingResponseMutableLiveData.observe(viewLifecycleOwner) {
            adapter.differ.submitList(it.articles)
        }
    }

    private fun setupRecyclerview() {
        rvBreakingNews.layoutManager = LinearLayoutManager(context)
        rvBreakingNews.adapter = adapter
    }
}