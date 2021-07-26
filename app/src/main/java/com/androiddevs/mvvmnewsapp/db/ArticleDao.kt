package com.androiddevs.mvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androiddevs.mvvmnewsapp.models.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("select * from articles")
    fun getAllArticlesFromDb(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}