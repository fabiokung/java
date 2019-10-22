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
import org.joda.time.DateTime;

/**
 * V1beta1CertificateSigningRequestCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta1CertificateSigningRequestCondition {
  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private DateTime lastUpdateTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1beta1CertificateSigningRequestCondition lastUpdateTime(DateTime lastUpdateTime) {
    
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * timestamp for the last update to this condition
   * @return lastUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp for the last update to this condition")

  public DateTime getLastUpdateTime() {
    return lastUpdateTime;
  }



  public void setLastUpdateTime(DateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  public V1beta1CertificateSigningRequestCondition message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * human readable message with details about the request state
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "human readable message with details about the request state")

  public String getMessage() {
    return message;
  }



  public void setMessage(String message) {
    this.message = message;
  }


  public V1beta1CertificateSigningRequestCondition reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * brief reason for the request state
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "brief reason for the request state")

  public String getReason() {
    return reason;
  }



  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1beta1CertificateSigningRequestCondition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * request approval state, currently Approved or Denied.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "request approval state, currently Approved or Denied.")

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
    sb.append("class V1beta1CertificateSigningRequestCondition {\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

