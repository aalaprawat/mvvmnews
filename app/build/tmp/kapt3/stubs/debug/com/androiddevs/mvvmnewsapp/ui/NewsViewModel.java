package com.androiddevs.mvvmnewsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001b0\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/androiddevs/mvvmnewsapp/ui/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/androiddevs/mvvmnewsapp/repositories/NewsRepository;", "(Lcom/androiddevs/mvvmnewsapp/repositories/NewsRepository;)V", "newsAllResponseMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/androiddevs/mvvmnewsapp/models/NewsResponseModel;", "getNewsAllResponseMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "newsBreakingResponseMutableLiveData", "getNewsBreakingResponseMutableLiveData", "newsSavedResponseMutableLiveData", "getNewsSavedResponseMutableLiveData", "newsSearchResponseMutableLiveData", "getNewsSearchResponseMutableLiveData", "addIntoDatabase", "", "article", "Lcom/androiddevs/mvvmnewsapp/models/Article;", "deleteFromDataBase", "getAllNewsFromServer", "searchString", "", "getBreakingNewsFromServer", "getFromDatabase", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> newsBreakingResponseMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> newsAllResponseMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> newsSavedResponseMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> newsSearchResponseMutableLiveData = null;
    private final com.androiddevs.mvvmnewsapp.repositories.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> getNewsBreakingResponseMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> getNewsAllResponseMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> getNewsSavedResponseMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.models.NewsResponseModel> getNewsSearchResponseMutableLiveData() {
        return null;
    }
    
    public final void getBreakingNewsFromServer() {
    }
    
    public final void getAllNewsFromServer(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString) {
    }
    
    public final void deleteFromDataBase(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article) {
    }
    
    public final void addIntoDatabase(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.mvvmnewsapp.models.Article>> getFromDatabase() {
        return null;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.repositories.NewsRepository newsRepository) {
        super();
    }
}