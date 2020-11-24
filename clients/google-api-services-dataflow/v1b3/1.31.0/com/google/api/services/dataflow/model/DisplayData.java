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

package com.google.api.services.dataflow.model;

/**
 * Data provided with a pipeline or transform to provide descriptive info.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisplayData extends com.google.api.client.json.GenericJson {

  /**
   * Contains value if the data is of a boolean type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * Contains value if the data is of duration type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String durationValue;

  /**
   * Contains value if the data is of float type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float floatValue;

  /**
   * Contains value if the data is of int64 type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long int64Value;

  /**
   * Contains value if the data is of java class type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String javaClassValue;

  /**
   * The key identifying the display data. This is intended to be used as a label for the display
   * data when viewed in a dax monitoring system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * An optional label to display in a dax UI for the element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The namespace for the key. This is usually a class name or programming language namespace (i.e.
   * python module) which defines the display data. This allows a dax monitoring system to specially
   * handle the data and perform custom rendering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * A possible additional shorter value to display. For example a java_class_name_value of
   * com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn
   * as the java_class_name value. short_str_value can be displayed and java_class_name_value will
   * be displayed as a tooltip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortStrValue;

  /**
   * Contains value if the data is of string type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String strValue;

  /**
   * Contains value if the data is of timestamp type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestampValue;

  /**
   * An optional full URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Contains value if the data is of a boolean type.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * Contains value if the data is of a boolean type.
   * @param boolValue boolValue or {@code null} for none
   */
  public DisplayData setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Contains value if the data is of duration type.
   * @return value or {@code null} for none
   */
  public String getDurationValue() {
    return durationValue;
  }

  /**
   * Contains value if the data is of duration type.
   * @param durationValue durationValue or {@code null} for none
   */
  public DisplayData setDurationValue(String durationValue) {
    this.durationValue = durationValue;
    return this;
  }

  /**
   * Contains value if the data is of float type.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFloatValue() {
    return floatValue;
  }

  /**
   * Contains value if the data is of float type.
   * @param floatValue floatValue or {@code null} for none
   */
  public DisplayData setFloatValue(java.lang.Float floatValue) {
    this.floatValue = floatValue;
    return this;
  }

  /**
   * Contains value if the data is of int64 type.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInt64Value() {
    return int64Value;
  }

  /**
   * Contains value if the data is of int64 type.
   * @param int64Value int64Value or {@code null} for none
   */
  public DisplayData setInt64Value(java.lang.Long int64Value) {
    this.int64Value = int64Value;
    return this;
  }

  /**
   * Contains value if the data is of java class type.
   * @return value or {@code null} for none
   */
  public java.lang.String getJavaClassValue() {
    return javaClassValue;
  }

  /**
   * Contains value if the data is of java class type.
   * @param javaClassValue javaClassValue or {@code null} for none
   */
  public DisplayData setJavaClassValue(java.lang.String javaClassValue) {
    this.javaClassValue = javaClassValue;
    return this;
  }

  /**
   * The key identifying the display data. This is intended to be used as a label for the display
   * data when viewed in a dax monitoring system.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key identifying the display data. This is intended to be used as a label for the display
   * data when viewed in a dax monitoring system.
   * @param key key or {@code null} for none
   */
  public DisplayData setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * An optional label to display in a dax UI for the element.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * An optional label to display in a dax UI for the element.
   * @param label label or {@code null} for none
   */
  public DisplayData setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * The namespace for the key. This is usually a class name or programming language namespace (i.e.
   * python module) which defines the display data. This allows a dax monitoring system to specially
   * handle the data and perform custom rendering.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * The namespace for the key. This is usually a class name or programming language namespace (i.e.
   * python module) which defines the display data. This allows a dax monitoring system to specially
   * handle the data and perform custom rendering.
   * @param namespace namespace or {@code null} for none
   */
  public DisplayData setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * A possible additional shorter value to display. For example a java_class_name_value of
   * com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn
   * as the java_class_name value. short_str_value can be displayed and java_class_name_value will
   * be displayed as a tooltip.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortStrValue() {
    return shortStrValue;
  }

  /**
   * A possible additional shorter value to display. For example a java_class_name_value of
   * com.mypackage.MyDoFn will be stored with MyDoFn as the short_str_value and com.mypackage.MyDoFn
   * as the java_class_name value. short_str_value can be displayed and java_class_name_value will
   * be displayed as a tooltip.
   * @param shortStrValue shortStrValue or {@code null} for none
   */
  public DisplayData setShortStrValue(java.lang.String shortStrValue) {
    this.shortStrValue = shortStrValue;
    return this;
  }

  /**
   * Contains value if the data is of string type.
   * @return value or {@code null} for none
   */
  public java.lang.String getStrValue() {
    return strValue;
  }

  /**
   * Contains value if the data is of string type.
   * @param strValue strValue or {@code null} for none
   */
  public DisplayData setStrValue(java.lang.String strValue) {
    this.strValue = strValue;
    return this;
  }

  /**
   * Contains value if the data is of timestamp type.
   * @return value or {@code null} for none
   */
  public String getTimestampValue() {
    return timestampValue;
  }

  /**
   * Contains value if the data is of timestamp type.
   * @param timestampValue timestampValue or {@code null} for none
   */
  public DisplayData setTimestampValue(String timestampValue) {
    this.timestampValue = timestampValue;
    return this;
  }

  /**
   * An optional full URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * An optional full URL.
   * @param url url or {@code null} for none
   */
  public DisplayData setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public DisplayData set(String fieldName, Object value) {
    return (DisplayData) super.set(fieldName, value);
  }

  @Override
  public DisplayData clone() {
    return (DisplayData) super.clone();
  }

}
