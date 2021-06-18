package com.example.security.security;

import com.google.common.collect.Sets;
import java.util.Set;

import static com.example.security.security.ApplicationUserPermission.COURSE_READ;
import static com.example.security.security.ApplicationUserPermission.STUDENT_READ;
import static com.example.security.security.ApplicationUserPermission.COURSE_WRITE;
import static com.example.security.security.ApplicationUserPermission.STUDENT_WRITE;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));
    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
