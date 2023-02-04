package com.example.springMongodb.Service;

import com.example.springMongodb.Models.Album;
import com.example.springMongodb.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album){
        return albumRepository.save(album);
    }

    public List<Album> getallAlbum() {
        return albumRepository.findAll();
    }

    public List<Album> getAlbumById(Album albumId) {
        Example<Album> a = Example.of(albumId);
        return albumRepository.findAll(a);
    }

    public Album updateAlbum(Album album){
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId){
        albumRepository.deleteById(albumId);
    }


}
