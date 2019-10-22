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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 */
@ApiModel(description = "PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta1PodDisruptionBudgetStatus {
  public static final String SERIALIZED_NAME_CURRENT_HEALTHY = "currentHealthy";
  @SerializedName(SERIALIZED_NAME_CURRENT_HEALTHY)
  private Integer currentHealthy;

  public static final String SERIALIZED_NAME_DESIRED_HEALTHY = "desiredHealthy";
  @SerializedName(SERIALIZED_NAME_DESIRED_HEALTHY)
  private Integer desiredHealthy;

  public static final String SERIALIZED_NAME_DISRUPTED_PODS = "disruptedPods";
  @SerializedName(SERIALIZED_NAME_DISRUPTED_PODS)
  private Map<String, DateTime> disruptedPods = null;

  public static final String SERIALIZED_NAME_DISRUPTIONS_ALLOWED = "disruptionsAllowed";
  @SerializedName(SERIALIZED_NAME_DISRUPTIONS_ALLOWED)
  private Integer disruptionsAllowed;

  public static final String SERIALIZED_NAME_EXPECTED_PODS = "expectedPods";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PODS)
  private Integer expectedPods;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;


  public V1beta1PodDisruptionBudgetStatus currentHealthy(Integer currentHealthy) {
    
    this.currentHealthy = currentHealthy;
    return this;
  }

   /**
   * current number of healthy pods
   * @return currentHealthy
  **/
  @ApiModelProperty(required = true, value = "current number of healthy pods")

  public Integer getCurrentHealthy() {
    return currentHealthy;
  }



  public void setCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
  }


  public V1beta1PodDisruptionBudgetStatus desiredHealthy(Integer desiredHealthy) {
    
    this.desiredHealthy = desiredHealthy;
    return this;
  }

   /**
   * minimum desired number of healthy pods
   * @return desiredHealthy
  **/
  @ApiModelProperty(required = true, value = "minimum desired number of healthy pods")

  public Integer getDesiredHealthy() {
    return desiredHealthy;
  }



  public void setDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
  }


  public V1beta1PodDisruptionBudgetStatus disruptedPods(Map<String, DateTime> disruptedPods) {
    
    this.disruptedPods = disruptedPods;
    return this;
  }

  public V1beta1PodDisruptionBudgetStatus putDisruptedPodsItem(String key, DateTime disruptedPodsItem) {
    if (this.disruptedPods == null) {
      this.disruptedPods = new HashMap<String, DateTime>();
    }
    this.disruptedPods.put(key, disruptedPodsItem);
    return this;
  }

   /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
   * @return disruptedPods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.")

  public Map<String, DateTime> getDisruptedPods() {
    return disruptedPods;
  }



  public void setDisruptedPods(Map<String, DateTime> disruptedPods) {
    this.disruptedPods = disruptedPods;
  }


  public V1beta1PodDisruptionBudgetStatus disruptionsAllowed(Integer disruptionsAllowed) {
    
    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

   /**
   * Number of pod disruptions that are currently allowed.
   * @return disruptionsAllowed
  **/
  @ApiModelProperty(required = true, value = "Number of pod disruptions that are currently allowed.")

  public Integer getDisruptionsAllowed() {
    return disruptionsAllowed;
  }



  public void setDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
  }


  public V1beta1PodDisruptionBudgetStatus expectedPods(Integer expectedPods) {
    
    this.expectedPods = expectedPods;
    return this;
  }

   /**
   * total number of pods counted by this disruption budget
   * @return expectedPods
  **/
  @ApiModelProperty(required = true, value = "total number of pods counted by this disruption budget")

  public Integer getExpectedPods() {
    return expectedPods;
  }



  public void setExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
  }


  public V1beta1PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB&#39;s object generation.
   * @return observedGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB's object generation.")

  public Long getObservedGeneration() {
    return observedGeneration;
  }



  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
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
    sb.append("class V1beta1PodDisruptionBudgetStatus {\n");
    sb.append("    currentHealthy: ").append(toIndentedString(currentHealthy)).append("\n");
    sb.append("    desiredHealthy: ").append(toIndentedString(desiredHealthy)).append("\n");
    sb.append("    disruptedPods: ").append(toIndentedString(disruptedPods)).append("\n");
    sb.append("    disruptionsAllowed: ").append(toIndentedString(disruptionsAllowed)).append("\n");
    sb.append("    expectedPods: ").append(toIndentedString(expectedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

