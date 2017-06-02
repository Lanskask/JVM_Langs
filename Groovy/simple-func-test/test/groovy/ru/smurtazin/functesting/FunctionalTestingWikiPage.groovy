package groovy.ru.smurtazin.functesting;

import geb.Page;

class FunctionalTestingWikiPage extends Page {

  static at = { 
  	$().text().contains(
  		"Функциональное тестирование — это тестирование ПО в целях проверки реализуемости функциональных требований"
  		) 
  };
}
