package com.kob.backend.service.user.accout;

import java.util.Map;

public interface RegisterService {
    public Map<String, String> register(String username, String password, String confirmedPassword);
}
