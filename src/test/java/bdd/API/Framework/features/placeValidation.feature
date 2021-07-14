Feature: Validating Place API's
  Scenario: Verify if Place is being Succsesfully added using AddPlaceAPI
    Given Add Place Payload
    When user calls "AddPlaceAPI" with Post http request
    Then the API call got succeess with status code 200

