package com.androiddevs.mvvmnewsapp.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.mvvmnewsapp.R

class SavedNewsFragmentDirections private constructor() {
  companion object {
    fun actionSavedNewsFragmentToArticleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_savedNewsFragment_to_articleFragment)
  }
}
