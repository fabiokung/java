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

/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 */
@ApiModel(description = "RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T00:42:19.661Z[Etc/UTC]")
public class V1RollingUpdateStatefulSetStrategy {
  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;


  public V1RollingUpdateStatefulSetStrategy partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.")

  public Integer getPartition() {
    return partition;
  }



  public void setPartition(Integer partition) {
    this.partition = partition;
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
    sb.append("class V1RollingUpdateStatefulSetStrategy {\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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

