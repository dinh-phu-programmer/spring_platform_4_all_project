package com.dinhphu.practice_angularjs.enumurate;

import static com.dinhphu.practice_angularjs.constant.AuthorityConstant.*;

public enum Role {
    ROLE_USER(USER_AUTHORITIES),
    ROLE_ADMIN(ADMIN_AUTHORITIES);
    private String[] authorities;

    Role(String[] authorities) {
        this.authorities = authorities;
    }

    public String[] getAuthorities() {
        return this.authorities;
    }
}
