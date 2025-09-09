package dev.syntex.util;

import dev.syntex.model.ProfileEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProfileRepository {
    private final List<ProfileEntity> profiles = new ArrayList<>();

    public ProfileRepository() {
        ProfileEntity m1 = new ProfileEntity();
        m1.setMemberId("1");
        m1.setName("Jun");
        m1.setEmail("jun@example.com");

        ProfileEntity m2 = new ProfileEntity();
        m2.setMemberId("2");
        m2.setName("Alice");
        m2.setEmail("alice@example.com");

        ProfileEntity m3 = new ProfileEntity();
        m3.setMemberId("3");
        m3.setName("Bob");
        m3.setEmail("bob@example.com");

        ProfileEntity m4 = new ProfileEntity();
        m3.setMemberId("4");
        m3.setName("Cristina");
        m3.setEmail("Cristina@example.com");

        ProfileEntity m5 = new ProfileEntity();
        m3.setMemberId("5");
        m3.setName("Sally");
        m3.setEmail("sally@example.com");

        profiles.add(m1);
        profiles.add(m2);
        profiles.add(m3);
        profiles.add(m4);
        profiles.add(m5);
    }

    public Optional<ProfileEntity> findById(String memberId) {
        return profiles.stream()
                .filter(m -> m.getMemberId().equals(memberId))
                .findFirst();
    }

    public List<ProfileEntity> findAll() {
        return profiles;
    }
}
