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

package com.google.api.services.sheets.v4.model;

/**
 * The options that define a "view window" for a chart (such as the visible values in an axis).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChartAxisViewWindowOptions extends com.google.api.client.json.GenericJson {

  /**
   * The maximum numeric value to be shown in this view window. If unset, will automatically
   * determine a maximum value that looks good for the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double viewWindowMax;

  /**
   * The minimum numeric value to be shown in this view window. If unset, will automatically
   * determine a minimum value that looks good for the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double viewWindowMin;

  /**
   * The view window's mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String viewWindowMode;

  /**
   * The maximum numeric value to be shown in this view window. If unset, will automatically
   * determine a maximum value that looks good for the data.
   * @return value or {@code null} for none
   */
  public java.lang.Double getViewWindowMax() {
    return viewWindowMax;
  }

  /**
   * The maximum numeric value to be shown in this view window. If unset, will automatically
   * determine a maximum value that looks good for the data.
   * @param viewWindowMax viewWindowMax or {@code null} for none
   */
  public ChartAxisViewWindowOptions setViewWindowMax(java.lang.Double viewWindowMax) {
    this.viewWindowMax = viewWindowMax;
    return this;
  }

  /**
   * The minimum numeric value to be shown in this view window. If unset, will automatically
   * determine a minimum value that looks good for the data.
   * @return value or {@code null} for none
   */
  public java.lang.Double getViewWindowMin() {
    return viewWindowMin;
  }

  /**
   * The minimum numeric value to be shown in this view window. If unset, will automatically
   * determine a minimum value that looks good for the data.
   * @param viewWindowMin viewWindowMin or {@code null} for none
   */
  public ChartAxisViewWindowOptions setViewWindowMin(java.lang.Double viewWindowMin) {
    this.viewWindowMin = viewWindowMin;
    return this;
  }

  /**
   * The view window's mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getViewWindowMode() {
    return viewWindowMode;
  }

  /**
   * The view window's mode.
   * @param viewWindowMode viewWindowMode or {@code null} for none
   */
  public ChartAxisViewWindowOptions setViewWindowMode(java.lang.String viewWindowMode) {
    this.viewWindowMode = viewWindowMode;
    return this;
  }

  @Override
  public ChartAxisViewWindowOptions set(String fieldName, Object value) {
    return (ChartAxisViewWindowOptions) super.set(fieldName, value);
  }

  @Override
  public ChartAxisViewWindowOptions clone() {
    return (ChartAxisViewWindowOptions) super.clone();
  }

}
