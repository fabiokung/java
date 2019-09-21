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
import java.util.ArrayList;
import java.util.List;

/**
 * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. \&quot;192.168.1.1/24\&quot;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 */
@ApiModel(description = "DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. \"192.168.1.1/24\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T00:42:19.661Z[Etc/UTC]")
public class V1beta1IPBlock {
  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_EXCEPT = "except";
  @SerializedName(SERIALIZED_NAME_EXCEPT)
  private List<String> except = null;


  public V1beta1IPBlock cidr(String cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * CIDR is a string representing the IP Block Valid examples are \&quot;192.168.1.1/24\&quot;
   * @return cidr
  **/
  @ApiModelProperty(required = true, value = "CIDR is a string representing the IP Block Valid examples are \"192.168.1.1/24\"")

  public String getCidr() {
    return cidr;
  }



  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  public V1beta1IPBlock except(List<String> except) {
    
    this.except = except;
    return this;
  }

  public V1beta1IPBlock addExceptItem(String exceptItem) {
    if (this.except == null) {
      this.except = new ArrayList<String>();
    }
    this.except.add(exceptItem);
    return this;
  }

   /**
   * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \&quot;192.168.1.1/24\&quot; Except values will be rejected if they are outside the CIDR range
   * @return except
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \"192.168.1.1/24\" Except values will be rejected if they are outside the CIDR range")

  public List<String> getExcept() {
    return except;
  }



  public void setExcept(List<String> except) {
    this.except = except;
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
    sb.append("class V1beta1IPBlock {\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    except: ").append(toIndentedString(except)).append("\n");
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

