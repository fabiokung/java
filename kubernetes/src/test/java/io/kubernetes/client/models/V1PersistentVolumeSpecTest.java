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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.models.V1AzureDiskVolumeSource;
import io.kubernetes.client.models.V1AzureFilePersistentVolumeSource;
import io.kubernetes.client.models.V1CSIPersistentVolumeSource;
import io.kubernetes.client.models.V1CephFSPersistentVolumeSource;
import io.kubernetes.client.models.V1CinderPersistentVolumeSource;
import io.kubernetes.client.models.V1FCVolumeSource;
import io.kubernetes.client.models.V1FlexPersistentVolumeSource;
import io.kubernetes.client.models.V1FlockerVolumeSource;
import io.kubernetes.client.models.V1GCEPersistentDiskVolumeSource;
import io.kubernetes.client.models.V1GlusterfsPersistentVolumeSource;
import io.kubernetes.client.models.V1HostPathVolumeSource;
import io.kubernetes.client.models.V1ISCSIPersistentVolumeSource;
import io.kubernetes.client.models.V1LocalVolumeSource;
import io.kubernetes.client.models.V1NFSVolumeSource;
import io.kubernetes.client.models.V1ObjectReference;
import io.kubernetes.client.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.models.V1PortworxVolumeSource;
import io.kubernetes.client.models.V1QuobyteVolumeSource;
import io.kubernetes.client.models.V1RBDPersistentVolumeSource;
import io.kubernetes.client.models.V1ScaleIOPersistentVolumeSource;
import io.kubernetes.client.models.V1StorageOSPersistentVolumeSource;
import io.kubernetes.client.models.V1VolumeNodeAffinity;
import io.kubernetes.client.models.V1VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for V1PersistentVolumeSpec
 */
public class V1PersistentVolumeSpecTest {
    private final V1PersistentVolumeSpec model = new V1PersistentVolumeSpec();

    /**
     * Model tests for V1PersistentVolumeSpec
     */
    @Test
    public void testV1PersistentVolumeSpec() {
        // TODO: test V1PersistentVolumeSpec
    }

    /**
     * Test the property 'accessModes'
     */
    @Test
    public void accessModesTest() {
        // TODO: test accessModes
    }

    /**
     * Test the property 'awsElasticBlockStore'
     */
    @Test
    public void awsElasticBlockStoreTest() {
        // TODO: test awsElasticBlockStore
    }

    /**
     * Test the property 'azureDisk'
     */
    @Test
    public void azureDiskTest() {
        // TODO: test azureDisk
    }

    /**
     * Test the property 'azureFile'
     */
    @Test
    public void azureFileTest() {
        // TODO: test azureFile
    }

    /**
     * Test the property 'capacity'
     */
    @Test
    public void capacityTest() {
        // TODO: test capacity
    }

    /**
     * Test the property 'cephfs'
     */
    @Test
    public void cephfsTest() {
        // TODO: test cephfs
    }

    /**
     * Test the property 'cinder'
     */
    @Test
    public void cinderTest() {
        // TODO: test cinder
    }

    /**
     * Test the property 'claimRef'
     */
    @Test
    public void claimRefTest() {
        // TODO: test claimRef
    }

    /**
     * Test the property 'csi'
     */
    @Test
    public void csiTest() {
        // TODO: test csi
    }

    /**
     * Test the property 'fc'
     */
    @Test
    public void fcTest() {
        // TODO: test fc
    }

    /**
     * Test the property 'flexVolume'
     */
    @Test
    public void flexVolumeTest() {
        // TODO: test flexVolume
    }

    /**
     * Test the property 'flocker'
     */
    @Test
    public void flockerTest() {
        // TODO: test flocker
    }

    /**
     * Test the property 'gcePersistentDisk'
     */
    @Test
    public void gcePersistentDiskTest() {
        // TODO: test gcePersistentDisk
    }

    /**
     * Test the property 'glusterfs'
     */
    @Test
    public void glusterfsTest() {
        // TODO: test glusterfs
    }

    /**
     * Test the property 'hostPath'
     */
    @Test
    public void hostPathTest() {
        // TODO: test hostPath
    }

    /**
     * Test the property 'iscsi'
     */
    @Test
    public void iscsiTest() {
        // TODO: test iscsi
    }

    /**
     * Test the property 'local'
     */
    @Test
    public void localTest() {
        // TODO: test local
    }

    /**
     * Test the property 'mountOptions'
     */
    @Test
    public void mountOptionsTest() {
        // TODO: test mountOptions
    }

    /**
     * Test the property 'nfs'
     */
    @Test
    public void nfsTest() {
        // TODO: test nfs
    }

    /**
     * Test the property 'nodeAffinity'
     */
    @Test
    public void nodeAffinityTest() {
        // TODO: test nodeAffinity
    }

    /**
     * Test the property 'persistentVolumeReclaimPolicy'
     */
    @Test
    public void persistentVolumeReclaimPolicyTest() {
        // TODO: test persistentVolumeReclaimPolicy
    }

    /**
     * Test the property 'photonPersistentDisk'
     */
    @Test
    public void photonPersistentDiskTest() {
        // TODO: test photonPersistentDisk
    }

    /**
     * Test the property 'portworxVolume'
     */
    @Test
    public void portworxVolumeTest() {
        // TODO: test portworxVolume
    }

    /**
     * Test the property 'quobyte'
     */
    @Test
    public void quobyteTest() {
        // TODO: test quobyte
    }

    /**
     * Test the property 'rbd'
     */
    @Test
    public void rbdTest() {
        // TODO: test rbd
    }

    /**
     * Test the property 'scaleIO'
     */
    @Test
    public void scaleIOTest() {
        // TODO: test scaleIO
    }

    /**
     * Test the property 'storageClassName'
     */
    @Test
    public void storageClassNameTest() {
        // TODO: test storageClassName
    }

    /**
     * Test the property 'storageos'
     */
    @Test
    public void storageosTest() {
        // TODO: test storageos
    }

    /**
     * Test the property 'volumeMode'
     */
    @Test
    public void volumeModeTest() {
        // TODO: test volumeMode
    }

    /**
     * Test the property 'vsphereVolume'
     */
    @Test
    public void vsphereVolumeTest() {
        // TODO: test vsphereVolume
    }

}
