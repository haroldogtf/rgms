package pages.thesis

import pages.FormPage
import pages.GetPageTitle

class ThesisSearchPage extends FormPage {
    static url = "tese/search"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def currentTese = gp.msg("default.tese.label")
        def currentTitle = gp.msg("default.search.label", [currentTese])
        title ==~ currentTitle
    }

    def fillTitleInSearchDetails(title) {
        $("form").title = title
    }

    def fillThesisSearchDetails(title, initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school) {
        fillTitleInSearchDetails(title)
        fillSomeDetaisInSearch(initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school)
    }

    def fillSomeDetaisInSearch(initialDay, initialMonth, initialYear, endDay, endMonth, endYear, school)  {
        $("form").publicationInitialDate_day= initialDay
        $("form").publicationInitialDate_month = initialMonth
        $("form").publicationInitialDate_year = initialYear
        $("form").publicationEndDate_day= endDay
        $("form").publicationEndDate_month = endMonth
        $("form").publicationEndDate_year = endYear
        $("form").school = school
    }

    def searchTheses() {
        $("input", id:"search").click()
    }

    def selectTitleInPreviousSearch(input) {
        $("form").title = input
        $("ul", class:"ui-autocomplete").find("li")[0].click()
    }
}