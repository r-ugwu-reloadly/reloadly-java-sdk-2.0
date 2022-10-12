/*
 * ReloadlySdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.reloadly.auth.controllers;

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
public final class AirtimeCountriesController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public AirtimeCountriesController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  accept  Required parameter: Example: application/com.reloadly.topups-v1+json
     * @param  authorization  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyAirtimeCountries(
            final String accept,
            final String authorization) throws ApiException, IOException {
        HttpRequest request = buildReloadlyAirtimeCountriesRequest(accept, authorization);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyAirtimeCountriesResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example: application/com.reloadly.topups-v1+json
     * @param  authorization  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyAirtimeCountriesAsync(
            final String accept,
            final String authorization) {
        return makeHttpCallAsync(() -> buildReloadlyAirtimeCountriesRequest(accept, authorization),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyAirtimeCountriesResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyAirtimeCountries.
     */
    private HttpRequest buildReloadlyAirtimeCountriesRequest(
            final String accept,
            final String authorization) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.AIRTIME);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/countries");

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
     * Processes the response for reloadlyAirtimeCountries.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyAirtimeCountriesResponse(
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

    /**
     * @param  accept  Required parameter: Example: application/com.reloadly.topups-v1+json
     * @param  authorization  Required parameter: Example:
     * @param  countrycode  Required parameter: The country's ISO Code.
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyAirtimeCountryByIso(
            final String accept,
            final String authorization,
            final String countrycode) throws ApiException, IOException {
        HttpRequest request = buildReloadlyAirtimeCountryByIsoRequest(accept, authorization,
                countrycode);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyAirtimeCountryByIsoResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example: application/com.reloadly.topups-v1+json
     * @param  authorization  Required parameter: Example:
     * @param  countrycode  Required parameter: The country's ISO Code.
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyAirtimeCountryByIsoAsync(
            final String accept,
            final String authorization,
            final String countrycode) {
        return makeHttpCallAsync(() -> buildReloadlyAirtimeCountryByIsoRequest(accept,
                authorization, countrycode),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyAirtimeCountryByIsoResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyAirtimeCountryByIso.
     */
    private HttpRequest buildReloadlyAirtimeCountryByIsoRequest(
            final String accept,
            final String authorization,
            final String countrycode) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.AIRTIME);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/countries/{countrycode}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("countrycode",
                new SimpleEntry<Object, Boolean>(countrycode, true));
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
     * Processes the response for reloadlyAirtimeCountryByIso.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyAirtimeCountryByIsoResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Full authentication is required to access this resource",
                    context);
        }
        if (responseCode == 404) {
            throw new ApiException("Country not found and/or not currently supported", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

}