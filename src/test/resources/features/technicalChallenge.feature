#Author Jorge Gómez

@stories
Feature: Technical Challenge
  As a user, I want to automate the Utest page in a screenplay to perform the technical challenge

  @Scenario1
    Scenario Outline:
     Given than Jorge wants to create account in the Utest page
       | strF_name   | strL_name   | strEmail   |
       | <strF_name> | <strL_name> | <strEmail> |

      When he configure the address and device module
        |strCity   | strZip    | strPassword   | strDevice   | strModel  |
        |<strCity> | <strZip>  | <strPassword> | <strDevice> | <strModel>|

      Then he creates the password and finish the form

    Examples:
      | strF_name   | strL_name   | strEmail              |strCity   | strZip    | strPassword   | strDevice   | strModel    |
      | Jorge       | Gómez       | example2000@gmail.com |Medellín  | 050007    | Choucair2021  | Xiaomi      | Redmi Note 9|
