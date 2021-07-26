package com.androiddevs.mvvmnewsapp.repositories

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.Article
import com.androiddevs.mvvmnewsapp.models.NewsResponseModel
import retrofit2.Response

class NewsRepository(val articleDatabase: ArticleDatabase) {


    suspend fun getBreakingFromServer(): Response<NewsResponseModel> {
        return RetrofitInstance.api.getBreakingNews()
    }

    suspend fun getAllNewsFromServer(searchString: String): Response<NewsResponseModel> {
        return RetrofitInstance.api.searchForNews(searchString)
    }

    suspend fun deleteFromDatabase(article: Article) {
        articleDatabase.getArticleDao().deleteArticle(article)
    }

    suspend fun addIntoDatabase(article: Article) {
        articleDatabase.getArticleDao().insertArticle(article)
    }

    fun getFromDatabase(): LiveData<List<Article>> {
        return articleDatabase.getArticleDao().getAllArticlesFromDb()
    }
}