package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source

class Converters {
    @TypeConverter
    fun fromSourceToString(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun fromStringToSource(string: String): Source {
        return Source(string, string)
    }

}