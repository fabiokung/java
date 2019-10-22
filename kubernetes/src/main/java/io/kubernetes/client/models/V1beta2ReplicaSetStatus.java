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
import io.kubernetes.client.models.V1beta2ReplicaSetCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 */
@ApiModel(description = "ReplicaSetStatus represents the current status of a ReplicaSet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta2ReplicaSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta2ReplicaSetCondition> conditions = null;

  public static final String SERIALIZED_NAME_FULLY_LABELED_REPLICAS = "fullyLabeledReplicas";
  @SerializedName(SERIALIZED_NAME_FULLY_LABELED_REPLICAS)
  private Integer fullyLabeledReplicas;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;


  public V1beta2ReplicaSetStatus availableReplicas(Integer availableReplicas) {
    
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   * @return availableReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of available replicas (ready for at least minReadySeconds) for this replica set.")

  public Integer getAvailableReplicas() {
    return availableReplicas;
  }



  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public V1beta2ReplicaSetStatus conditions(List<V1beta2ReplicaSetCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1beta2ReplicaSetStatus addConditionsItem(V1beta2ReplicaSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta2ReplicaSetCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a replica set&#39;s current state.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a replica set's current state.")

  public List<V1beta2ReplicaSetCondition> getConditions() {
    return conditions;
  }



  public void setConditions(List<V1beta2ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }


  public V1beta2ReplicaSetStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

   /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   * @return fullyLabeledReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pods that have labels matching the labels of the pod template of the replicaset.")

  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }



  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }


  public V1beta2ReplicaSetStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   * @return observedGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed ReplicaSet.")

  public Long getObservedGeneration() {
    return observedGeneration;
  }



  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1beta2ReplicaSetStatus readyReplicas(Integer readyReplicas) {
    
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * The number of ready replicas for this replica set.
   * @return readyReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of ready replicas for this replica set.")

  public Integer getReadyReplicas() {
    return readyReplicas;
  }



  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public V1beta2ReplicaSetStatus replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")

  public Integer getReplicas() {
    return replicas;
  }



  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
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
    sb.append("class V1beta2ReplicaSetStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

