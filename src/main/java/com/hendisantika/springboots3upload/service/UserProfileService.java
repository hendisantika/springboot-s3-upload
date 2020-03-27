package com.hendisantika.springboots3upload.service;

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
 * Time: 07.59
 */
@Repository
public class UserProfileService {
    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    public List<UserProfile> getUserProfiles() {
        return userProfileDataAccessService.getUserProfiles();
    }
}
