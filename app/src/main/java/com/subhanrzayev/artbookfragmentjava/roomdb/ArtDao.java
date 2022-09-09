package com.subhanrzayev.artbookfragmentjava.roomdb;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.subhanrzayev.artbookfragmentjava.model.Art;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface ArtDao {


    @Query("SELECT artName,id FROM Art")
     Flowable<List<Art>> getArtWithArtNameAndId();

    @Query("SELECT * FROM Art WHERE id =  :id")
    Flowable<Art> getArtById(int id);

    @Insert
    Completable insert(Art art);

    @Delete
    Completable delete(Art art);

}
