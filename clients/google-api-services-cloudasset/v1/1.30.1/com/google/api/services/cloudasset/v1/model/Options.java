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
 * Contains query options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Options extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, the response will include access analysis from identities to resources via
   * service account impersonation. This is a very expensive operation, because many derived queries
   * will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc
   * instead. For example, if the request analyzes for which resources user A has permission P, and
   * there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a
   * service account SA, and there's another IAM policy states service account SA has permission P
   * to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced
   * analysis results will be included in
   * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the
   * request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states
   * user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another
   * IAM policy states service account SA has permission P to the GCP folder F, then user A
   * potentially has access to the GCP folder F. And those advanced analysis results will be
   * included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean analyzeServiceAccountImpersonation;

  /**
   * Optional. If true, the identities section of the result will expand any Google groups appearing
   * in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the
   * identity in the result will be determined by the selector, and this flag is not allowed to set.
   * Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean expandGroups;

  /**
   * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource
   * section of the result will expand any resource attached to an IAM policy to include resources
   * lower in the resource hierarchy. For example, if the request analyzes for which resources user
   * A has permission P, and the results include an IAM policy with P on a GCP folder, the results
   * will also include resources in that folder with permission P. If true and
   * IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will
   * expand the specified resource to include resources lower in the resource hierarchy. Only
   * project or lower resources are supported. Folder and organization resource cannot be used
   * together with this option. For example, if the request analyzes for which users have permission
   * P on a GCP project with this option enabled, the results will include all users who have
   * permission P on that project or any lower resource. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean expandResources;

  /**
   * Optional. If true, the access section of result will expand any roles appearing in IAM policy
   * bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified,
   * the access section of the result will be determined by the selector, and this flag is not
   * allowed to set. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean expandRoles;

  /**
   * Optional. If true, the result will output group identity edges, starting from the binding's
   * group members, to any expanded identities. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean outputGroupEdges;

  /**
   * Optional. If true, the result will output resource edges, starting from the policy attached
   * resource, to any expanded resources. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean outputResourceEdges;

  /**
   * Optional. If true, the response will include access analysis from identities to resources via
   * service account impersonation. This is a very expensive operation, because many derived queries
   * will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc
   * instead. For example, if the request analyzes for which resources user A has permission P, and
   * there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a
   * service account SA, and there's another IAM policy states service account SA has permission P
   * to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced
   * analysis results will be included in
   * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the
   * request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states
   * user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another
   * IAM policy states service account SA has permission P to the GCP folder F, then user A
   * potentially has access to the GCP folder F. And those advanced analysis results will be
   * included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAnalyzeServiceAccountImpersonation() {
    return analyzeServiceAccountImpersonation;
  }

  /**
   * Optional. If true, the response will include access analysis from identities to resources via
   * service account impersonation. This is a very expensive operation, because many derived queries
   * will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc
   * instead. For example, if the request analyzes for which resources user A has permission P, and
   * there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a
   * service account SA, and there's another IAM policy states service account SA has permission P
   * to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced
   * analysis results will be included in
   * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the
   * request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states
   * user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another
   * IAM policy states service account SA has permission P to the GCP folder F, then user A
   * potentially has access to the GCP folder F. And those advanced analysis results will be
   * included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
   * @param analyzeServiceAccountImpersonation analyzeServiceAccountImpersonation or {@code null} for none
   */
  public Options setAnalyzeServiceAccountImpersonation(java.lang.Boolean analyzeServiceAccountImpersonation) {
    this.analyzeServiceAccountImpersonation = analyzeServiceAccountImpersonation;
    return this;
  }

  /**
   * Optional. If true, the identities section of the result will expand any Google groups appearing
   * in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the
   * identity in the result will be determined by the selector, and this flag is not allowed to set.
   * Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExpandGroups() {
    return expandGroups;
  }

  /**
   * Optional. If true, the identities section of the result will expand any Google groups appearing
   * in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified, the
   * identity in the result will be determined by the selector, and this flag is not allowed to set.
   * Default is false.
   * @param expandGroups expandGroups or {@code null} for none
   */
  public Options setExpandGroups(java.lang.Boolean expandGroups) {
    this.expandGroups = expandGroups;
    return this;
  }

  /**
   * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource
   * section of the result will expand any resource attached to an IAM policy to include resources
   * lower in the resource hierarchy. For example, if the request analyzes for which resources user
   * A has permission P, and the results include an IAM policy with P on a GCP folder, the results
   * will also include resources in that folder with permission P. If true and
   * IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will
   * expand the specified resource to include resources lower in the resource hierarchy. Only
   * project or lower resources are supported. Folder and organization resource cannot be used
   * together with this option. For example, if the request analyzes for which users have permission
   * P on a GCP project with this option enabled, the results will include all users who have
   * permission P on that project or any lower resource. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExpandResources() {
    return expandResources;
  }

  /**
   * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource
   * section of the result will expand any resource attached to an IAM policy to include resources
   * lower in the resource hierarchy. For example, if the request analyzes for which resources user
   * A has permission P, and the results include an IAM policy with P on a GCP folder, the results
   * will also include resources in that folder with permission P. If true and
   * IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the result will
   * expand the specified resource to include resources lower in the resource hierarchy. Only
   * project or lower resources are supported. Folder and organization resource cannot be used
   * together with this option. For example, if the request analyzes for which users have permission
   * P on a GCP project with this option enabled, the results will include all users who have
   * permission P on that project or any lower resource. Default is false.
   * @param expandResources expandResources or {@code null} for none
   */
  public Options setExpandResources(java.lang.Boolean expandResources) {
    this.expandResources = expandResources;
    return this;
  }

  /**
   * Optional. If true, the access section of result will expand any roles appearing in IAM policy
   * bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified,
   * the access section of the result will be determined by the selector, and this flag is not
   * allowed to set. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExpandRoles() {
    return expandRoles;
  }

  /**
   * Optional. If true, the access section of result will expand any roles appearing in IAM policy
   * bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is specified,
   * the access section of the result will be determined by the selector, and this flag is not
   * allowed to set. Default is false.
   * @param expandRoles expandRoles or {@code null} for none
   */
  public Options setExpandRoles(java.lang.Boolean expandRoles) {
    this.expandRoles = expandRoles;
    return this;
  }

  /**
   * Optional. If true, the result will output group identity edges, starting from the binding's
   * group members, to any expanded identities. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOutputGroupEdges() {
    return outputGroupEdges;
  }

  /**
   * Optional. If true, the result will output group identity edges, starting from the binding's
   * group members, to any expanded identities. Default is false.
   * @param outputGroupEdges outputGroupEdges or {@code null} for none
   */
  public Options setOutputGroupEdges(java.lang.Boolean outputGroupEdges) {
    this.outputGroupEdges = outputGroupEdges;
    return this;
  }

  /**
   * Optional. If true, the result will output resource edges, starting from the policy attached
   * resource, to any expanded resources. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOutputResourceEdges() {
    return outputResourceEdges;
  }

  /**
   * Optional. If true, the result will output resource edges, starting from the policy attached
   * resource, to any expanded resources. Default is false.
   * @param outputResourceEdges outputResourceEdges or {@code null} for none
   */
  public Options setOutputResourceEdges(java.lang.Boolean outputResourceEdges) {
    this.outputResourceEdges = outputResourceEdges;
    return this;
  }

  @Override
  public Options set(String fieldName, Object value) {
    return (Options) super.set(fieldName, value);
  }

  @Override
  public Options clone() {
    return (Options) super.clone();
  }

}
