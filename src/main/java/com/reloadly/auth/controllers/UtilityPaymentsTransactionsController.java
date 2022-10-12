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
public final class UtilityPaymentsTransactionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public UtilityPaymentsTransactionsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  referenceId  Optional parameter: The reference ID you may have specified while
     *         placing the transaction.
     * @param  page  Optional parameter: The page to be retrieved from the transaction list.
     * @param  size  Optional parameter: Number of items to include in a single page.
     * @param  startDate  Optional parameter: Indicates the start date for the range of transactions
     *         to be retrieved.
     * @param  endDate  Optional parameter: Indicates the end date for the range of transactions to
     *         be retrieved.
     * @param  status  Optional parameter: The transaction's status. Can be either PROCESSING,
     *         SUCCESSFUL, FAILED, or REFUNDED.
     * @param  serviceType  Optional parameter: The biller's service type. Can be either PREPAID or
     *         POSTPAID.
     * @param  billerType  Optional parameter: The biller's type. Can be either
     *         ELECTRICITY_BILL_PAYMENT, WATER_BILL_PAYMENT, TV_BILL_PAYMENT, or
     *         INTERNET_BILL_PAYMENT
     * @param  billerCountryCode  Optional parameter: Indicates the ISO code of the country where
     *         the biller is located.
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyUtilityPaymentsTransactions(
            final String accept,
            final String authorization,
            final String referenceId,
            final Integer page,
            final Integer size,
            final String startDate,
            final String endDate,
            final String status,
            final String serviceType,
            final String billerType,
            final String billerCountryCode) throws ApiException, IOException {
        HttpRequest request = buildReloadlyUtilityPaymentsTransactionsRequest(accept, authorization,
                referenceId, page, size, startDate, endDate, status, serviceType, billerType,
                billerCountryCode);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyUtilityPaymentsTransactionsResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  referenceId  Optional parameter: The reference ID you may have specified while
     *         placing the transaction.
     * @param  page  Optional parameter: The page to be retrieved from the transaction list.
     * @param  size  Optional parameter: Number of items to include in a single page.
     * @param  startDate  Optional parameter: Indicates the start date for the range of transactions
     *         to be retrieved.
     * @param  endDate  Optional parameter: Indicates the end date for the range of transactions to
     *         be retrieved.
     * @param  status  Optional parameter: The transaction's status. Can be either PROCESSING,
     *         SUCCESSFUL, FAILED, or REFUNDED.
     * @param  serviceType  Optional parameter: The biller's service type. Can be either PREPAID or
     *         POSTPAID.
     * @param  billerType  Optional parameter: The biller's type. Can be either
     *         ELECTRICITY_BILL_PAYMENT, WATER_BILL_PAYMENT, TV_BILL_PAYMENT, or
     *         INTERNET_BILL_PAYMENT
     * @param  billerCountryCode  Optional parameter: Indicates the ISO code of the country where
     *         the biller is located.
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsTransactionsAsync(
            final String accept,
            final String authorization,
            final String referenceId,
            final Integer page,
            final Integer size,
            final String startDate,
            final String endDate,
            final String status,
            final String serviceType,
            final String billerType,
            final String billerCountryCode) {
        return makeHttpCallAsync(() -> buildReloadlyUtilityPaymentsTransactionsRequest(accept,
                authorization, referenceId, page, size, startDate, endDate, status, serviceType,
                billerType, billerCountryCode),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyUtilityPaymentsTransactionsResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyUtilityPaymentsTransactions.
     */
    private HttpRequest buildReloadlyUtilityPaymentsTransactionsRequest(
            final String accept,
            final String authorization,
            final String referenceId,
            final Integer page,
            final Integer size,
            final String startDate,
            final String endDate,
            final String status,
            final String serviceType,
            final String billerType,
            final String billerCountryCode) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.UTILITY_PAYMENTS);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/transactions");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("referenceId", referenceId);
        queryParameters.put("page", page);
        queryParameters.put("size", size);
        queryParameters.put("startDate", startDate);
        queryParameters.put("endDate", endDate);
        queryParameters.put("status", status);
        queryParameters.put("serviceType", serviceType);
        queryParameters.put("billerType", billerType);
        queryParameters.put("billerCountryCode", billerCountryCode);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept", accept);
        headers.add("Authorization", authorization);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        return request;
    }

    /**
     * Processes the response for reloadlyUtilityPaymentsTransactions.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyUtilityPaymentsTransactionsResponse(
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
     * @param  id  Required parameter: The utility payment's identification number.
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse reloadlyUtilityPaymentsTransactionById(
            final String accept,
            final String authorization,
            final int id) throws ApiException, IOException {
        HttpRequest request = buildReloadlyUtilityPaymentsTransactionByIdRequest(accept,
                authorization, id);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReloadlyUtilityPaymentsTransactionByIdResponse(context);
    }

    /**
     * @param  accept  Required parameter: Example:
     * @param  authorization  Required parameter: Example:
     * @param  id  Required parameter: The utility payment's identification number.
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsTransactionByIdAsync(
            final String accept,
            final String authorization,
            final int id) {
        return makeHttpCallAsync(() -> buildReloadlyUtilityPaymentsTransactionByIdRequest(accept,
                authorization, id),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReloadlyUtilityPaymentsTransactionByIdResponse(context));
    }

    /**
     * Builds the HttpRequest object for reloadlyUtilityPaymentsTransactionById.
     */
    private HttpRequest buildReloadlyUtilityPaymentsTransactionByIdRequest(
            final String accept,
            final String authorization,
            final int id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.UTILITY_PAYMENTS);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/transactions/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
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
     * Processes the response for reloadlyUtilityPaymentsTransactionById.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReloadlyUtilityPaymentsTransactionByIdResponse(
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