package io.adeprogramming.tinder_ai_backend;

import io.adeprogramming.tinder_ai_backend.conversations.ConversationRepository;
import io.adeprogramming.tinder_ai_backend.matches.MatchRepository;
import io.adeprogramming.tinder_ai_backend.profiles.ProfileCreationService;
import io.adeprogramming.tinder_ai_backend.profiles.ProfileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class TinderAiBackendApplication implements CommandLineRunner {

	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private ConversationRepository conversationRepository;
	@Autowired
	private MatchRepository matchRepository;

	@Autowired
	private ProfileCreationService profileCreationService;

	public static void main(String[] args) {
		SpringApplication.run(TinderAiBackendApplication.class, args);
	}

	public void run(String... args) {
		clearAllData();
		profileCreationService.saveProfilesToDB();

	}

	private void clearAllData() {
		conversationRepository.deleteAll();
		matchRepository.deleteAll();
		profileRepository.deleteAll();
	}

}