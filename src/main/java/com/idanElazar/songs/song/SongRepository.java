package com.idanElazar.songs.song;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song,String> {
}
