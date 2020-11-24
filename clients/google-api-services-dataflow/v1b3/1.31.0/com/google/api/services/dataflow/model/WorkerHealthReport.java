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
 * WorkerHealthReport contains information about the health of a worker. The VM should be identified
 * by the labels attached to the WorkerMessage that this health ping belongs to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerHealthReport extends com.google.api.client.json.GenericJson {

  /**
   * A message describing any unusual health reports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String msg;

  /**
   * The pods running on the worker. See: http://kubernetes.io/v1.1/docs/api-
   * reference/v1/definitions.html#_v1_pod This field is used by the worker to send the status of
   * the indvidual containers running on each worker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> pods;

  /**
   * The interval at which the worker is sending health reports. The default value of 0 should be
   * interpreted as the field is not being explicitly set by the worker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportInterval;

  /**
   * Whether the VM is in a permanently broken state. Broken VMs should be abandoned or deleted ASAP
   * to avoid assigning or completing any work.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vmIsBroken;

  /**
   * Whether the VM is currently healthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vmIsHealthy;

  /**
   * The time the VM was booted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String vmStartupTime;

  /**
   * A message describing any unusual health reports.
   * @return value or {@code null} for none
   */
  public java.lang.String getMsg() {
    return msg;
  }

  /**
   * A message describing any unusual health reports.
   * @param msg msg or {@code null} for none
   */
  public WorkerHealthReport setMsg(java.lang.String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * The pods running on the worker. See: http://kubernetes.io/v1.1/docs/api-
   * reference/v1/definitions.html#_v1_pod This field is used by the worker to send the status of
   * the indvidual containers running on each worker.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getPods() {
    return pods;
  }

  /**
   * The pods running on the worker. See: http://kubernetes.io/v1.1/docs/api-
   * reference/v1/definitions.html#_v1_pod This field is used by the worker to send the status of
   * the indvidual containers running on each worker.
   * @param pods pods or {@code null} for none
   */
  public WorkerHealthReport setPods(java.util.List<java.util.Map<String, java.lang.Object>> pods) {
    this.pods = pods;
    return this;
  }

  /**
   * The interval at which the worker is sending health reports. The default value of 0 should be
   * interpreted as the field is not being explicitly set by the worker.
   * @return value or {@code null} for none
   */
  public String getReportInterval() {
    return reportInterval;
  }

  /**
   * The interval at which the worker is sending health reports. The default value of 0 should be
   * interpreted as the field is not being explicitly set by the worker.
   * @param reportInterval reportInterval or {@code null} for none
   */
  public WorkerHealthReport setReportInterval(String reportInterval) {
    this.reportInterval = reportInterval;
    return this;
  }

  /**
   * Whether the VM is in a permanently broken state. Broken VMs should be abandoned or deleted ASAP
   * to avoid assigning or completing any work.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVmIsBroken() {
    return vmIsBroken;
  }

  /**
   * Whether the VM is in a permanently broken state. Broken VMs should be abandoned or deleted ASAP
   * to avoid assigning or completing any work.
   * @param vmIsBroken vmIsBroken or {@code null} for none
   */
  public WorkerHealthReport setVmIsBroken(java.lang.Boolean vmIsBroken) {
    this.vmIsBroken = vmIsBroken;
    return this;
  }

  /**
   * Whether the VM is currently healthy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVmIsHealthy() {
    return vmIsHealthy;
  }

  /**
   * Whether the VM is currently healthy.
   * @param vmIsHealthy vmIsHealthy or {@code null} for none
   */
  public WorkerHealthReport setVmIsHealthy(java.lang.Boolean vmIsHealthy) {
    this.vmIsHealthy = vmIsHealthy;
    return this;
  }

  /**
   * The time the VM was booted.
   * @return value or {@code null} for none
   */
  public String getVmStartupTime() {
    return vmStartupTime;
  }

  /**
   * The time the VM was booted.
   * @param vmStartupTime vmStartupTime or {@code null} for none
   */
  public WorkerHealthReport setVmStartupTime(String vmStartupTime) {
    this.vmStartupTime = vmStartupTime;
    return this;
  }

  @Override
  public WorkerHealthReport set(String fieldName, Object value) {
    return (WorkerHealthReport) super.set(fieldName, value);
  }

  @Override
  public WorkerHealthReport clone() {
    return (WorkerHealthReport) super.clone();
  }

}
