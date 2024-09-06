package io.adeprogramming.tinder_ai_backend.profiles;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRespository extends MongoRepository<Profile, String> {
}
