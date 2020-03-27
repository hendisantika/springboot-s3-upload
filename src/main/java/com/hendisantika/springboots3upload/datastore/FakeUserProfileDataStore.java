package com.hendisantika.springboots3upload.datastore;

import com.hendisantika.springboots3upload.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-s3-upload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/03/20
 * Time: 07.49
 */
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILE = new ArrayList<>();

    static {
        USER_PROFILE.add(new UserProfile(UUID.randomUUID(), "naruto", null));
        USER_PROFILE.add(new UserProfile(UUID.randomUUID(), "sasuke", null));
        USER_PROFILE.add(new UserProfile(UUID.randomUUID(), "sakura", null));
    }

    public List<UserProfile> getUserProfile() {
        return USER_PROFILE;
    }
}
