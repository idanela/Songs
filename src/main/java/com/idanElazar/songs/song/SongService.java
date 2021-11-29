package com.idanElazar.songs.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {

    private SongRepository repository;

    @Autowired
    public SongService(SongRepository songRepository) {
      this.repository = songRepository;
    }
    public List<Song> getSongs() {
        return repository.findAll();
    }

    public void addSong(Song song) {
        this.repository.save(song);
    }

    public void deleteSong(String name) {
        if(!repository.existsById(name))
        {
            throw new IllegalStateException("Song with the name: "+ name + " Does not exists.");
        }

        this.repository.deleteById(name);
    }

    public void updateSong(String name, String singer) {
        Song song = repository.findById(name).orElseThrow(()->new IllegalStateException("Song with the name: "+ name + " Does not exists."));

        if(singer != null && singer.length() > 0 && !singer.equals(song.getName()))
        {
            song.setSinger(singer);
            repository.save(song);
        }
    }
}
