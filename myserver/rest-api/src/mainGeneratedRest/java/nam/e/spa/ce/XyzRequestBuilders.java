
package nam.e.spa.ce;

import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Created by hanyuandong on 2017/8/19.
 * 
 * generated from: com.newsoftvalley.myserver.rest.resources.XyzResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from /Users/hanyuandong/Desktop/1_myserver-backend_trunk/myserver/rest-api/src/main/idl/nam.e.spa.ce.xyz.restspec.json.", date = "Sun Aug 20 22:30:38 PDT 2017")
public class XyzRequestBuilders
    extends BuilderBase
{

    private final static String ORIGINAL_RESOURCE_PATH = "xyz";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<String, DynamicRecordMetadata> requestMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, DynamicRecordMetadata> responseMetadataMap = new HashMap<String, DynamicRecordMetadata>();
        HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.CREATE, ResourceMethod.UPDATE, ResourceMethod.DELETE), requestMetadataMap, responseMetadataMap, ComplexResourceKey.class, XyzKey.class, EmptyRecord.class, Xyz.class, keyParts);
    }

    public XyzRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public XyzRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public XyzRequestBuilders(String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public XyzRequestBuilders(String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public XyzUpdateRequestBuilder update() {
        return new XyzUpdateRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzGetRequestBuilder get() {
        return new XyzGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzDeleteRequestBuilder delete() {
        return new XyzDeleteRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public XyzCreateRequestBuilder create() {
        return new XyzCreateRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

}
