package com.androiddevs.mvvmnewsapp.ui

import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androiddevs.mvvmnewsapp.NewsActivity
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_saved_news.*
import kotlinx.android.synthetic.main.fragment_search_news.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    private var adapter: NewsAdapter = NewsAdapter()
    private lateinit var newsViewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newsViewModel = (activity as NewsActivity).newsViewModel
        newsViewModel.getFromDatabase().observe(viewLifecycleOwner) {
            adapter.differ.submitList(it)
        }

        setupRecyclerView()

        adapter.setOnItemClickListener {
            val bundle = Bundle().apply { putSerializable("article", it) }
            findNavController().navigate(
                R.id.action_savedNewsFragment_to_articleFragment,
                bundle
            )
        }

        etSearch.addTextChangedListener{
            lifecycleScope.launch {
                delay(500)
                if (!it.isNullOrEmpty()){
                    newsViewModel.getAllNewsFromServer(it.toString())
                }
            }
        }
        newsViewModel.newsAllResponseMutableLiveData.observe(viewLifecycleOwner) {
            adapter.differ.submitList(it.articles)
        }

        val simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object :
            ItemTouchHelper.SimpleCallback(
                0,
                ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT or ItemTouchHelper.DOWN or ItemTouchHelper.UP
            ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                val position = viewHolder.adapterPosition
                val article = adapter.differ.currentList[position]
                newsViewModel.deleteFromDataBase(article)
            }
        }
        ItemTouchHelper(simpleItemTouchCallback).apply {
            attachToRecyclerView(rvSavedNews)
        }
    }

    private fun setupRecyclerView() {
        rvSearchNews.layoutManager = LinearLayoutManager(context)
        rvSearchNews.adapter = adapter
    }
}