package com.autumnxtruong.NikPik.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Album {
    int albumId;
    int albumOwnerId; // one to many relationship with user (user can own many img)
    String albumName;
    String albumDateAdded;
    String albumDateModified;
    //int albumLocations; many to many relationship between img and album
    //int albumtags;  many to many relationship between img and tag
    String albumNotes;
}
