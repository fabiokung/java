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
import io.kubernetes.client.models.V1Handler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
@ApiModel(description = "Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T00:42:19.661Z[Etc/UTC]")
public class V1Lifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";
  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1Handler postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";
  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1Handler preStop;


  public V1Lifecycle postStart(V1Handler postStart) {
    
    this.postStart = postStart;
    return this;
  }

   /**
   * Get postStart
   * @return postStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Handler getPostStart() {
    return postStart;
  }



  public void setPostStart(V1Handler postStart) {
    this.postStart = postStart;
  }


  public V1Lifecycle preStop(V1Handler preStop) {
    
    this.preStop = preStop;
    return this;
  }

   /**
   * Get preStop
   * @return preStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Handler getPreStop() {
    return preStop;
  }



  public void setPreStop(V1Handler preStop) {
    this.preStop = preStop;
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
    sb.append("class V1Lifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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

