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

package com.google.api.services.storagetransfer.v1.model;

/**
 * Azure credentials For information on our data retention policy for user credentials, see [User
 * credentials](/storage-transfer/docs/data-retention#user-credentials).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AzureCredentials extends com.google.api.client.json.GenericJson {

  /**
   * Required. Azure shared access signature. (see [Grant limited access to Azure Storage resources
   * using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common
   * /storage-sas-overview)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sasToken;

  /**
   * Required. Azure shared access signature. (see [Grant limited access to Azure Storage resources
   * using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common
   * /storage-sas-overview)).
   * @return value or {@code null} for none
   */
  public java.lang.String getSasToken() {
    return sasToken;
  }

  /**
   * Required. Azure shared access signature. (see [Grant limited access to Azure Storage resources
   * using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common
   * /storage-sas-overview)).
   * @param sasToken sasToken or {@code null} for none
   */
  public AzureCredentials setSasToken(java.lang.String sasToken) {
    this.sasToken = sasToken;
    return this;
  }

  @Override
  public AzureCredentials set(String fieldName, Object value) {
    return (AzureCredentials) super.set(fieldName, value);
  }

  @Override
  public AzureCredentials clone() {
    return (AzureCredentials) super.clone();
  }

}
