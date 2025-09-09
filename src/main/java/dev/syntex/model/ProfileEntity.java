package dev.syntex.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ProfileEntity {
    private String memberId;
    private String name;
    private String email;
}
