Feature: BookStore feature
Scenario: Correct non-zero number of books found by author with transformer
Given I have the following books in the store with transformer
  | title                                | author      |
  | The Devil in the White City          | Erik Larson |
  | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
  | In the Garden of Beasts              | Erik Larson |
When I search for books by author Erik Larson
Then I find 2 books
