package com.idanElazar.songs;

import com.idanElazar.songs.song.Song;
import com.idanElazar.songs.song.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SongsApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SongsApplication.class, args);
	}

/*	@Bean
	CommandLineRunner runner(SongRepository repository)
	{
		return args ->
		{
			Song s1 = new Song("Let it be", "The Beatles");
			repository.save(s1);
		};
	}*/
}
