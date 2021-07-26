package com.androiddevs.mvvmnewsapp.ui

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.NewsActivity
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.models.Article
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    private lateinit var newsViewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsViewModel = (activity as NewsActivity).newsViewModel
        val bundle = arguments
        val article: Article = bundle?.getSerializable("article") as Article
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article?.url)
        }
        fab.setOnClickListener {
            newsViewModel.addIntoDatabase(article)
        }
    }

}