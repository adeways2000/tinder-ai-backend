package io.adeprogramming.tinder_ai_backend.matches;

import io.adeprogramming.tinder_ai_backend.profiles.Profile;

public record Match (String id, Profile profile, String conversationId) {
}
