package com.hendisantika.springboots3upload.profile;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-s3-upload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/03/20
 * Time: 07.44
 */
@Data
@EqualsAndHashCode
public class UserProfile {
    private UUID userProfileId;
    private String username;
    private String userProfileImageLink; // S3 key
}
