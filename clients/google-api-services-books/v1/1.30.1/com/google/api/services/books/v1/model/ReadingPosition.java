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

package com.google.api.services.books.v1.model;

/**
 * Model definition for ReadingPosition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReadingPosition extends com.google.api.client.json.GenericJson {

  /**
   * Position in an EPUB as a CFI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String epubCfiPosition;

  /**
   * Position in a volume for image-based content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gbImagePosition;

  /**
   * Position in a volume for text-based content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gbTextPosition;

  /**
   * Resource type for a reading position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Position in a PDF file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pdfPosition;

  /**
   * Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond
   * resolution).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updated;

  /**
   * Volume id associated with this reading position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeId;

  /**
   * Position in an EPUB as a CFI.
   * @return value or {@code null} for none
   */
  public java.lang.String getEpubCfiPosition() {
    return epubCfiPosition;
  }

  /**
   * Position in an EPUB as a CFI.
   * @param epubCfiPosition epubCfiPosition or {@code null} for none
   */
  public ReadingPosition setEpubCfiPosition(java.lang.String epubCfiPosition) {
    this.epubCfiPosition = epubCfiPosition;
    return this;
  }

  /**
   * Position in a volume for image-based content.
   * @return value or {@code null} for none
   */
  public java.lang.String getGbImagePosition() {
    return gbImagePosition;
  }

  /**
   * Position in a volume for image-based content.
   * @param gbImagePosition gbImagePosition or {@code null} for none
   */
  public ReadingPosition setGbImagePosition(java.lang.String gbImagePosition) {
    this.gbImagePosition = gbImagePosition;
    return this;
  }

  /**
   * Position in a volume for text-based content.
   * @return value or {@code null} for none
   */
  public java.lang.String getGbTextPosition() {
    return gbTextPosition;
  }

  /**
   * Position in a volume for text-based content.
   * @param gbTextPosition gbTextPosition or {@code null} for none
   */
  public ReadingPosition setGbTextPosition(java.lang.String gbTextPosition) {
    this.gbTextPosition = gbTextPosition;
    return this;
  }

  /**
   * Resource type for a reading position.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for a reading position.
   * @param kind kind or {@code null} for none
   */
  public ReadingPosition setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Position in a PDF file.
   * @return value or {@code null} for none
   */
  public java.lang.String getPdfPosition() {
    return pdfPosition;
  }

  /**
   * Position in a PDF file.
   * @param pdfPosition pdfPosition or {@code null} for none
   */
  public ReadingPosition setPdfPosition(java.lang.String pdfPosition) {
    this.pdfPosition = pdfPosition;
    return this;
  }

  /**
   * Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond
   * resolution).
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdated() {
    return updated;
  }

  /**
   * Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond
   * resolution).
   * @param updated updated or {@code null} for none
   */
  public ReadingPosition setUpdated(java.lang.String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Volume id associated with this reading position.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeId() {
    return volumeId;
  }

  /**
   * Volume id associated with this reading position.
   * @param volumeId volumeId or {@code null} for none
   */
  public ReadingPosition setVolumeId(java.lang.String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  @Override
  public ReadingPosition set(String fieldName, Object value) {
    return (ReadingPosition) super.set(fieldName, value);
  }

  @Override
  public ReadingPosition clone() {
    return (ReadingPosition) super.clone();
  }

}