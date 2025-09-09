package dev.syntex.service;

import dev.syntex.model.ProfileEntity;
import dev.syntex.util.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileRepository profileRepository;

    public ProfileEntity getProfileById(String userId) {
        return profileRepository.findById(userId).orElse(null);
    }
}
