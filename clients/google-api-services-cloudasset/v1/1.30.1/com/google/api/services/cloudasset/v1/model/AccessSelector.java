/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudasset.v1.model;

/**
 * Specifies roles and/or permissions to analyze, to determine both the identities possessing them
 * and the resources they control. If multiple values are specified, results will include roles or
 * permissions matching any of them. The total number of roles and permissions should be equal or
 * less than 10.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessSelector extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The permissions to appear in result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> permissions;

  /**
   * Optional. The roles to appear in result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> roles;

  /**
   * Optional. The permissions to appear in result.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPermissions() {
    return permissions;
  }

  /**
   * Optional. The permissions to appear in result.
   * @param permissions permissions or {@code null} for none
   */
  public AccessSelector setPermissions(java.util.List<java.lang.String> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Optional. The roles to appear in result.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRoles() {
    return roles;
  }

  /**
   * Optional. The roles to appear in result.
   * @param roles roles or {@code null} for none
   */
  public AccessSelector setRoles(java.util.List<java.lang.String> roles) {
    this.roles = roles;
    return this;
  }

  @Override
  public AccessSelector set(String fieldName, Object value) {
    return (AccessSelector) super.set(fieldName, value);
  }

  @Override
  public AccessSelector clone() {
    return (AccessSelector) super.clone();
  }

}
