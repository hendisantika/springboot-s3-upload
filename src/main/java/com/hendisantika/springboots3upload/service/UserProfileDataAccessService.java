package com.hendisantika.springboots3upload.service;

import com.hendisantika.springboots3upload.datastore.FakeUserProfileDataStore;
import com.hendisantika.springboots3upload.profile.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-s3-upload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/03/20
 * Time: 08.10
 */
@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileDataStore fakeUserDataProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserDataProfileDataStore) {
        this.fakeUserDataProfileDataStore = fakeUserDataProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserDataProfileDataStore.getUserProfiles();
    }
}
