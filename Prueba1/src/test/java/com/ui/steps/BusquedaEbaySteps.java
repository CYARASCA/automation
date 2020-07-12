package com.ui.steps;

import com.ui.driver.BaseDriver;
import com.ui.pages.BusquedaEbayPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaEbaySteps extends BaseDriver {
    BusquedaEbayPage busqueda_ebay = new BusquedaEbayPage(driver);

    @Given("ingreso a la web de {string}")
    public void ingreso_a_la_web_de(String url) {
        // Write code here that turns the phrase above into concrete actions
        busqueda_ebay.go_url(url);
    }

    @When("realizo una busqueda de {string}")
    public void realizo_una_busqueda_de(String producto) {
        // Write code here that turns the phrase above into concrete actions
        busqueda_ebay.buscarProducto(producto);

    }

    @When("elijo la talla {int}")
    public void elijo_la_talla(int talla) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        busqueda_ebay.elegirTalla();
    }

    @When("elijo la marca {string}")
    public void elijo_la_marca(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("visualizo los resultados")
    public void visualizo_los_resultados() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("obtengo el precio")
    public void obtengo_el_precio() {
        // Write code here that turns the phrase above into concrete actions
    }
}

