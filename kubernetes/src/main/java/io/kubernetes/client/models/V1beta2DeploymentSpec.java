/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.kubernetes.client.models.V1beta2DeploymentStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@ApiModel(description = "DeploymentSpec is the specification of the desired behavior of the Deployment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T00:42:19.661Z[Etc/UTC]")
public class V1beta2DeploymentSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_PROGRESS_DEADLINE_SECONDS = "progressDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_PROGRESS_DEADLINE_SECONDS)
  private Integer progressDeadlineSeconds;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";
  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private V1beta2DeploymentStrategy strategy;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;


  public V1beta2DeploymentSpec minReadySeconds(Integer minReadySeconds) {
    
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")

  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }



  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }


  public V1beta2DeploymentSpec paused(Boolean paused) {
    
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that the deployment is paused.
   * @return paused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the deployment is paused.")

  public Boolean getPaused() {
    return paused;
  }



  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public V1beta2DeploymentSpec progressDeadlineSeconds(Integer progressDeadlineSeconds) {
    
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

   /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   * @return progressDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.")

  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }



  public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }


  public V1beta2DeploymentSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")

  public Integer getReplicas() {
    return replicas;
  }



  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1beta2DeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")

  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }



  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1beta2DeploymentSpec selector(V1LabelSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "")

  public V1LabelSelector getSelector() {
    return selector;
  }



  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1beta2DeploymentSpec strategy(V1beta2DeploymentStrategy strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2DeploymentStrategy getStrategy() {
    return strategy;
  }



  public void setStrategy(V1beta2DeploymentStrategy strategy) {
    this.strategy = strategy;
  }


  public V1beta2DeploymentSpec template(V1PodTemplateSpec template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")

  public V1PodTemplateSpec getTemplate() {
    return template;
  }



  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeploymentSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

