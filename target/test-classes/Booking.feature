Feature: Men bir user olaraq booking yaratmaq isteyirem

  Scenario: Men bir user olaraq booking yaradib sile bilim
    Given User yeni bir booking yaradir
    And User create ucun lazim olan datani verir
    When Booking create
    Then Assertions
    And Booking ugurlu sekilde yaradildi

  Scenario: 2ci ssenari
    Given User yeni bir booking yaradir
    And User create ucun lazim olan datani verir
    When Booking create
    Then Assertions
    And Booking ugurlu sekilde yaradildi