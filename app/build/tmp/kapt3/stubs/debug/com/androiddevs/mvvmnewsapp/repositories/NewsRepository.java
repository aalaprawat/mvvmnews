package com.androiddevs.mvvmnewsapp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/androiddevs/mvvmnewsapp/repositories/NewsRepository;", "", "articleDatabase", "Lcom/androiddevs/mvvmnewsapp/db/ArticleDatabase;", "(Lcom/androiddevs/mvvmnewsapp/db/ArticleDatabase;)V", "getArticleDatabase", "()Lcom/androiddevs/mvvmnewsapp/db/ArticleDatabase;", "addIntoDatabase", "", "article", "Lcom/androiddevs/mvvmnewsapp/models/Article;", "(Lcom/androiddevs/mvvmnewsapp/models/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromDatabase", "getAllNewsFromServer", "Lretrofit2/Response;", "Lcom/androiddevs/mvvmnewsapp/models/NewsResponseModel;", "searchString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreakingFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFromDatabase", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.mvvmnewsapp.db.ArticleDatabase articleDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBreakingFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.androiddevs.mvvmnewsapp.models.NewsResponseModel>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllNewsFromServer(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.androiddevs.mvvmnewsapp.models.NewsResponseModel>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFromDatabase(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addIntoDatabase(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.mvvmnewsapp.models.Article>> getFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.mvvmnewsapp.db.ArticleDatabase getArticleDatabase() {
        return null;
    }
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.db.ArticleDatabase articleDatabase) {
        super();
    }
}