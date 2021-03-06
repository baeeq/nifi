/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.security.otp;

import org.springframework.security.authentication.AbstractAuthenticationToken;

/**
 * This is an authentication request with a given OTP token.
 */
public class OtpAuthenticationRequestToken extends AbstractAuthenticationToken {

    private final String token;
    private final boolean isDownloadToken;

    /**
     * Creates a representation of the otp authentication request for a user.
     *
     * @param token   The unique token for this user
     */
    public OtpAuthenticationRequestToken(final String token, final boolean isDownloadToken) {
        super(null);
        setAuthenticated(false);
        this.token = token;
        this.isDownloadToken = isDownloadToken;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    public String getToken() {
        return token;
    }

    public boolean isDownloadToken() {
        return isDownloadToken;
    }

    @Override
    public String toString() {
        return getName();
    }

}
