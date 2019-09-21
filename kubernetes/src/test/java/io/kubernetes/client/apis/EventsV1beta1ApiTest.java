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
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1beta1Event;
import io.kubernetes.client.models.V1beta1EventList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsV1beta1Api
 */
@Ignore
public class EventsV1beta1ApiTest {

    private final EventsV1beta1Api api = new EventsV1beta1Api();

    
    /**
     * 
     *
     * create an Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedEventTest() throws ApiException {
        String namespace = null;
        V1beta1Event body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1Event response = api.createNamespacedEvent(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedEventTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionNamespacedEvent(namespace, pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteNamespacedEvent(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

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
    
    /**
     * 
     *
     * list or watch objects of kind Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEventForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1EventList response = api.listEventForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedEventTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1EventList response = api.listNamespacedEvent(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1beta1Event response = api.patchNamespacedEvent(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1Event response = api.readNamespacedEvent(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedEventTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1Event body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1Event response = api.replaceNamespacedEvent(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
