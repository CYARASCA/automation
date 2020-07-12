Feature: Busqueda - Buscar producto en Ebay

  @tag1
  Scenario:  Obtener el precio de una zapatilla marca ADIDAS de talla 9 desde Ebay
    Given ingreso a la web de "https://www.ebay.com/"
    When realizo una busqueda de "zapatilla"
    And elijo la talla 9
    And elijo la marca "ADIDAS"
    Then visualizo los resultados
    And obtengo el precio
