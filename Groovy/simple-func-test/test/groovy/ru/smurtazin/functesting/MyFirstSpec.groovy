package groovy.ru.smurtazin.functesting;

import geb.spock.GebSpec

class MyFirstSpec extends GebSpec {

  def "test search functional testing wiki page"() {
    given: "we are at main wiki page"
    to MainWikiPage

    when: "try to search functional testing page"
    searchField.value("Функциональное тестирование")
    searchButton.click()

    then: "check we are on functional testing page"
    at FunctionalTestingWikiPage
  }
}
