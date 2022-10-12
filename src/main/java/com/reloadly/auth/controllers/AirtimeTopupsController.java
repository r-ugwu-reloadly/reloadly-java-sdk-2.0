/*
 * ReloadlySdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.reloadly.auth.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reloadly.auth.ApiHelper;
import com.reloadly.auth.AuthManager;
import com.reloadly.auth.Configuration;
import com.reloadly.auth.Server;
import com.reloadly.auth.exceptions.ApiException;
import com.reloadly.auth.http.Headers;
import com.reloadly.auth.http.client.HttpClient;
import com.reloadly.auth.http.client.HttpContext;
import com.reloadly.auth.http.request.HttpRequest;
import com.reloadly.auth.http.response.HttpResponse;
import com.reloadly.auth.http.response.HttpStringResponse;
import com.reloadly.auth.models.DynamicResponse;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class AirtimeTopupsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public AirtimeTopupsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyAirtimeAsyncTopup(
            final String accept,
            final String authorization,
            final Object body) throws ApiException, IOException {
        HttpRequest request = buildReloadlyAirtimeAsyncTopupRequest(accept, authorization, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyAirtimeAsyncTopupResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyAirtimeAsyncTopupAsync(
            final String accept,
            final String authorization,
            final Object body) {
        return makeHttpCallAsync(() -> buildReloadlyAirtimeAsyncTopupRequest(accept, authorization,
                body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyAirtimeAsyncTopupResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyAirtimeAsyncTopup.
     */
    private HttpRequest buildReloadlyAirtimeAsyncTopupRequest(
            final String accept,
            final String authorization,
            final Object body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.AIRTIME);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/topups-async");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept", accept);
        headers.add("Authorization", authorization);
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for reloadlyAirtimeAsyncTopup.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyAirtimeAsyncTopupResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ApiException("Recipient phone number is not valid", context);
        }
        if (responseCode == 401) {
            throw new ApiException("Full authentication is required to access this resource",
                    context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyAirtimeTopup(
            final String accept,
            final String authorization,
            final Object body) throws ApiException, IOException {
        HttpRequest request = buildReloadlyAirtimeTopupRequest(accept, authorization, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyAirtimeTopupResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyAirtimeTopupAsync(
            final String accept,
            final String authorization,
            final Object body) {
        return makeHttpCallAsync(() -> buildReloadlyAirtimeTopupRequest(accept, authorization,
                body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyAirtimeTopupResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyAirtimeTopup.
     */
    private HttpRequest buildReloadlyAirtimeTopupRequest(
            final String accept,
            final String authorization,
            final Object body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.AIRTIME);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/topups");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept", accept);
        headers.add("Authorization", authorization);
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for reloadlyAirtimeTopup.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyAirtimeTopupResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ApiException("Recipient phone number is not valid", context);
        }
        if (responseCode == 401) {
            throw new ApiException("Full authentication is required to access this resource",
                    context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  transactionid  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyAirtimeTopupStatus(
            final String accept,
            final String authorization,
            final String transactionid) throws ApiException, IOException {
        HttpRequest request = buildReloadlyAirtimeTopupStatusRequest(accept, authorization,
                transactionid);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyAirtimeTopupStatusResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  transactionid  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyAirtimeTopupStatusAsync(
            final String accept,
            final String authorization,
            final String transactionid) {
        return makeHttpCallAsync(() -> buildReloadlyAirtimeTopupStatusRequest(accept, authorization,
                transactionid),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyAirtimeTopupStatusResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyAirtimeTopupStatus.
     */
    private HttpRequest buildReloadlyAirtimeTopupStatusRequest(
            final String accept,
            final String authorization,
            final String transactionid) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.AIRTIME);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/topups/{transactionid}/status");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("transactionid",
                new SimpleEntry<Object, Boolean>(transactionid, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept", accept);
        headers.add("Authorization", authorization);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for reloadlyAirtimeTopupStatus.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyAirtimeTopupStatusResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Full authentication is required to access this resource",
                    context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

}