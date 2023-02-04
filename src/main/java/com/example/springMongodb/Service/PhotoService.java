package com.example.springMongodb.Service;

import com.example.springMongodb.Models.Photo;
import com.example.springMongodb.Models.User;
import com.example.springMongodb.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public List<Photo> getallPhotos() {
        return photoRepository.findAll();
    }

    public List<Photo> getPhotoById(Photo photoId) {
        Example<Photo> p = Example.of(photoId);
        return photoRepository.findAll(p);
    }

    public Photo updatePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public void deletePhoto(String photoId){
        photoRepository.deleteById(photoId);
    }


}
