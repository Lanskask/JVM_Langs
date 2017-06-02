package groovy.ru.smurtazin.functesting;

import geb.Page

class MainWikiPage extends Page {
  static url = "http://ru.wikipedia.org/"
  static at = {title == "Википедия — свободная энциклопедия"}
  static content = {
    searchField { $("input", id: "searchInput")}
    searchButton (to: FunctionalTestingWikiPage) { $("button", id: "searchButton")}
  }
}
