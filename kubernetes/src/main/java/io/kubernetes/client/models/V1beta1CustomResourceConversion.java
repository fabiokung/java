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
import io.kubernetes.client.models.ApiextensionsV1beta1WebhookClientConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-22T21:44:21.999Z[Etc/UTC]")
public class V1beta1CustomResourceConversion {
  public static final String SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS = "conversionReviewVersions";
  @SerializedName(SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS)
  private List<String> conversionReviewVersions = null;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public static final String SERIALIZED_NAME_WEBHOOK_CLIENT_CONFIG = "webhookClientConfig";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CLIENT_CONFIG)
  private ApiextensionsV1beta1WebhookClientConfig webhookClientConfig;


  public V1beta1CustomResourceConversion conversionReviewVersions(List<String> conversionReviewVersions) {
    
    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public V1beta1CustomResourceConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

   /**
   * ConversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to &#x60;[&#39;v1beta1&#39;]&#x60;.
   * @return conversionReviewVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, conversion will fail for this object. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Default to `['v1beta1']`.")

  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }



  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }


  public V1beta1CustomResourceConversion strategy(String strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * &#x60;strategy&#x60; specifies the conversion strategy. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the CR. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false.
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "`strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false.")

  public String getStrategy() {
    return strategy;
  }



  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  public V1beta1CustomResourceConversion webhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    
    this.webhookClientConfig = webhookClientConfig;
    return this;
  }

   /**
   * Get webhookClientConfig
   * @return webhookClientConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
    return webhookClientConfig;
  }



  public void setWebhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
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
    sb.append("class V1beta1CustomResourceConversion {\n");
    sb.append("    conversionReviewVersions: ").append(toIndentedString(conversionReviewVersions)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhookClientConfig: ").append(toIndentedString(webhookClientConfig)).append("\n");
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

