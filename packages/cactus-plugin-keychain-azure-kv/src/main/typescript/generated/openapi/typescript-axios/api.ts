/* tslint:disable */
/* eslint-disable */
/**
 * Hyperledger Cactus - Keychain API
 * Contains/describes the Keychain API types/paths for Hyperledger Cactus.
 *
 * The version of the OpenAPI document: 0.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Configuration } from './configuration';
import globalAxios, { AxiosPromise, AxiosInstance } from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from './base';

/**
 * 
 * @export
 * @interface DeleteKeychainEntryRequestV1
 */
export interface DeleteKeychainEntryRequestV1 {
    /**
     * The key for the entry to check the presence of on the keychain.
     * @type {string}
     * @memberof DeleteKeychainEntryRequestV1
     */
    key: string;
}
/**
 * 
 * @export
 * @interface DeleteKeychainEntryResponseV1
 */
export interface DeleteKeychainEntryResponseV1 {
    /**
     * The key that was deleted from the keychain.
     * @type {string}
     * @memberof DeleteKeychainEntryResponseV1
     */
    key: string;
}
/**
 * 
 * @export
 * @interface GetKeychainEntryRequest
 */
export interface GetKeychainEntryRequest {
    /**
     * The key for the entry to get from the keychain.
     * @type {string}
     * @memberof GetKeychainEntryRequest
     */
    key: string;
}
/**
 * 
 * @export
 * @interface GetKeychainEntryResponse
 */
export interface GetKeychainEntryResponse {
    /**
     * The key that was used to retrieve the value from the keychain.
     * @type {string}
     * @memberof GetKeychainEntryResponse
     */
    key: string;
    /**
     * The value associated with the requested key on the keychain.
     * @type {string}
     * @memberof GetKeychainEntryResponse
     */
    value: string;
}
/**
 * 
 * @export
 * @interface HasKeychainEntryRequestV1
 */
export interface HasKeychainEntryRequestV1 {
    /**
     * The key to check for presence in the keychain.
     * @type {string}
     * @memberof HasKeychainEntryRequestV1
     */
    key: string;
}
/**
 * 
 * @export
 * @interface HasKeychainEntryResponseV1
 */
export interface HasKeychainEntryResponseV1 {
    /**
     * The key that was used to check the presence of the value in the entry store.
     * @type {string}
     * @memberof HasKeychainEntryResponseV1
     */
    key: string;
    /**
     * Date and time encoded as JSON when the presence check was performed by the plugin backend.
     * @type {string}
     * @memberof HasKeychainEntryResponseV1
     */
    checkedAt: string;
    /**
     * The boolean true or false indicating the presence or absence of an entry under \'key\'.
     * @type {boolean}
     * @memberof HasKeychainEntryResponseV1
     */
    isPresent: boolean;
}
/**
 * 
 * @export
 * @interface SetKeychainEntryRequest
 */
export interface SetKeychainEntryRequest {
    /**
     * The key for the entry to set on the keychain.
     * @type {string}
     * @memberof SetKeychainEntryRequest
     */
    key: string;
    /**
     * The value that will be associated with the key on the keychain.
     * @type {string}
     * @memberof SetKeychainEntryRequest
     */
    value: string;
}
/**
 * 
 * @export
 * @interface SetKeychainEntryResponse
 */
export interface SetKeychainEntryResponse {
    /**
     * The key that was used to set the value on the keychain.
     * @type {string}
     * @memberof SetKeychainEntryResponse
     */
    key: string;
}

/**
 * DefaultApi - axios parameter creator
 * @export
 */
export const DefaultApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Deletes a value under a key on the keychain backend.
         * @param {DeleteKeychainEntryRequestV1} deleteKeychainEntryRequestV1 Request body to delete a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteKeychainEntryV1: async (deleteKeychainEntryRequestV1: DeleteKeychainEntryRequestV1, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'deleteKeychainEntryRequestV1' is not null or undefined
            assertParamExists('deleteKeychainEntryV1', 'deleteKeychainEntryRequestV1', deleteKeychainEntryRequestV1)
            const localVarPath = `/api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/delete-keychain-entry`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(deleteKeychainEntryRequestV1, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Retrieves the contents of a keychain entry from the backend.
         * @param {GetKeychainEntryRequest} getKeychainEntryRequest Request body to obtain a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getKeychainEntryV1: async (getKeychainEntryRequest: GetKeychainEntryRequest, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'getKeychainEntryRequest' is not null or undefined
            assertParamExists('getKeychainEntryV1', 'getKeychainEntryRequest', getKeychainEntryRequest)
            const localVarPath = `/api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/get-keychain-entry`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(getKeychainEntryRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Checks that an entry exists under a key on the keychain backend
         * @param {HasKeychainEntryRequestV1} hasKeychainEntryRequestV1 Request body for checking a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        hasKeychainEntryV1: async (hasKeychainEntryRequestV1: HasKeychainEntryRequestV1, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'hasKeychainEntryRequestV1' is not null or undefined
            assertParamExists('hasKeychainEntryV1', 'hasKeychainEntryRequestV1', hasKeychainEntryRequestV1)
            const localVarPath = `/api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/has-keychain-entry`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(hasKeychainEntryRequestV1, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Sets a value under a key on the keychain backend.
         * @param {SetKeychainEntryRequest} setKeychainEntryRequest Request body to write/update a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        setKeychainEntryV1: async (setKeychainEntryRequest: SetKeychainEntryRequest, options: any = {}): Promise<RequestArgs> => {
            // verify required parameter 'setKeychainEntryRequest' is not null or undefined
            assertParamExists('setKeychainEntryV1', 'setKeychainEntryRequest', setKeychainEntryRequest)
            const localVarPath = `/api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/set-keychain-entry`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter, options.query);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(setKeychainEntryRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DefaultApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Deletes a value under a key on the keychain backend.
         * @param {DeleteKeychainEntryRequestV1} deleteKeychainEntryRequestV1 Request body to delete a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteKeychainEntryV1(deleteKeychainEntryRequestV1: DeleteKeychainEntryRequestV1, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<DeleteKeychainEntryResponseV1>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.deleteKeychainEntryV1(deleteKeychainEntryRequestV1, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Retrieves the contents of a keychain entry from the backend.
         * @param {GetKeychainEntryRequest} getKeychainEntryRequest Request body to obtain a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getKeychainEntryV1(getKeychainEntryRequest: GetKeychainEntryRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<GetKeychainEntryResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getKeychainEntryV1(getKeychainEntryRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Checks that an entry exists under a key on the keychain backend
         * @param {HasKeychainEntryRequestV1} hasKeychainEntryRequestV1 Request body for checking a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async hasKeychainEntryV1(hasKeychainEntryRequestV1: HasKeychainEntryRequestV1, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<HasKeychainEntryResponseV1>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.hasKeychainEntryV1(hasKeychainEntryRequestV1, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Sets a value under a key on the keychain backend.
         * @param {SetKeychainEntryRequest} setKeychainEntryRequest Request body to write/update a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async setKeychainEntryV1(setKeychainEntryRequest: SetKeychainEntryRequest, options?: any): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<SetKeychainEntryResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.setKeychainEntryV1(setKeychainEntryRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DefaultApiFp(configuration)
    return {
        /**
         * 
         * @summary Deletes a value under a key on the keychain backend.
         * @param {DeleteKeychainEntryRequestV1} deleteKeychainEntryRequestV1 Request body to delete a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteKeychainEntryV1(deleteKeychainEntryRequestV1: DeleteKeychainEntryRequestV1, options?: any): AxiosPromise<DeleteKeychainEntryResponseV1> {
            return localVarFp.deleteKeychainEntryV1(deleteKeychainEntryRequestV1, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Retrieves the contents of a keychain entry from the backend.
         * @param {GetKeychainEntryRequest} getKeychainEntryRequest Request body to obtain a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getKeychainEntryV1(getKeychainEntryRequest: GetKeychainEntryRequest, options?: any): AxiosPromise<GetKeychainEntryResponse> {
            return localVarFp.getKeychainEntryV1(getKeychainEntryRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Checks that an entry exists under a key on the keychain backend
         * @param {HasKeychainEntryRequestV1} hasKeychainEntryRequestV1 Request body for checking a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        hasKeychainEntryV1(hasKeychainEntryRequestV1: HasKeychainEntryRequestV1, options?: any): AxiosPromise<HasKeychainEntryResponseV1> {
            return localVarFp.hasKeychainEntryV1(hasKeychainEntryRequestV1, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Sets a value under a key on the keychain backend.
         * @param {SetKeychainEntryRequest} setKeychainEntryRequest Request body to write/update a keychain entry via its key
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        setKeychainEntryV1(setKeychainEntryRequest: SetKeychainEntryRequest, options?: any): AxiosPromise<SetKeychainEntryResponse> {
            return localVarFp.setKeychainEntryV1(setKeychainEntryRequest, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * 
     * @summary Deletes a value under a key on the keychain backend.
     * @param {DeleteKeychainEntryRequestV1} deleteKeychainEntryRequestV1 Request body to delete a keychain entry via its key
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public deleteKeychainEntryV1(deleteKeychainEntryRequestV1: DeleteKeychainEntryRequestV1, options?: any) {
        return DefaultApiFp(this.configuration).deleteKeychainEntryV1(deleteKeychainEntryRequestV1, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Retrieves the contents of a keychain entry from the backend.
     * @param {GetKeychainEntryRequest} getKeychainEntryRequest Request body to obtain a keychain entry via its key
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getKeychainEntryV1(getKeychainEntryRequest: GetKeychainEntryRequest, options?: any) {
        return DefaultApiFp(this.configuration).getKeychainEntryV1(getKeychainEntryRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Checks that an entry exists under a key on the keychain backend
     * @param {HasKeychainEntryRequestV1} hasKeychainEntryRequestV1 Request body for checking a keychain entry via its key
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public hasKeychainEntryV1(hasKeychainEntryRequestV1: HasKeychainEntryRequestV1, options?: any) {
        return DefaultApiFp(this.configuration).hasKeychainEntryV1(hasKeychainEntryRequestV1, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Sets a value under a key on the keychain backend.
     * @param {SetKeychainEntryRequest} setKeychainEntryRequest Request body to write/update a keychain entry via its key
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public setKeychainEntryV1(setKeychainEntryRequest: SetKeychainEntryRequest, options?: any) {
        return DefaultApiFp(this.configuration).setKeychainEntryV1(setKeychainEntryRequest, options).then((request) => request(this.axios, this.basePath));
    }
}

