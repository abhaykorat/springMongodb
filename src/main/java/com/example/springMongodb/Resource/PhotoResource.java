package com.example.springMongodb.Resource;

import com.example.springMongodb.Models.Photo;
import com.example.springMongodb.Service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping("/getall")
    public List<Photo> getallPhotos(){
        return photoService.getallPhotos();
    }

    @GetMapping
    public List<Photo> getPhotoById(@RequestParam(name = "photoId") Photo photoId){
        return photoService.getPhotoById(photoId);
    }
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "photoId") String photoId){
        photoService.deletePhoto(photoId);
    }


}
