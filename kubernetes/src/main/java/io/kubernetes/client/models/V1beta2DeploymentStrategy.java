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
import io.kubernetes.client.models.V1beta2RollingUpdateDeployment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 */
@ApiModel(description = "DeploymentStrategy describes how to replace existing pods with new ones.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta2DeploymentStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";
  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1beta2RollingUpdateDeployment rollingUpdate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1beta2DeploymentStrategy rollingUpdate(V1beta2RollingUpdateDeployment rollingUpdate) {
    
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Get rollingUpdate
   * @return rollingUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2RollingUpdateDeployment getRollingUpdate() {
    return rollingUpdate;
  }



  public void setRollingUpdate(V1beta2RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }


  public V1beta2DeploymentStrategy type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
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
    sb.append("class V1beta2DeploymentStrategy {\n");
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

