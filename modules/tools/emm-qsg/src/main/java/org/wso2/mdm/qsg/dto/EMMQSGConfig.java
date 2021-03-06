/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.mdm.qsg.dto;

/**
 * This holds the model object of EMM configuration.
 */
public class EMMQSGConfig {

    private String dcrEndPoint;
    private String oauthEndPoint;
    private String emmHost;
    private String username;
    private String password;
    private String iOSAppIdentifier;
    private String iOSAppVersion;
    private static EMMQSGConfig instance = new EMMQSGConfig();

    private EMMQSGConfig() {

    }

    public String getDcrEndPoint() {
        return dcrEndPoint;
    }

    public void setDcrEndPoint(String dcrEndPoint) {
        this.dcrEndPoint = dcrEndPoint;
    }

    public String getOauthEndPoint() {
        return oauthEndPoint;
    }

    public void setOauthEndPoint(String oauthEndPoint) {
        this.oauthEndPoint = oauthEndPoint;
    }

    public String getEmmHost() {
        return emmHost;
    }

    public void setEmmHost(String emmHost) {
        this.emmHost = emmHost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static EMMQSGConfig getInstance() {
        return instance;
    }

    public String getiOSAppIdentifier() {
        return iOSAppIdentifier;
    }

    public void setiOSAppIdentifier(String iOSAppIdentifier) {
        this.iOSAppIdentifier = iOSAppIdentifier;
    }

    public String getiOSAppVersion() {
        return iOSAppVersion;
    }

    public void setiOSAppVersion(String iOSAppVersion) {
        this.iOSAppVersion = iOSAppVersion;
    }
}
