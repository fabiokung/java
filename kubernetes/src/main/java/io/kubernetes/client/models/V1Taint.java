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
 * The node this Taint is attached to has the \&quot;effect\&quot; on any pod that does not tolerate the Taint.
 */
@ApiModel(description = "The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1Taint {
  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private String effect;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TIME_ADDED = "timeAdded";
  @SerializedName(SERIALIZED_NAME_TIME_ADDED)
  private DateTime timeAdded;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public V1Taint effect(String effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
   * @return effect
  **/
  @ApiModelProperty(required = true, value = "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.")

  public String getEffect() {
    return effect;
  }



  public void setEffect(String effect) {
    this.effect = effect;
  }


  public V1Taint key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Required. The taint key to be applied to a node.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Required. The taint key to be applied to a node.")

  public String getKey() {
    return key;
  }



  public void setKey(String key) {
    this.key = key;
  }


  public V1Taint timeAdded(DateTime timeAdded) {
    
    this.timeAdded = timeAdded;
    return this;
  }

   /**
   * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
   * @return timeAdded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.")

  public DateTime getTimeAdded() {
    return timeAdded;
  }



  public void setTimeAdded(DateTime timeAdded) {
    this.timeAdded = timeAdded;
  }


  public V1Taint value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Required. The taint value corresponding to the taint key.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required. The taint value corresponding to the taint key.")

  public String getValue() {
    return value;
  }



  public void setValue(String value) {
    this.value = value;
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
    sb.append("class V1Taint {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

