
Feature: To Search hotel on the specific date


  Scenario: Search hotel By providing the Specific requirements
    When Selecting the Location 
    And Selecting the HotelName
    And Selecting the Location 
    And Selecting the RoomType 
    And Selecting the NumberOfRooms 
    Then Provide the CheckInDate 
    And Provide the CheckOutDate 
    And Adding the AdultsPerRoom
    And Adding the ChildPerRoom
    Then Click the SearchButton
    And Customer shoud Navigate in success to the NextPage
