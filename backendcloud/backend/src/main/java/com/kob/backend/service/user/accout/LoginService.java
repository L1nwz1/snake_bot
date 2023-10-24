package com.kob.backend.service.user.accout;

import java.security.PublicKey;
import java.util.Map;

public interface LoginService {
    public Map<String, String> getToken(String username, String password);
}
