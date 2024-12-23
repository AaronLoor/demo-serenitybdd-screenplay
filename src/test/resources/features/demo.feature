Feature: Angular demo application test

  Scenario Outline: Successful Client Registration

    Given Aaron accesses the page and enters user "<username>" and password "<password>" and click on the login button
    When he enters the following registration data
      | name   | last_name   | id   | date_birth   | phone   | marital_status   | email   | gender   | address   |
      | <name> | <last_name> | <id> | <date_birth> | <phone> | <marital_status> | <email> | <gender> | <address> |
    And he click on the register button
    Then he should see successful login notification message "<message>"

    Examples:
      | username | password  | name          | last_name      | id         | date_birth | phone      | marital_status | email                          | gender | address             | message                                     |
      | aaron    | password  | Jorge Rodolfo | Zambrano Pilar | 1234567890 | 18/06/1998 | 0987654321 | Married        | jorge.zambrano@serenitybdd.com | Male   | Quito - Ecuador     | Client entered correctly                    |
      | aaron    | password  | Maria Isabela | Cusme Moran    | test       | 18/06/2000 | 098764523  | Single         | maria.cusme@serenitybdd.com    | Female | Guayaquil - Ecuador | The data entered is not valid               |
      | aaron    | password  |               |                |            |            |            |                |                                |        |                     | Please verify the information and try again |
      | test     | incorrect | Pedro Felipe  | Balda Montes   | 1234567890 | 18/06/1980 | 0987654321 | Widower        | pedro.montes@serenitybdd.com   | Male   | Cuenca - Ecuador    | Client entered correctly                    |
      | aaron    | password  | Alex Dario    | Manzaba Pino   | 123734890  | 18/06/2002 | test       | Married        | pedro.montes@serenitybdd.com   | Male   | Manabi - Ecuador    | Client entered correctly                    |







