package steps;

import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    SearchSteps searchSteps = new SearchSteps();
    FilterSteps filterSteps = new FilterSteps();
    ReportSteps reportSteps = new ReportSteps();

    @When("^выбран раздел \"(.+)\"$")
    public void selectSect(String nameElement) {
        try {
            searchSteps.selectSect(nameElement);
        }catch (Exception e){
            new Exception();
        }
    }

    @When("^выбрана категория \"(.+)\"$")
    public void selectCategory(String nameElement) {
        searchSteps.selectCategory(nameElement);
    }

    @When("^выбран раздел электроники: \"(.+)\"$")
    public void selectEletronic(String nameElement) {
        searchSteps.selectEletronic(nameElement);
    }

    @When("^заголовок страницы - \"(.+)\"$")
    public void checkTitleDMSPage(String title) {
        searchSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку фильтры$")
    public void selectFilter() {
        filterSteps.selectFilter();
    }

    @When("^введено значение цены до: \"(.+)\"$")
    public void setInputPriceTo(String price) {
        filterSteps.setInputPriceTo(price);
    }

    @When("^выбраны производители \"(.+)\"$")
    public void selectManufacturer(List<String> price) {
        filterSteps.selectManufacturer(price);
    }

    @When("^выполнено нажатие на кнопку показать подходящие$")
    public void showList() {
        filterSteps.showList();
    }

    @When("^выполнено нажатие на кнопку показать по 12, если существует кнопка и проверяем кол-во элментов$")
    public void searchButton12() {
        reportSteps.searchButton12();
    }

    @When("^проверяем есть ли элемент в результате поиска$")
    public void check() {
        reportSteps.check();
    }
}
