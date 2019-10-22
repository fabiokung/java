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
import io.kubernetes.client.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * CronJobStatus represents the current state of a cron job.
 */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta1CronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private DateTime lastScheduleTime;


  public V1beta1CronJobStatus active(List<V1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public V1beta1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * A list of pointers to currently running jobs.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")

  public List<V1ObjectReference> getActive() {
    return active;
  }



  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }


  public V1beta1CronJobStatus lastScheduleTime(DateTime lastScheduleTime) {
    
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")

  public DateTime getLastScheduleTime() {
    return lastScheduleTime;
  }



  public void setLastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
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
    sb.append("class V1beta1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
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

