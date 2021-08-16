package com.autumnxtruong.NikPik.models;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image {
    int imgId;
    int imgOwnerId; // one to many relationship with user (user can own many img)
    String imgName;
    String imgDateAdded;
    String imgDateTaken;
    String imgDateModified;
    //by default ALL images are located in Gallery
    //int imgLocations; many to many relationship between img and album
    //int imgTags;  many to many relationship between img and tag
    String imgNotes;
}
