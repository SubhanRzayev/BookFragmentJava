package com.subhanrzayev.artbookfragmentjava.model;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Art {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "artName")
    public String artName;

    @Nullable
    @ColumnInfo(name = "artistName")
    public String artistName;

    @Nullable
    @ColumnInfo(name = "year")
    public String year;

    @Nullable
    @ColumnInfo(name = "image")
    public byte[] image;

    public Art(String artName, @Nullable String artistName, @Nullable String year, @Nullable byte[] image) {
        this.artName = artName;
        this.artistName = artistName;
        this.year = year;
        this.image = image;
    }
}
