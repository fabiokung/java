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
import io.kubernetes.client.models.AppsV1beta1RollbackConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
 */
@ApiModel(description = "DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class AppsV1beta1DeploymentRollback {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLLBACK_TO = "rollbackTo";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TO)
  private AppsV1beta1RollbackConfig rollbackTo;

  public static final String SERIALIZED_NAME_UPDATED_ANNOTATIONS = "updatedAnnotations";
  @SerializedName(SERIALIZED_NAME_UPDATED_ANNOTATIONS)
  private Map<String, String> updatedAnnotations = null;


  public AppsV1beta1DeploymentRollback apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }



  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public AppsV1beta1DeploymentRollback kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }



  public void setKind(String kind) {
    this.kind = kind;
  }


  public AppsV1beta1DeploymentRollback name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Required: This must match the Name of a deployment.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Required: This must match the Name of a deployment.")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public AppsV1beta1DeploymentRollback rollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    
    this.rollbackTo = rollbackTo;
    return this;
  }

   /**
   * Get rollbackTo
   * @return rollbackTo
  **/
  @ApiModelProperty(required = true, value = "")

  public AppsV1beta1RollbackConfig getRollbackTo() {
    return rollbackTo;
  }



  public void setRollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
  }


  public AppsV1beta1DeploymentRollback updatedAnnotations(Map<String, String> updatedAnnotations) {
    
    this.updatedAnnotations = updatedAnnotations;
    return this;
  }

  public AppsV1beta1DeploymentRollback putUpdatedAnnotationsItem(String key, String updatedAnnotationsItem) {
    if (this.updatedAnnotations == null) {
      this.updatedAnnotations = new HashMap<String, String>();
    }
    this.updatedAnnotations.put(key, updatedAnnotationsItem);
    return this;
  }

   /**
   * The annotations to be updated to a deployment
   * @return updatedAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The annotations to be updated to a deployment")

  public Map<String, String> getUpdatedAnnotations() {
    return updatedAnnotations;
  }



  public void setUpdatedAnnotations(Map<String, String> updatedAnnotations) {
    this.updatedAnnotations = updatedAnnotations;
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
    sb.append("class AppsV1beta1DeploymentRollback {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rollbackTo: ").append(toIndentedString(rollbackTo)).append("\n");
    sb.append("    updatedAnnotations: ").append(toIndentedString(updatedAnnotations)).append("\n");
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

