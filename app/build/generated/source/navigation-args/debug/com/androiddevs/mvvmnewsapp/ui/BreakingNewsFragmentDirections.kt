package com.androiddevs.mvvmnewsapp.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.mvvmnewsapp.R

class BreakingNewsFragmentDirections private constructor() {
  companion object {
    fun actionBreakingNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_breakingNewsFragment_to_articleFragment)
  }
}
