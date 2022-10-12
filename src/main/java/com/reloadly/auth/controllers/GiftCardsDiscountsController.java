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
public final class GiftCardsDiscountsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public GiftCardsDiscountsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  size  Optional parameter: Indicates the number of gift card products offering
     *         discounts to be retrieved on a page.
     * @param  page  Optional parameter: Indicates the page of the list of gift card products
     *         offering discounts.
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyGiftCardsDiscounts(
            final String accept,
            final String authorization,
            final String size,
            final String page) throws ApiException, IOException {
        HttpRequest request = buildReloadlyGiftCardsDiscountsRequest(accept, authorization, size,
                page);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyGiftCardsDiscountsResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  size  Optional parameter: Indicates the number of gift card products offering
     *         discounts to be retrieved on a page.
     * @param  page  Optional parameter: Indicates the page of the list of gift card products
     *         offering discounts.
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyGiftCardsDiscountsAsync(
            final String accept,
            final String authorization,
            final String size,
            final String page) {
        return makeHttpCallAsync(() -> buildReloadlyGiftCardsDiscountsRequest(accept, authorization,
                size, page),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyGiftCardsDiscountsResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyGiftCardsDiscounts.
     */
    private HttpRequest buildReloadlyGiftCardsDiscountsRequest(
            final String accept,
            final String authorization,
            final String size,
            final String page) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.GIFT_CARDS);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/discounts");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("size",
                new SimpleEntry<Object, Boolean>(size, true));
        templateParameters.put("page",
                new SimpleEntry<Object, Boolean>(page, true));
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
     * Processes the response for reloadlyGiftCardsDiscounts.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyGiftCardsDiscountsResponse(
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
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  productid  Required parameter: The product's identification number.
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyGiftCardsDiscountByProductId(
            final String accept,
            final String authorization,
            final String productid) throws ApiException, IOException {
        HttpRequest request = buildReloadlyGiftCardsDiscountByProductIdRequest(accept,
                authorization, productid);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyGiftCardsDiscountByProductIdResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  productid  Required parameter: The product's identification number.
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyGiftCardsDiscountByProductIdAsync(
            final String accept,
            final String authorization,
            final String productid) {
        return makeHttpCallAsync(() -> buildReloadlyGiftCardsDiscountByProductIdRequest(accept,
                authorization, productid),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyGiftCardsDiscountByProductIdResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyGiftCardsDiscountByProductId.
     */
    private HttpRequest buildReloadlyGiftCardsDiscountByProductIdRequest(
            final String accept,
            final String authorization,
            final String productid) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.GIFT_CARDS);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/{productid}/discounts");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("productid",
                new SimpleEntry<Object, Boolean>(productid, true));
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
     * Processes the response for reloadlyGiftCardsDiscountByProductId.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyGiftCardsDiscountByProductIdResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Full authentication is required to access this resource",
                    context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

}