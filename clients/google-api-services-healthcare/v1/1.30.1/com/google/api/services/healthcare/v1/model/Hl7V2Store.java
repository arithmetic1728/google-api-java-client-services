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

package com.google.api.services.healthcare.v1.model;

/**
 * Represents an HL7v2 store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Hl7V2Store extends com.google.api.client.json.GenericJson {

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Resource name of the HL7v2 store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of notification configs. Each configuration uses a filter to determine whether to
   * publish a message (both Ingest & Create) on the corresponding notification destination. Only
   * the message name is sent as part of the notification. Supplied by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Hl7V2NotificationConfig> notificationConfigs;

  static {
    // hack to force ProGuard to consider Hl7V2NotificationConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Hl7V2NotificationConfig.class);
  }

  /**
   * The configuration for the parser. It determines how the server parses the messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParserConfig parserConfig;

  /**
   * Determines whether duplicate messages should be rejected. A duplicate message is a message with
   * the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The
   * default value is false, meaning that the store accepts the duplicate messages and it also
   * returns the same ACK message in the IngestMessageResponse as has been returned previously. Note
   * that only one resource is created in the store. When this field is set to true,
   * CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store,
   * and IngestMessageErrorDetail returns a NACK message upon rejection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rejectDuplicateMessage;

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @param labels labels or {@code null} for none
   */
  public Hl7V2Store setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Resource name of the HL7v2 store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the HL7v2 store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
   * @param name name or {@code null} for none
   */
  public Hl7V2Store setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of notification configs. Each configuration uses a filter to determine whether to
   * publish a message (both Ingest & Create) on the corresponding notification destination. Only
   * the message name is sent as part of the notification. Supplied by the client.
   * @return value or {@code null} for none
   */
  public java.util.List<Hl7V2NotificationConfig> getNotificationConfigs() {
    return notificationConfigs;
  }

  /**
   * A list of notification configs. Each configuration uses a filter to determine whether to
   * publish a message (both Ingest & Create) on the corresponding notification destination. Only
   * the message name is sent as part of the notification. Supplied by the client.
   * @param notificationConfigs notificationConfigs or {@code null} for none
   */
  public Hl7V2Store setNotificationConfigs(java.util.List<Hl7V2NotificationConfig> notificationConfigs) {
    this.notificationConfigs = notificationConfigs;
    return this;
  }

  /**
   * The configuration for the parser. It determines how the server parses the messages.
   * @return value or {@code null} for none
   */
  public ParserConfig getParserConfig() {
    return parserConfig;
  }

  /**
   * The configuration for the parser. It determines how the server parses the messages.
   * @param parserConfig parserConfig or {@code null} for none
   */
  public Hl7V2Store setParserConfig(ParserConfig parserConfig) {
    this.parserConfig = parserConfig;
    return this;
  }

  /**
   * Determines whether duplicate messages should be rejected. A duplicate message is a message with
   * the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The
   * default value is false, meaning that the store accepts the duplicate messages and it also
   * returns the same ACK message in the IngestMessageResponse as has been returned previously. Note
   * that only one resource is created in the store. When this field is set to true,
   * CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store,
   * and IngestMessageErrorDetail returns a NACK message upon rejection.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRejectDuplicateMessage() {
    return rejectDuplicateMessage;
  }

  /**
   * Determines whether duplicate messages should be rejected. A duplicate message is a message with
   * the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The
   * default value is false, meaning that the store accepts the duplicate messages and it also
   * returns the same ACK message in the IngestMessageResponse as has been returned previously. Note
   * that only one resource is created in the store. When this field is set to true,
   * CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store,
   * and IngestMessageErrorDetail returns a NACK message upon rejection.
   * @param rejectDuplicateMessage rejectDuplicateMessage or {@code null} for none
   */
  public Hl7V2Store setRejectDuplicateMessage(java.lang.Boolean rejectDuplicateMessage) {
    this.rejectDuplicateMessage = rejectDuplicateMessage;
    return this;
  }

  @Override
  public Hl7V2Store set(String fieldName, Object value) {
    return (Hl7V2Store) super.set(fieldName, value);
  }

  @Override
  public Hl7V2Store clone() {
    return (Hl7V2Store) super.clone();
  }

}