/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.saml.exception;

import org.wso2.carbon.identity.base.IdentityException;

/**
 * Exception implementation to be used inside SAML2 SSO Identity Provider impl.
 */
public class IdentitySAML2SSOException extends IdentityException {

    private static final long serialVersionUID = 7027553884968546755L;

    public IdentitySAML2SSOException(String message) {

        super(message);
    }

    public IdentitySAML2SSOException(String message, Throwable cause) {

        super(message, cause);
    }

    public IdentitySAML2SSOException(String errorCode, String message) {

        super(errorCode, message);
    }

    public IdentitySAML2SSOException(String errorCode, String message, Throwable cause) {

        super(errorCode, message, cause);
    }

}
