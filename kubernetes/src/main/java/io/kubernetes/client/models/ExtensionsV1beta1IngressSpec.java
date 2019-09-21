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
import io.kubernetes.client.models.ExtensionsV1beta1IngressBackend;
import io.kubernetes.client.models.ExtensionsV1beta1IngressRule;
import io.kubernetes.client.models.ExtensionsV1beta1IngressTLS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@ApiModel(description = "IngressSpec describes the Ingress the user wishes to exist.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T00:42:19.661Z[Etc/UTC]")
public class ExtensionsV1beta1IngressSpec {
  public static final String SERIALIZED_NAME_BACKEND = "backend";
  @SerializedName(SERIALIZED_NAME_BACKEND)
  private ExtensionsV1beta1IngressBackend backend;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ExtensionsV1beta1IngressRule> rules = null;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private List<ExtensionsV1beta1IngressTLS> tls = null;


  public ExtensionsV1beta1IngressSpec backend(ExtensionsV1beta1IngressBackend backend) {
    
    this.backend = backend;
    return this;
  }

   /**
   * Get backend
   * @return backend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtensionsV1beta1IngressBackend getBackend() {
    return backend;
  }



  public void setBackend(ExtensionsV1beta1IngressBackend backend) {
    this.backend = backend;
  }


  public ExtensionsV1beta1IngressSpec rules(List<ExtensionsV1beta1IngressRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public ExtensionsV1beta1IngressSpec addRulesItem(ExtensionsV1beta1IngressRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ExtensionsV1beta1IngressRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.")

  public List<ExtensionsV1beta1IngressRule> getRules() {
    return rules;
  }



  public void setRules(List<ExtensionsV1beta1IngressRule> rules) {
    this.rules = rules;
  }


  public ExtensionsV1beta1IngressSpec tls(List<ExtensionsV1beta1IngressTLS> tls) {
    
    this.tls = tls;
    return this;
  }

  public ExtensionsV1beta1IngressSpec addTlsItem(ExtensionsV1beta1IngressTLS tlsItem) {
    if (this.tls == null) {
      this.tls = new ArrayList<ExtensionsV1beta1IngressTLS>();
    }
    this.tls.add(tlsItem);
    return this;
  }

   /**
   * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.")

  public List<ExtensionsV1beta1IngressTLS> getTls() {
    return tls;
  }



  public void setTls(List<ExtensionsV1beta1IngressTLS> tls) {
    this.tls = tls;
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
    sb.append("class ExtensionsV1beta1IngressSpec {\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

