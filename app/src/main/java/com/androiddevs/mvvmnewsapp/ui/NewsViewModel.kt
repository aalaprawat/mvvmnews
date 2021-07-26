package com.androiddevs.mvvmnewsapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevs.mvvmnewsapp.models.Article
import com.androiddevs.mvvmnewsapp.models.NewsResponseModel
import com.androiddevs.mvvmnewsapp.repositories.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {

    val newsBreakingResponseMutableLiveData = MutableLiveData<NewsResponseModel>()
    val newsAllResponseMutableLiveData = MutableLiveData<NewsResponseModel>()
    val newsSavedResponseMutableLiveData = MutableLiveData<NewsResponseModel>()
    val newsSearchResponseMutableLiveData = MutableLiveData<NewsResponseModel>()



    fun getBreakingNewsFromServer() {
        viewModelScope.launch {
            val newsResponse = newsRepository.getBreakingFromServer()
            if (newsResponse.isSuccessful) {
                newsBreakingResponseMutableLiveData.postValue(newsResponse.body())
            } else {
                newsBreakingResponseMutableLiveData.postValue(null)
            }
        }
    }

    fun getAllNewsFromServer(searchString: String) {
        viewModelScope.launch {
            val newsResponse = newsRepository.getAllNewsFromServer(searchString)
            if (newsResponse.isSuccessful) {
                newsAllResponseMutableLiveData.postValue(newsResponse.body())
            } else {
                newsAllResponseMutableLiveData.postValue(null)
            }
        }
    }

    fun deleteFromDataBase(article: Article) {
        viewModelScope.launch {
            newsRepository.deleteFromDatabase(article)
        }
    }

    fun addIntoDatabase(article: Article){
        viewModelScope.launch {
            newsRepository.addIntoDatabase(article)
        }
    }

    fun getFromDatabase() = newsRepository.getFromDatabase()


}