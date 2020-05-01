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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * This contains the fields corresponding to the definition of a software supply chain step in an
 * in-toto layout. This information goes into a Grafeas note.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InToto extends com.google.api.client.json.GenericJson {

  /**
   * This field contains the expected command used to perform the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> expectedCommand;

  /**
   * The following fields contain in-toto artifact rules identifying the artifacts that enter this
   * supply chain step, and exit the supply chain step, i.e. materials and products of the step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArtifactRule> expectedMaterials;

  static {
    // hack to force ProGuard to consider ArtifactRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ArtifactRule.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArtifactRule> expectedProducts;

  static {
    // hack to force ProGuard to consider ArtifactRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ArtifactRule.class);
  }

  /**
   * This field contains the public keys that can be used to verify the signatures on the step
   * metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SigningKey> signingKeys;

  /**
   * This field identifies the name of the step in the supply chain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepName;

  /**
   * This field contains a value that indicates the minimum number of keys that need to be used to
   * sign the step's in-toto link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long threshold;

  /**
   * This field contains the expected command used to perform the step.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExpectedCommand() {
    return expectedCommand;
  }

  /**
   * This field contains the expected command used to perform the step.
   * @param expectedCommand expectedCommand or {@code null} for none
   */
  public InToto setExpectedCommand(java.util.List<java.lang.String> expectedCommand) {
    this.expectedCommand = expectedCommand;
    return this;
  }

  /**
   * The following fields contain in-toto artifact rules identifying the artifacts that enter this
   * supply chain step, and exit the supply chain step, i.e. materials and products of the step.
   * @return value or {@code null} for none
   */
  public java.util.List<ArtifactRule> getExpectedMaterials() {
    return expectedMaterials;
  }

  /**
   * The following fields contain in-toto artifact rules identifying the artifacts that enter this
   * supply chain step, and exit the supply chain step, i.e. materials and products of the step.
   * @param expectedMaterials expectedMaterials or {@code null} for none
   */
  public InToto setExpectedMaterials(java.util.List<ArtifactRule> expectedMaterials) {
    this.expectedMaterials = expectedMaterials;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ArtifactRule> getExpectedProducts() {
    return expectedProducts;
  }

  /**
   * @param expectedProducts expectedProducts or {@code null} for none
   */
  public InToto setExpectedProducts(java.util.List<ArtifactRule> expectedProducts) {
    this.expectedProducts = expectedProducts;
    return this;
  }

  /**
   * This field contains the public keys that can be used to verify the signatures on the step
   * metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<SigningKey> getSigningKeys() {
    return signingKeys;
  }

  /**
   * This field contains the public keys that can be used to verify the signatures on the step
   * metadata.
   * @param signingKeys signingKeys or {@code null} for none
   */
  public InToto setSigningKeys(java.util.List<SigningKey> signingKeys) {
    this.signingKeys = signingKeys;
    return this;
  }

  /**
   * This field identifies the name of the step in the supply chain.
   * @return value or {@code null} for none
   */
  public java.lang.String getStepName() {
    return stepName;
  }

  /**
   * This field identifies the name of the step in the supply chain.
   * @param stepName stepName or {@code null} for none
   */
  public InToto setStepName(java.lang.String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * This field contains a value that indicates the minimum number of keys that need to be used to
   * sign the step's in-toto link.
   * @return value or {@code null} for none
   */
  public java.lang.Long getThreshold() {
    return threshold;
  }

  /**
   * This field contains a value that indicates the minimum number of keys that need to be used to
   * sign the step's in-toto link.
   * @param threshold threshold or {@code null} for none
   */
  public InToto setThreshold(java.lang.Long threshold) {
    this.threshold = threshold;
    return this;
  }

  @Override
  public InToto set(String fieldName, Object value) {
    return (InToto) super.set(fieldName, value);
  }

  @Override
  public InToto clone() {
    return (InToto) super.clone();
  }

}