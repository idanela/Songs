package com.idanElazar.songs.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getSongs()
    {
        return songService.getSongs();
    }

    @PostMapping
    public void saveSong(@RequestBody Song song)
    {
        songService.addSong(song);
    }

    @DeleteMapping(path = "{songId}")
    public void deleteSong(@PathVariable("songId") String name) // get variable from path
    {
        songService.deleteSong(name);
    }

    @PutMapping(path = "{songId}")
    public void updateSong(
            @PathVariable("songId") String name,
            @RequestParam(required = false) String singer) // get variable from path
    {
        songService.updateSong(name,singer);
    }

}
