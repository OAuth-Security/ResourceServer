package dev.syntex.controller;

import dev.syntex.model.ProfileEntity;
import dev.syntex.service.ProfileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class ProfileController {
    private final ProfileService profileService;

    @GetMapping("/profile")
    public ProfileEntity userProfile(@AuthenticationPrincipal Jwt jwt) {
        log.info("jwt : {}", jwt);
        String userId = jwt.getSubject(); // JWT sub 값
        return profileService.getProfileById(userId);
    }
}
