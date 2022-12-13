package get_requests;

import base_urls.GoRestBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.GoRestDataPojo;
import pojos.GoRestPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get13Pojo extends GoRestBaseUrl {
    /*
     Given
         https://gorest.co.in/public/v1/users/131
     When
         User send GET Request to the URL
     Then
         Status Code should be 200
     And
         Response body should be like
                     {
                         "meta": null,
                         "data": {
                             "id": 131,
                             "name": "Prem Pilla",
                             "email": "pilla_prem@mueller.info",
                             "gender": "female",
                             "status": "active"
                         }
                     }
 */


}
