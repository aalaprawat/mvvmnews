package com.androiddevs.mvvmnewsapp.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.mvvmnewsapp.R

class SearchNewsFragmentDirections private constructor() {
  companion object {
    fun actionSearchNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchNewsFragment_to_articleFragment)
  }
}
