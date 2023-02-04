package com.example.springMongodb.Resource;

import com.example.springMongodb.Models.Album;
import com.example.springMongodb.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/album")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;
    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping("/getall")
    public List<Album> getallAlbum(){
        return albumService.getallAlbum();
    }

    @GetMapping
    public List<Album> getAlbumById(@RequestParam(name = "albumId") Album albumId){
        return albumService.getAlbumById(albumId);
    }
    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }


}
