# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientRequestV1**](DefaultApi.md#clientRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/clientrequest |  |
| [**phase1TransferInitiationRequestV1**](DefaultApi.md#phase1TransferInitiationRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase1/transferinitiationrequest |  |
| [**phase1TransferInitiationResponseV1**](DefaultApi.md#phase1TransferInitiationResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase1/transferinitiationresponse |  |
| [**phase2LockEvidenceRequestV1**](DefaultApi.md#phase2LockEvidenceRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/lockevidencerequest |  |
| [**phase2LockEvidenceResponseV1**](DefaultApi.md#phase2LockEvidenceResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/lockevidenceresponse |  |
| [**phase2TransferCommenceRequestV1**](DefaultApi.md#phase2TransferCommenceRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/transfercommencerequest |  |
| [**phase2TransferCommenceResponseV1**](DefaultApi.md#phase2TransferCommenceResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/transfercommenceresponse |  |
| [**phase3CommitFinalRequestV1**](DefaultApi.md#phase3CommitFinalRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitfinalrequest |  |
| [**phase3CommitFinalResponseV1**](DefaultApi.md#phase3CommitFinalResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitfinalresponse |  |
| [**phase3CommitPreparationRequestV1**](DefaultApi.md#phase3CommitPreparationRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitpreparationrequest |  |
| [**phase3CommitPreparationResponseV1**](DefaultApi.md#phase3CommitPreparationResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitpreparationresponse |  |
| [**phase3TransferCompleteRequestV1**](DefaultApi.md#phase3TransferCompleteRequestV1) | **GET** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/transfercompleterequest |  |
| [**recoverUpdateAckV1Message**](DefaultApi.md#recoverUpdateAckV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoverupdateackmessage |  |
| [**recoverUpdateV1Message**](DefaultApi.md#recoverUpdateV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoverupdatemessage |  |
| [**recoverV1Message**](DefaultApi.md#recoverV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recovermessage |  |
| [**recoverV1Success**](DefaultApi.md#recoverV1Success) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoversuccessmessage |  |
| [**rollbackAckV1Message**](DefaultApi.md#rollbackAckV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/rollbackackmessage |  |
| [**rollbackV1Message**](DefaultApi.md#rollbackV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/rollbackmessage |  |


<a id="clientRequestV1"></a>
# **clientRequestV1**
> Object clientRequestV1(clientV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ClientV1Request clientV1Request = new ClientV1Request(); // ClientV1Request | 
    try {
      Object result = apiInstance.clientRequestV1(clientV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#clientRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientV1Request** | [**ClientV1Request**](ClientV1Request.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase1TransferInitiationRequestV1"></a>
# **phase1TransferInitiationRequestV1**
> phase1TransferInitiationRequestV1(transferInitializationV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TransferInitializationV1Request transferInitializationV1Request = new TransferInitializationV1Request(); // TransferInitializationV1Request | 
    try {
      apiInstance.phase1TransferInitiationRequestV1(transferInitializationV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase1TransferInitiationRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferInitializationV1Request** | [**TransferInitializationV1Request**](TransferInitializationV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase1TransferInitiationResponseV1"></a>
# **phase1TransferInitiationResponseV1**
> phase1TransferInitiationResponseV1(transferInitializationV1Response)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TransferInitializationV1Response transferInitializationV1Response = new TransferInitializationV1Response(); // TransferInitializationV1Response | 
    try {
      apiInstance.phase1TransferInitiationResponseV1(transferInitializationV1Response);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase1TransferInitiationResponseV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferInitializationV1Response** | [**TransferInitializationV1Response**](TransferInitializationV1Response.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase2LockEvidenceRequestV1"></a>
# **phase2LockEvidenceRequestV1**
> phase2LockEvidenceRequestV1(lockEvidenceV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    LockEvidenceV1Request lockEvidenceV1Request = new LockEvidenceV1Request(); // LockEvidenceV1Request | 
    try {
      apiInstance.phase2LockEvidenceRequestV1(lockEvidenceV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase2LockEvidenceRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lockEvidenceV1Request** | [**LockEvidenceV1Request**](LockEvidenceV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase2LockEvidenceResponseV1"></a>
# **phase2LockEvidenceResponseV1**
> phase2LockEvidenceResponseV1(lockEvidenceV1Response)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    LockEvidenceV1Response lockEvidenceV1Response = new LockEvidenceV1Response(); // LockEvidenceV1Response | 
    try {
      apiInstance.phase2LockEvidenceResponseV1(lockEvidenceV1Response);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase2LockEvidenceResponseV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lockEvidenceV1Response** | [**LockEvidenceV1Response**](LockEvidenceV1Response.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase2TransferCommenceRequestV1"></a>
# **phase2TransferCommenceRequestV1**
> phase2TransferCommenceRequestV1(transferCommenceV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TransferCommenceV1Request transferCommenceV1Request = new TransferCommenceV1Request(); // TransferCommenceV1Request | 
    try {
      apiInstance.phase2TransferCommenceRequestV1(transferCommenceV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase2TransferCommenceRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferCommenceV1Request** | [**TransferCommenceV1Request**](TransferCommenceV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase2TransferCommenceResponseV1"></a>
# **phase2TransferCommenceResponseV1**
> phase2TransferCommenceResponseV1(transferCommenceV1Response)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TransferCommenceV1Response transferCommenceV1Response = new TransferCommenceV1Response(); // TransferCommenceV1Response | 
    try {
      apiInstance.phase2TransferCommenceResponseV1(transferCommenceV1Response);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase2TransferCommenceResponseV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferCommenceV1Response** | [**TransferCommenceV1Response**](TransferCommenceV1Response.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase3CommitFinalRequestV1"></a>
# **phase3CommitFinalRequestV1**
> phase3CommitFinalRequestV1(commitFinalV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CommitFinalV1Request commitFinalV1Request = new CommitFinalV1Request(); // CommitFinalV1Request | 
    try {
      apiInstance.phase3CommitFinalRequestV1(commitFinalV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase3CommitFinalRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commitFinalV1Request** | [**CommitFinalV1Request**](CommitFinalV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase3CommitFinalResponseV1"></a>
# **phase3CommitFinalResponseV1**
> phase3CommitFinalResponseV1(commitFinalV1Response)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CommitFinalV1Response commitFinalV1Response = new CommitFinalV1Response(); // CommitFinalV1Response | 
    try {
      apiInstance.phase3CommitFinalResponseV1(commitFinalV1Response);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase3CommitFinalResponseV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commitFinalV1Response** | [**CommitFinalV1Response**](CommitFinalV1Response.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase3CommitPreparationRequestV1"></a>
# **phase3CommitPreparationRequestV1**
> phase3CommitPreparationRequestV1(commitPreparationV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CommitPreparationV1Request commitPreparationV1Request = new CommitPreparationV1Request(); // CommitPreparationV1Request | 
    try {
      apiInstance.phase3CommitPreparationRequestV1(commitPreparationV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase3CommitPreparationRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commitPreparationV1Request** | [**CommitPreparationV1Request**](CommitPreparationV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase3CommitPreparationResponseV1"></a>
# **phase3CommitPreparationResponseV1**
> phase3CommitPreparationResponseV1(commitPreparationV1Response)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CommitPreparationV1Response commitPreparationV1Response = new CommitPreparationV1Response(); // CommitPreparationV1Response | 
    try {
      apiInstance.phase3CommitPreparationResponseV1(commitPreparationV1Response);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase3CommitPreparationResponseV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commitPreparationV1Response** | [**CommitPreparationV1Response**](CommitPreparationV1Response.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="phase3TransferCompleteRequestV1"></a>
# **phase3TransferCompleteRequestV1**
> phase3TransferCompleteRequestV1(transferCompleteV1Request)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TransferCompleteV1Request transferCompleteV1Request = new TransferCompleteV1Request(); // TransferCompleteV1Request | 
    try {
      apiInstance.phase3TransferCompleteRequestV1(transferCompleteV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#phase3TransferCompleteRequestV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferCompleteV1Request** | [**TransferCompleteV1Request**](TransferCompleteV1Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recoverUpdateAckV1Message"></a>
# **recoverUpdateAckV1Message**
> recoverUpdateAckV1Message(recoverUpdateAckV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RecoverUpdateAckV1Message recoverUpdateAckV1Message = new RecoverUpdateAckV1Message(); // RecoverUpdateAckV1Message | 
    try {
      apiInstance.recoverUpdateAckV1Message(recoverUpdateAckV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#recoverUpdateAckV1Message");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recoverUpdateAckV1Message** | [**RecoverUpdateAckV1Message**](RecoverUpdateAckV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recoverUpdateV1Message"></a>
# **recoverUpdateV1Message**
> recoverUpdateV1Message(recoverUpdateV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RecoverUpdateV1Message recoverUpdateV1Message = new RecoverUpdateV1Message(); // RecoverUpdateV1Message | 
    try {
      apiInstance.recoverUpdateV1Message(recoverUpdateV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#recoverUpdateV1Message");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recoverUpdateV1Message** | [**RecoverUpdateV1Message**](RecoverUpdateV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recoverV1Message"></a>
# **recoverV1Message**
> recoverV1Message(recoverV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RecoverV1Message recoverV1Message = new RecoverV1Message(); // RecoverV1Message | 
    try {
      apiInstance.recoverV1Message(recoverV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#recoverV1Message");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recoverV1Message** | [**RecoverV1Message**](RecoverV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recoverV1Success"></a>
# **recoverV1Success**
> recoverV1Success(recoverSuccessV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RecoverSuccessV1Message recoverSuccessV1Message = new RecoverSuccessV1Message(); // RecoverSuccessV1Message | 
    try {
      apiInstance.recoverV1Success(recoverSuccessV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#recoverV1Success");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recoverSuccessV1Message** | [**RecoverSuccessV1Message**](RecoverSuccessV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rollbackAckV1Message"></a>
# **rollbackAckV1Message**
> rollbackAckV1Message(rollbackAckV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RollbackAckV1Message rollbackAckV1Message = new RollbackAckV1Message(); // RollbackAckV1Message | 
    try {
      apiInstance.rollbackAckV1Message(rollbackAckV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rollbackAckV1Message");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rollbackAckV1Message** | [**RollbackAckV1Message**](RollbackAckV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rollbackV1Message"></a>
# **rollbackV1Message**
> rollbackV1Message(rollbackV1Message)





### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RollbackV1Message rollbackV1Message = new RollbackV1Message(); // RollbackV1Message | 
    try {
      apiInstance.rollbackV1Message(rollbackV1Message);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rollbackV1Message");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rollbackV1Message** | [**RollbackV1Message**](RollbackV1Message.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

