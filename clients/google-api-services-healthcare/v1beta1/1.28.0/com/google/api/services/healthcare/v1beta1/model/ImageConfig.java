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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Specifies how de-identification of image pixel should be handled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageConfig extends com.google.api.client.json.GenericJson {

  /**
   * Determines how to redact text from image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textRedactionMode;

  /**
   * Determines how to redact text from image.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextRedactionMode() {
    return textRedactionMode;
  }

  /**
   * Determines how to redact text from image.
   * @param textRedactionMode textRedactionMode or {@code null} for none
   */
  public ImageConfig setTextRedactionMode(java.lang.String textRedactionMode) {
    this.textRedactionMode = textRedactionMode;
    return this;
  }

  @Override
  public ImageConfig set(String fieldName, Object value) {
    return (ImageConfig) super.set(fieldName, value);
  }

  @Override
  public ImageConfig clone() {
    return (ImageConfig) super.clone();
  }

}
