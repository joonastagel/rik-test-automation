@navigation
Feature: RIK Homepage Navigation

    Scenario Outline: User clicks <categoryNavLink> navigation link on RIK homepage
    Given User is on RIK home page
    When User clicks "<categoryNavLink>" navigation link
    Then User is navigated to "<pageTitle>" info page

    Examples:
    | categoryNavLink      | pageTitle            |
    | E-ÄRIREGISTER        | e-äriregister        |
    | EUROOPA ÄRIREGISTER  | Euroopa äriregister  |
    | E-KINNISTUSRAAMAT    | e-kinnistusraamat    |
    | E-ARVELDAJA          | e-arveldaja          |
    | KINNISTUPORTAAL      | Kinnistuportaal      |
    | KARISTUSREGISTER     | Karistusregister     |
    | E-TOIMIK             | E-toimik             |
    | RIIGI TEATAJA        | Riigi Teataja        |
    | AMETLIKUD TEADAANDED | Ametlikud Teadaanded |
    | MUUD TEENUSED        | Muud teenused        |
