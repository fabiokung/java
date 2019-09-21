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


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1beta1TokenReview;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationV1beta1Api
 */
@Ignore
public class AuthenticationV1beta1ApiTest {

    private final AuthenticationV1beta1Api api = new AuthenticationV1beta1Api();

    
    /**
     * 
     *
     * create a TokenReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTokenReviewTest() throws ApiException {
        V1beta1TokenReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        V1beta1TokenReview response = api.createTokenReview(body, dryRun, fieldManager, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
}
