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
 * A directional edge.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1Edge extends com.google.api.client.json.GenericJson {

  /**
   * The source node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceNode;

  /**
   * The target node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetNode;

  /**
   * The source node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceNode() {
    return sourceNode;
  }

  /**
   * The source node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * @param sourceNode sourceNode or {@code null} for none
   */
  public GoogleCloudAssetV1Edge setSourceNode(java.lang.String sourceNode) {
    this.sourceNode = sourceNode;
    return this;
  }

  /**
   * The target node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetNode() {
    return targetNode;
  }

  /**
   * The target node of the edge. For example, it could be a full resource name for a resource node
   * or an email of an identity.
   * @param targetNode targetNode or {@code null} for none
   */
  public GoogleCloudAssetV1Edge setTargetNode(java.lang.String targetNode) {
    this.targetNode = targetNode;
    return this;
  }

  @Override
  public GoogleCloudAssetV1Edge set(String fieldName, Object value) {
    return (GoogleCloudAssetV1Edge) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1Edge clone() {
    return (GoogleCloudAssetV1Edge) super.clone();
  }

}
