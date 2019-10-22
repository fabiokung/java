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
import io.kubernetes.client.models.V1GroupVersionForDiscovery;
import io.kubernetes.client.models.V1ServerAddressByClientCIDR;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * APIGroup contains the name, the supported versions, and the preferred version of a group.
 */
@ApiModel(description = "APIGroup contains the name, the supported versions, and the preferred version of a group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1APIGroup {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PREFERRED_VERSION = "preferredVersion";
  @SerializedName(SERIALIZED_NAME_PREFERRED_VERSION)
  private V1GroupVersionForDiscovery preferredVersion;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS_BY_CLIENT_C_I_D_RS = "serverAddressByClientCIDRs";
  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS_BY_CLIENT_C_I_D_RS)
  private List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs = null;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1GroupVersionForDiscovery> versions = new ArrayList<V1GroupVersionForDiscovery>();


  public V1APIGroup apiVersion(String apiVersion) {
    
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


  public V1APIGroup kind(String kind) {
    
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


  public V1APIGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name is the name of the group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the name of the group.")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public V1APIGroup preferredVersion(V1GroupVersionForDiscovery preferredVersion) {
    
    this.preferredVersion = preferredVersion;
    return this;
  }

   /**
   * Get preferredVersion
   * @return preferredVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1GroupVersionForDiscovery getPreferredVersion() {
    return preferredVersion;
  }



  public void setPreferredVersion(V1GroupVersionForDiscovery preferredVersion) {
    this.preferredVersion = preferredVersion;
  }


  public V1APIGroup serverAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    return this;
  }

  public V1APIGroup addServerAddressByClientCIDRsItem(V1ServerAddressByClientCIDR serverAddressByClientCIDRsItem) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs = new ArrayList<V1ServerAddressByClientCIDR>();
    }
    this.serverAddressByClientCIDRs.add(serverAddressByClientCIDRsItem);
    return this;
  }

   /**
   * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
   * @return serverAddressByClientCIDRs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.")

  public List<V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs;
  }



  public void setServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
  }


  public V1APIGroup versions(List<V1GroupVersionForDiscovery> versions) {
    
    this.versions = versions;
    return this;
  }

  public V1APIGroup addVersionsItem(V1GroupVersionForDiscovery versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * versions are the versions supported in this group.
   * @return versions
  **/
  @ApiModelProperty(required = true, value = "versions are the versions supported in this group.")

  public List<V1GroupVersionForDiscovery> getVersions() {
    return versions;
  }



  public void setVersions(List<V1GroupVersionForDiscovery> versions) {
    this.versions = versions;
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
    sb.append("class V1APIGroup {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredVersion: ").append(toIndentedString(preferredVersion)).append("\n");
    sb.append("    serverAddressByClientCIDRs: ").append(toIndentedString(serverAddressByClientCIDRs)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

