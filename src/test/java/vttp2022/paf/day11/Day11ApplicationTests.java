package vttp2022.paf.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vttp2022.paf.day11.Repository.GameRepository;
import vttp2022.paf.day11.models.Comment;
import vttp2022.paf.day11.models.Game;

@SpringBootTest
class Day11ApplicationTests {

	@Autowired
	private GameRepository gameRepo;

	@Test
	void shouldReturnAGame(){
		Optional<Game> opt = gameRepo.getGameByGid(10);
		assertTrue(opt.isPresent(), "gid = 10");
	}

	@Test
	void shouldReturnEmpty(){
		Optional<Game> opt = gameRepo.getGameByGid(10000);
		assertTrue(!opt.isPresent(), "gid = 10000");
	}

	@Test
	void shouldReturn42Comments(){
		List<Comment> results = gameRepo.getCommentsByGid(10);
		assertEquals(42, results.size(), "number of commetns for gid = 10 is 42");
	}

}
