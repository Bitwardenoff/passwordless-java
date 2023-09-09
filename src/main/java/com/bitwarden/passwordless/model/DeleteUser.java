package com.bitwarden.passwordless.model;

import lombok.*;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class DeleteUser {
    String userId;
}